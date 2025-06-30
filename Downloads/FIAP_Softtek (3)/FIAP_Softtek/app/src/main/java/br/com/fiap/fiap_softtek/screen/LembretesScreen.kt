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
fun LembretesScreen(navController: NavController) {
    Column(modifier = Modifier.padding(16.dp)) {
        Text("Lembretes e Apoio Personalizado", style = MaterialTheme.typography.titleLarge)
        Spacer(Modifier.height(8.dp))
        Text("Você receberá dicas e alertas baseados em suas respostas e humor.")
        Button(onClick = { /* configurar notificações */ }) { Text("Ativar Lembretes") }
    }
}