package com.task.updayTask.data.network

import com.task.updayTask.data.repositories.SEARCH_FOR_IMAGES_ENDPOINT_URL
import com.task.updayTask.domain.entities.imagesResponse.SearchImagesResponse
import kotlinx.coroutines.Deferred
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

private const val IMAGE_RESULT_PER_PAGE = 20

interface ApiInterface {

    @GET(SEARCH_FOR_IMAGES_ENDPOINT_URL)
    fun searchForImages(
        @Query("page") page: Int = 0,
        @Query("per_page") perPage: Int = IMAGE_RESULT_PER_PAGE,
    ): Deferred<Response<SearchImagesResponse>>
}