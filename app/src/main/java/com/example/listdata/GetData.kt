package com.example.listdata

import io.reactivex.Observable
import retrofit2.http.GET


interface GetData {

    @GET("prices?key=14b9ea3dbf29c956e3e68294ebb6385e")
    fun getData() : Observable<List<RetroCrypto>>

}