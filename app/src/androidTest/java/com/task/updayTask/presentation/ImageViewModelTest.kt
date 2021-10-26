package com.task.updayTask.presentation

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import com.task.updayTask.MainCoroutineRule
import com.task.updayTask.data.FakeRepository
import com.task.updayTask.domain.usecase.GettingImagesUseCase
import com.task.updayTask.getOrAwaitValueTest
import com.task.updayTask.presentation.imagesStory.ImagesViewModel
import kotlinx.coroutines.ExperimentalCoroutinesApi
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import com.google.common.truth.Truth.assertThat
import com.task.updayTask.domain.entities.imagesResponse.SearchImagesResponse
import com.task.updayTask.domain.repositories.Result


@ExperimentalCoroutinesApi
class ImageViewModelTest {

    @get:Rule
    var instantTaskExecutorRule = InstantTaskExecutorRule()

    @get:Rule
    var mainCoroutineRule = MainCoroutineRule()

    private lateinit var viewModel: ImagesViewModel

    @Before
    fun setup() {
        val useCase = GettingImagesUseCase(FakeRepository())
        viewModel = ImagesViewModel(useCase)
    }

    @Test
    fun testSuccessStatus(){
        viewModel.getImages(1)
        val value = viewModel.searchForImagesResult.getOrAwaitValueTest()
        assertThat(value).isInstanceOf(Result.Success::class.java)
    }


    @Test
    fun testFailureStatusWhenThereIsANetworkError(){
        viewModel.getImages(1)
        val value = viewModel.searchForImagesResult.getOrAwaitValueTest()
        assertThat(value).isInstanceOf(Result.Error::class.java)

    }



}