package br.com.fiap.fiap_softtek

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.runtime.Composable
import androidx.navigation.compose.composable
import br.com.fiap.fiap_softtek.screen.AvaliacaoDeRiscoScreen
import br.com.fiap.fiap_softtek.screen.BemEstarScreen
import br.com.fiap.fiap_softtek.screen.EvolucaoScreen
import br.com.fiap.fiap_softtek.screen.HomeScreen
import br.com.fiap.fiap_softtek.screen.LembretesScreen
import br.com.fiap.fiap_softtek.screen.SuporteScreen
import com.google.accompanist.navigation.animation.AnimatedNavHost
import com.google.accompanist.navigation.animation.rememberAnimatedNavController


@MainActivity.AndroidEntryPoint
class MainActivity : ComponentActivity() {
    annotation class AndroidEntryPoint

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FiapAppSofttekApp()
        }
    }
}

// FiapAppSofttekApp.kt
@OptIn(ExperimentalAnimationApi::class)
@Composable
fun FiapAppSofttekApp() {
    val navController = rememberAnimatedNavController()
    AnimatedNavHost(
        navController = navController,
        startDestination = "home"
    ) {
        composable("home") { HomeScreen (navController) }
        composable("risks") { AvaliacaoDeRiscoScreen (navController) }
        composable("wellbeing") { BemEstarScreen (navController) }
        composable("support") { SuporteScreen (navController) }
        composable("data") { EvolucaoScreen (navController) }
        composable("reminders") { LembretesScreen (navController) }
    }
}