package nou.com.example.gamesretrofitapp.views

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import nou.com.example.gamesretrofitapp.viewModel.GamesViewModel

@Composable
fun DetailView(
    viewModel: GamesViewModel,
    navController: NavController,
    id: Int
){
    Text(text = id.toString(), color = Color.White, modifier = Modifier.padding(30.dp))
}