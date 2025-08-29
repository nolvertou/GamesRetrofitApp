package nou.com.example.gamesretrofitapp.views

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import nou.com.example.gamesretrofitapp.viewModel.GamesViewModel

@Composable
fun SearchGameView(
    viewModel: GamesViewModel,
    navController: NavController
){
    Text(text = "SearchGameView")
}