package nou.com.example.gamesretrofitapp.repository

import nou.com.example.gamesretrofitapp.data.ApiGames
import nou.com.example.gamesretrofitapp.model.GameList
import javax.inject.Inject

class GamesRepository @Inject constructor(private val apiGames: ApiGames) {

    suspend fun getGames(): List<GameList>? {
        val response = apiGames.getGames()
        if(response.isSuccessful){
            return response.body()?.results
        } else{
            return null
        }
    }
}