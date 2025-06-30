package br.com.fiap.fiap_softtek.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun SuporteScreen(navController: NavController) {
    Column(modifier = Modifier.padding(16.dp)) {
        Text("Recursos de Apoio", style = MaterialTheme.typography.titleLarge)
        Spacer(Modifier.height(8.dp))
        Text("Canal de escuta disponível 24h")
        Text("Orientações sobre saúde emocional")
        Button(onClick = { /* abrir contato */ }) { Text("Falar com um especialista") }
    }
}