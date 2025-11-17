package nou.com.example.gamesretrofitapp.repository

import nou.com.example.gamesretrofitapp.data.ApiGames
import nou.com.example.gamesretrofitapp.model.GameList
import nou.com.example.gamesretrofitapp.model.SingleGameModel
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

    suspend fun getGameById(id: Int): SingleGameModel?{
        val response = apiGames.getGameById(id)
        if(response.isSuccessful){
            return response.body()
        }else{
            return null
        }
    }

    suspend fun getGameByName(name: String): SingleGameModel?{
        val response = apiGames.getGameByName(name)
        if(response.isSuccessful){
            return response.body()
        }
        return null
    }

}