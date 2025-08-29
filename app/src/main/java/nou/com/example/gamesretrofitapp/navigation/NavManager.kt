package nou.com.example.gamesretrofitapp.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import nou.com.example.gamesretrofitapp.viewModel.GamesViewModel
import nou.com.example.gamesretrofitapp.views.DetailView
import nou.com.example.gamesretrofitapp.views.HomeView
import nou.com.example.gamesretrofitapp.views.SearchGameView

@Composable
fun NavManager(viewModel: GamesViewModel){
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "Home" ){
        composable("Home"){
            HomeView(viewModel = viewModel, navController)
        }
        composable("DetailView/{id}", arguments = listOf(
            navArgument("id"){ type = NavType.IntType }
        )){
            val id = it.arguments?.getInt("id") ?: 0
            DetailView(viewModel = viewModel, navController, id )
        }
        composable("SearchGameView"){
            SearchGameView(viewModel,  navController)
        }
    }
}