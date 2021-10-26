package com.task.updayTask.presentation.imagesStory

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.task.updayTask.domain.entities.imagesResponse.SearchImagesResponse
import com.task.updayTask.domain.usecase.GettingImagesUseCase
import com.task.updayTask.domain.repositories.Result
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class ImagesViewModel @Inject constructor(private val useCase: GettingImagesUseCase) :
    ViewModel() {

    private val _searchForImagesResult = MutableLiveData<Result<SearchImagesResponse>>()
    val searchForImagesResult: LiveData<Result<SearchImagesResponse>>
        get() = _searchForImagesResult

    init {
        getImages()
    }

    fun getImages(page: Int = 1) {
        viewModelScope.launch {
            useCase.searchForImages(page)?.let {
                _searchForImagesResult.postValue(it)
            }
        }
    }
}
