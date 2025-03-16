 package br.com.fiap.jobs_fiap_esg.screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import br.com.fiap.jobs_fiap_esg.components.BottomNavBar

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun JobDetailScreen(navController: NavController) {
    // Recuperar o jobId dos argumentos de navegação
    val jobId = navController.currentBackStackEntry?.arguments?.getString("jobId")
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Caixa") },
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
                Button(
                    onClick = { /* Lógica para enviar candidatura */ },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(16.dp)
                        .height(56.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color(0xFF6750A4)
                    ),
                    shape = MaterialTheme.shapes.medium
                ) {
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
                text = "Empresa: Mercado Dia",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold
            )
            
            // Informações básicas
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text("Presencial")
                Text("CLT")
                Text("R$ 1.700/mês")
            }
            
            // Descrição
            JobSection(title = "Descrição") {
                Text(
                    "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nam nec tortor in lectus cursus luctus et at purus. Interdum et malesuada fames ac ante ipsum primis in faucibus. Morbi eget magna sit amet dolor condimentum convallis. Fusce eget commodo neque, ut malesuada dui. Sed vitae enim pharetra, convallis erat a, commodo quam. Sed id est ac nunc rhoncus tempus ac ac nibh. Nam non odio sodales, mattis quam a, facilisis diam."
                )
            }
            
            // Requisitos
            JobSection(title = "Requisitos") {
                ListItem(text = "Requisito 1")
                ListItem(text = "Requisito 2")
                ListItem(text = "Requisito 3")
            }
            
            // Benefícios
            JobSection(title = "Benefícios") {
                ListItem(text = "Benefício 1")
                ListItem(text = "Benefício 2")
                ListItem(text = "Benefício 3")
            }
            
            // Atividades
            JobSection(title = "Atividades") {
                BulletListItem(text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Pellentesque sed ex ligula. Nam posuere ex quis.")
                BulletListItem(text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Pellentesque sed ex ligula. Nam posuere ex quis.")
                BulletListItem(text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Pellentesque sed ex ligula. Nam posuere ex quis.")
                BulletListItem(text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Pellentesque sed ex ligula. Nam posuere ex quis.")
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