package br.com.fiap.jobs_fiap_esg.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import br.com.fiap.jobs_fiap_esg.navigation.Screen

@Composable
fun JobItem(
    title: String,
    company: String,
    location: String,
    salary: String,
    jobId: String,
    navController: NavController
) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
            .clickable {
                navController.navigate(Screen.JobDetail.createRoute(jobId))
            }
    ) {
        // ... existing code ...
    }
}