package nou.com.example.gamesretrofitapp.views

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import nou.com.example.gamesretrofitapp.components.MainImage
import nou.com.example.gamesretrofitapp.components.MainTopBar
import nou.com.example.gamesretrofitapp.components.MetaWebsite
import nou.com.example.gamesretrofitapp.components.ReviewCard
import nou.com.example.gamesretrofitapp.util.Constants.Companion.CUSTOM_BLACK
import nou.com.example.gamesretrofitapp.viewModel.GamesViewModel

@Composable
fun DetailView(
    viewModel: GamesViewModel,
    navController: NavController,
    id: Int
){

    // Its executed when DetailView is opened
    // LaunchedEffect runs a coroutine when the key (Unit here) changes.
    // Since the key is Unit (which never changes), it will only run once when the composable enters the composition.
    // In your case, it means:
    // When DetailView is first shown, it calls
    // viewModel.getGameById(id)
    // to load the game data.
    LaunchedEffect(Unit) {
        viewModel.getGameById(id)
    }

    // DisposableEffect is used when you need to clean up resources when the composable leaves the composition.
    // The onDispose { ... } block runs when DetailView is closed / removed from the screen.
    // viewModel.clean() is used to clear state, cancel things, or reset variables.
    DisposableEffect(Unit) {
        onDispose {
            viewModel.clean()
        }
    }

    Text(text = viewModel.state.name, color = Color.White, modifier = Modifier.padding(30.dp))

    Scaffold(
        topBar = {
            MainTopBar(
                title = viewModel.state.name,
                showBackButton = true,
                onClickBackButton = { navController.popBackStack()}
            ) { }
        }
    ) {
        ContentDetailView(pad = it, viewModel = viewModel )
    }

}

@Composable
fun ContentDetailView(
    pad: PaddingValues,
    viewModel: GamesViewModel
){
    val state = viewModel.state

    Column(
        modifier = Modifier
            .padding(pad)
            .background(Color(CUSTOM_BLACK))
    ) {
        MainImage(image = state.background_image)
        Spacer(modifier = Modifier.height(10.dp))
        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 20.dp, end = 5.dp)
        ) {
            MetaWebsite(url = state.website)
            ReviewCard(state.metacritic)
        }

        val scroll = rememberScrollState(0)
        Text(
            text = state.description_raw,
            color = Color.White,
            textAlign = TextAlign.Justify,
            modifier = Modifier
                .padding(start = 15.dp, end = 15.dp, bottom = 10.dp)
                .verticalScroll(scroll)
        )
    }
}