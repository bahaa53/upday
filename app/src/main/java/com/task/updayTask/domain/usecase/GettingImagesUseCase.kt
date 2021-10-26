package com.task.updayTask.domain.usecase


import com.task.updayTask.domain.entities.imagesResponse.SearchImagesResponse
import com.task.updayTask.domain.repositories.GettingImagesRepository
import com.task.updayTask.domain.repositories.Result
import javax.inject.Inject

class GettingImagesUseCase @Inject constructor(private val gettingImagesRepository: GettingImagesRepository) {
    suspend fun searchForImages(page: Int): Result<SearchImagesResponse> {
        /* Here we can use mapper if we want to modify format of data layer to
            matches with the format of presentation layer
         */
        return gettingImagesRepository.searchForImages(page)
    }
}