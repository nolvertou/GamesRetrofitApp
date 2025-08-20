package nou.com.example.gamesretrofitapp.views

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import nou.com.example.gamesretrofitapp.components.CardGame
import nou.com.example.gamesretrofitapp.components.MainTopBar
import nou.com.example.gamesretrofitapp.util.Constants.Companion.CUSTOM_BLACK
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

    LazyColumn( modifier = Modifier
        .padding(padding)
        //.padding(20.dp)
        .background(Color(CUSTOM_BLACK))
    ) {
        items(games){ item ->
            CardGame(item){
                // TODO
            }
            Text(
                text = item.name,
                fontWeight = FontWeight.Bold,
                color = Color.White,
                modifier = Modifier.padding(start = 10.dp)
            )
        }
    }
}