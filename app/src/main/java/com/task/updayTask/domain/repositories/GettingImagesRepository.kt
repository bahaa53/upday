package com.task.updayTask.domain.repositories

import com.task.updayTask.domain.entities.imagesResponse.SearchImagesResponse

interface GettingImagesRepository {

    suspend fun searchForImages(page : Int = 1): Result<SearchImagesResponse>
}