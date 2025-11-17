package nou.com.example.gamesretrofitapp.data

import nou.com.example.gamesretrofitapp.model.GamesModel
import nou.com.example.gamesretrofitapp.model.SingleGameModel
import nou.com.example.gamesretrofitapp.util.Constants.Companion.API_KEY
import nou.com.example.gamesretrofitapp.util.Constants.Companion.ENDPOINT
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiGames {

    @GET(ENDPOINT + API_KEY)
    suspend fun getGames(): Response<GamesModel>

    @GET("$ENDPOINT/{id}$API_KEY")
    suspend fun getGameById(@Path(value = "id") id: Int): Response<SingleGameModel>

    @GET("$ENDPOINT/{name}$API_KEY")
    suspend fun getGameByName(@Path(value = "name") name : String) : Response<SingleGameModel>
}