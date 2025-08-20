package nou.com.example.gamesretrofitapp.views

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import nou.com.example.gamesretrofitapp.MainTopBar
import nou.com.example.gamesretrofitapp.viewModel.GamesViewModel

@Composable
fun HomeView(
    viewModel: GamesViewModel
) {
    Scaffold(
        topBar = {
            MainTopBar(title = "API GAMES", showBackButton = true) {

            }
        }
    ) {
        ContentHomeView(
            viewModel, it
        )
    }
}

@Composable
fun ContentHomeView(
    viewModel: GamesViewModel,
    padding: PaddingValues
){
    val games by viewModel.games.collectAsState()

    LazyColumn( modifier = Modifier.padding(padding).padding(20.dp)) {
        items(games){ item ->
            Text(text = item.name)
        }
    }
}