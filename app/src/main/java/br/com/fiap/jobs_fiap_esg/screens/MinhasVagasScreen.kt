package br.com.fiap.jobs_fiap_esg.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.com.fiap.jobs_fiap_esg.data.vagasSalvas
import br.com.fiap.jobs_fiap_esg.components.VagaItem
import androidx.navigation.NavController
import br.com.fiap.jobs_fiap_esg.data.vagasDisponiveis
import br.com.fiap.jobs_fiap_esg.navigation.Screen

@Composable
fun MinhasVagasScreen(modifier: Modifier = Modifier, navController: NavController) {
    val vagasFavoritas = remember(vagasSalvas) {
        vagasDisponiveis.filter { vaga -> vagasSalvas.contains(vaga.id) }
    }

    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Text(
            text = "Minhas Vagas",
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(bottom = 16.dp)
        )


        Spacer(modifier = Modifier.height(16.dp))

        LazyColumn(
            modifier = Modifier.fillMaxWidth()
        ) {
            items(vagasFavoritas) { vaga ->
                VagaItem(
                    vaga = vaga,
                    onClick = {
                        // Navegar para detalhes da vaga usando o NavController
                        navController.navigate(Screen.JobDetail.createRoute(vaga.id.toString()))
                    }
                )
                Spacer(modifier = Modifier.height(16.dp))
            }
        }
    }
}

