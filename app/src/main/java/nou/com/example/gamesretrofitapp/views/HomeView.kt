package nou.com.example.gamesretrofitapp.views

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import nou.com.example.gamesretrofitapp.viewModel.GamesViewModel

@Composable
fun HomeView(
    modifier : Modifier,
    viewModel: GamesViewModel
) {
    val games by viewModel.games.collectAsState()

    LazyColumn( modifier = modifier.fillMaxSize()) {
        items(games){ item ->
            Text(text = item.name)
//            Text(text = item.background_image)
        }
    }
}