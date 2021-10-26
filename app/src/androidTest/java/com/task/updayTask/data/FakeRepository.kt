package com.task.updayTask.data

import com.google.gson.Gson
import com.task.updayTask.domain.entities.imagesResponse.SearchImagesResponse
import com.task.updayTask.domain.repositories.GettingImagesRepository
import com.task.updayTask.domain.repositories.Result

class FakeRepository : GettingImagesRepository {
    var networkError = false

    override suspend fun searchForImages(page: Int): Result<SearchImagesResponse> {
        if (!networkError) {
            val searchImagesResponse = Gson().fromJson(response, SearchImagesResponse::class.java)
            return Result.Success(searchImagesResponse)
        } else {
            return Result.Error(message = "No Internet Connection")
        }
    }
}