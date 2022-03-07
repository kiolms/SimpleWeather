package com.simpleweather.android.logic

import com.simpleweather.android.logic.model.Place
import com.simpleweather.android.logic.network.SimpleWeatherNetwork
import kotlinx.coroutines.Dispatchers
import androidx.lifecycle.liveData as liveData

object Repository {

    fun searchPlaces(query: String) = liveData(Dispatchers.IO) {

        val result = try {

            val placeResponse = SimpleWeatherNetwork.searchPlaces(query)
            if(placeResponse.status == "ok"){

                val places = placeResponse.places
                Result.success((places))

            }else{

                Result.failure(RuntimeException("response status is ${placeResponse.status}"))

            }

        } catch (e: Exception){
            Result.failure<List<Place>>(e)
        }
        emit(result)
    }

}