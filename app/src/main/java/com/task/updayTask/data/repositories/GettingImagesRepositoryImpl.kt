package com.task.updayTask.data.repositories

import android.content.Context
import com.task.updayTask.R
import com.task.updayTask.data.network.ApiInterface
import com.task.updayTask.domain.entities.imagesResponse.SearchImagesResponse
import com.task.updayTask.domain.repositories.GettingImagesRepository
import com.task.updayTask.domain.repositories.Result
import dagger.hilt.android.qualifiers.ApplicationContext
import java.net.UnknownHostException
import javax.inject.Inject

const val SEARCH_FOR_IMAGES_ENDPOINT_URL = "images/search"
class GettingImagesRepositoryImpl @Inject constructor(
    @ApplicationContext private val context: Context,
    private val apiInterface: ApiInterface
) : GettingImagesRepository {

    private lateinit var result: Result<SearchImagesResponse>

    override suspend fun searchForImages(page : Int ): Result<SearchImagesResponse> {
        try {
            val searchForImagesResponse =
                apiInterface.searchForImages(page).await()
            if (searchForImagesResponse.isSuccessful) {
                val currentWeatherResult = searchForImagesResponse.body() ?: SearchImagesResponse()
                result = Result.Success(
                    currentWeatherResult ,
                )
            } else {
                result = Result.Error(message = context.getString(R.string.error_occured))
            }

        } catch (e: UnknownHostException) {
            result = Result.Error(
                e,
                message = context.getString(R.string.no_internet_connection)
            )

        } catch (e: Exception) {
            result = Result.Error(e)
        }
        return result
    }
}