package br.com.fiap.jobs_fiap_esg.screens

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import br.com.fiap.jobs_fiap_esg.components.BottomNavBar

@Composable
fun VagasApp(navController: NavController) {
    Scaffold(
        bottomBar = {
            BottomNavBar(navController = navController)
        }
    ) { paddingValues ->
        // Como agora estamos usando o NavController para navegação,
        // o VagasApp só precisa mostrar a tela inicial (HomeScreen)
        HomeScreen(
            modifier = Modifier.padding(paddingValues),
            navController = navController
        )
    }
}