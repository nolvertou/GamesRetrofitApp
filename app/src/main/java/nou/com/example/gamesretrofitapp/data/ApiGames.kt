package nou.com.example.gamesretrofitapp.data

import nou.com.example.gamesretrofitapp.model.GamesModel
import nou.com.example.gamesretrofitapp.util.Constants.Companion.API_KEY
import nou.com.example.gamesretrofitapp.util.Constants.Companion.ENDPOINT
import retrofit2.Response
import retrofit2.http.GET

interface ApiGames {

    @GET(ENDPOINT + API_KEY)
    suspend fun getGames(): Response<GamesModel>



}