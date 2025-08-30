package nou.com.example.gamesretrofitapp.views

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.input.rememberTextFieldState
import androidx.compose.material3.ExperimentalMaterial3Api
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
    //Text(text = "SearchGameView")
    
    //var query by remember { mutableStateOf("") }
   // var active by remember { mutableStateOf(false) }


//    SearchBar(
//        modifier = Modifier
//            .fillMaxWidth()
//            .padding(16.dp),
//        expanded = active,
//        onExpandedChange = { active = it },
//        inputField = {
//            TextField(
//                value = query,
//                onValueChange = { query = it },
//                placeholder = { Text("Search…") },
//                singleLine = true,
//                modifier = Modifier.fillMaxWidth(),
//                leadingIcon = {
//                    Icon(
//                        imageVector = Icons.Default.Search,
//                        contentDescription = "Search icon"
//                    )
//                },
//                trailingIcon = {
//                    Icon(
//                        imageVector = Icons.Default.Close,
//                        contentDescription = "Close icon",
//                        modifier = Modifier.clickable { navController.popBackStack() }
//                    )
//                }
//            )
//
//        }
//    ) {
//        if(query.isNotEmpty()){
//            val filterGames = games.filter { it.name.contains(query, ignoreCase = true) }
//            filterGames.forEach{
//                Text(
//                    text = it.name,
//                    fontSize = 20.sp,
//                    fontWeight = FontWeight.Bold,
//                    modifier = Modifier
//                        .padding(bottom = 10.dp, start = 10.dp)
//                        .clickable { navController.navigate("DetailView/${it.id}") }
//                )
//            }
//        }
//    }

//    SearchBar(
//        modifier = Modifier
//            .fillMaxWidth()
//            .padding(16.dp),
//        expanded = active,
//        onExpandedChange = { active = it },
//        inputField = {
//            TextField(
//                value = query,
//                onValueChange = { query = it },
//                placeholder = { Text("Search…") },
//                singleLine = true,
//                modifier = Modifier.fillMaxWidth(),
//                leadingIcon = {
//                    Icon(Icons.Default.Search, contentDescription = null)
//                },
//                trailingIcon = {
//                    if (query.isNotEmpty()) {
//                        Icon(
//                            Icons.Default.Close,
//                            contentDescription = "Clear",
//                            modifier = Modifier.clickable { query = "" }
//                        )
//                    }
//                },
////                keyboardOptions = KeyboardOptions(imeAction = ImeAction.Search),
////                keyboardActions = KeyboardActions(
////                    onSearch = { active = false }
////                )
//            )
//        }
//    ) {
//        // ✅ Constrain the results area
//        androidx.compose.foundation.layout.Box(
//            modifier = Modifier
//                .fillMaxWidth()
//                .heightIn(max = 300.dp) // limit height of the dropdown
//        ) {
//            androidx.compose.foundation.lazy.LazyColumn {
//                val filteredGames = games.filter { it.name.contains(query, ignoreCase = true) }
//                items(filteredGames.size) { index ->
//                    val game = filteredGames[index]
//                    Text(
//                        text = game.name,
//                        fontSize = 20.sp,
//                        modifier = Modifier
//                            .fillMaxWidth()
//                            .padding(8.dp)
//                            .clickable {
//                                active = false
//                                query = game.name
//                                navController.navigate("DetailView/${game.id}")
//                            }
//                    )
//                }
//            }
//        }
//    }

    // Data Source
    val games by viewModel.games.collectAsState()

    // Hold the search query text
    val textFieldState = rememberTextFieldState()

    // Results to show
    var searchResults by remember { mutableStateOf(emptyList<GameList>()) }

    // When user presses enter/search
    fun performSearch(query: String) {

    }

    SimpleSearchBar(
        textFieldState = textFieldState,
        onSearch = { query ->
            if(query.isNotEmpty()){
                searchResults = games.filter { it.name.contains(query, ignoreCase = true) }
            }else emptyList<GameList>()
        },
        searchResults = searchResults,
        onResultClick = {game ->
            navController.navigate("DetailView/${game.id}")
        },
        modifier = Modifier.padding(16.dp)
    )
}

