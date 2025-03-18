package br.com.fiap.jobs_fiap_esg.screens

import android.app.AlertDialog
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import br.com.fiap.jobs_fiap_esg.components.BottomNavBar
import br.com.fiap.jobs_fiap_esg.data.vagaDescricao
import br.com.fiap.jobs_fiap_esg.data.vagasDisponiveis
import br.com.fiap.jobs_fiap_esg.data.vagasSalvas


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun JobDetailScreen(navController: NavController) {
    // Recuperar o jobId dos argumentos de navegação
    val jobIdString = navController.currentBackStackEntry?.arguments?.getString("jobId") ?: "1"
    val jobId = jobIdString.toIntOrNull() ?: 1
    val vaga = remember(jobId) {
        vagaDescricao.find { it.id == jobId } ?: vagaDescricao.first()
    }

   val builder: AlertDialog.Builder = AlertDialog.Builder( navController.context)
    builder
        .setMessage("Candidatura enviada com sucesso!")
        .setTitle("Parabens!")

    val dialog: AlertDialog = builder.create()





    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(vaga.titulo) },
                navigationIcon = {
                    IconButton(onClick = { navController.popBackStack() }) {
                        Icon(
                            imageVector = Icons.Default.ArrowBack,
                            contentDescription = "Voltar"
                        )
                    }
                }
            )
        },
        bottomBar = {
            Column {
                Button(onClick = {
                        vagasSalvas.add(jobId)
                        dialog.show()

                    }, modifier = Modifier
                        .fillMaxWidth()
                        .padding(16.dp)
                        .height(56.dp), colors = ButtonDefaults.buttonColors(
                        containerColor = Color(0xFF6750A4)
                    ), shape = MaterialTheme.shapes.medium) {
                    Text("Enviar candidatura", fontSize = 16.sp)
                }
                BottomNavBar(navController = navController)
            }
        }
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .padding(innerPadding)
                .fillMaxSize()
                .verticalScroll(rememberScrollState())
                .padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            // Seção da empresa
            Text(
                text = "Empresa: ${vaga.empresa}",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold
            )
            
            // Informações básicas
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(vaga.tipoTrabalho)
                Text(vaga.tipoContrato)
                Text(vaga.salario)
            }
            
            // Descrição
            JobSection(title = "Descrição") {
                vaga.descricao.forEach { paragrafo ->
                    Text(text = paragrafo)
                }
            }
            
            // Requisitos
            JobSection(title = "Requisitos") {
                vaga.requisitos.forEach { requisito ->
                    ListItem(text = requisito)
                }
            }
            
            // Benefícios
            JobSection(title = "Benefícios") {
                vaga.beneficios.forEach { beneficio ->
                    ListItem(text = beneficio)
                }
            }
            
            // Atividades
            JobSection(title = "Atividades") {
                vaga.atividades.forEach { atividade ->
                    BulletListItem(text = atividade)
                }
            }
        }
    }
}



@Composable
fun JobSection(title: String, content: @Composable () -> Unit) {
    Column(verticalArrangement = Arrangement.spacedBy(8.dp)) {
        Text(
            text = title,
            fontSize = 18.sp,
            fontWeight = FontWeight.Bold
        )
        content()
    }
}

@Composable
fun ListItem(text: String) {
    Surface(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 4.dp),
        color = Color(0xFFF6EFFE),
        shape = MaterialTheme.shapes.small
    ) {
        Text(
            text = text,
            modifier = Modifier.padding(12.dp)
        )
    }
}

@Composable
fun BulletListItem(text: String) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 4.dp),
        verticalAlignment = Alignment.Top
    ) {
        Text(
            text = "• ",
            fontWeight = FontWeight.Bold
        )
        Text(text = text)
    }
}