package network

import data.LoginRequest
import data.LoginResponse
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST

interface ApiClient {
    @POST("/footscray/auth")
    fun login(@Body request: LoginRequest): Call<LoginResponse>
}