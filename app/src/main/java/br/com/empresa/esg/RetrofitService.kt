package br.com.empresa.esg

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface RetrofitService {
    @GET(value = "{CEP}/json/")
    fun getCEP(@Path("CEP") CEP : String) : Call<CEP>

}