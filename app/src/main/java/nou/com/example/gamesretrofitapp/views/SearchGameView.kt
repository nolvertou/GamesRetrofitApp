package nou.com.example.gamesretrofitapp.views

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.input.rememberTextFieldState
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import nou.com.example.gamesretrofitapp.components.SimpleSearchBar
import nou.com.example.gamesretrofitapp.model.GameList
import nou.com.example.gamesretrofitapp.viewModel.GamesViewModel

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SearchGameView(
    viewModel: GamesViewModel,
    navController: NavController
){
    // Data Source
    val games by viewModel.games.collectAsState()

    // Hold the search query text
    val textFieldState = rememberTextFieldState()

    // Results to show
    var searchResults by remember { mutableStateOf(emptyList<GameList>()) }

    // Perform search when user start a search
    fun performSearch(query: String) {
        if(query.isNotEmpty()){
            searchResults = games.filter { it.name.contains(query, ignoreCase = true) }
        }else emptyList<GameList>()
    }

    SimpleSearchBar(
        textFieldState = textFieldState,
        onSearch = { query ->
            performSearch(query)
        },
        searchResults = searchResults,
        onResultClick = {game ->
            navController.navigate("DetailView/${game.id}")
        },
        resultText = {game ->  Text(game.name)},
        resultToQuery = { game -> game.name},
        modifier = Modifier.padding(16.dp)
    )
}

