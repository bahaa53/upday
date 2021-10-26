package com.task.updayTask.presentation.imagesStory

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.android.material.snackbar.Snackbar
import com.task.updayTask.databinding.ActivityImagesBinding
import com.task.updayTask.domain.repositories.Result
import com.task.updayTask.domain.entities.imagesResponse.SearchImagesResponse
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject


@AndroidEntryPoint
class ImagesActivity : AppCompatActivity() {

    /////////////////Declaring View Model //////////////////////////////////////////
    private val imagesViewModel: ImagesViewModel by viewModels()

    @Inject
    lateinit var imagesAdapter: ImagesAdapter

    @Inject
    lateinit var linearLayoutManager: LinearLayoutManager

    @Inject
    lateinit var scrollListener: RecyclerViewLoadMoreScroll

    private lateinit var binding: ActivityImagesBinding

    private var page: Int = 1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityImagesBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        setupRecyclerView()
        setupScrollListener()
        imagesViewModel
        observeForGettingImages()
    }

    private fun setupRecyclerView() {
        with(binding.rvImages) {
            layoutManager = linearLayoutManager
            adapter = imagesAdapter
            setHasFixedSize(true)
        }
    }

    private fun setupScrollListener() {
        scrollListener.setOnLoadMoreListener(object :
            OnLoadMoreListener {
            override fun onLoadMore() {
                LoadMoreData()
            }
        })
        binding.rvImages.addOnScrollListener(scrollListener)
    }

    private fun LoadMoreData() {
        //Add the Loading View
        page++
        imagesAdapter.addLoadingView()
        imagesViewModel.getImages(page)
    }

    private fun observeForGettingImages() {
        imagesViewModel.searchForImagesResult.observe(
            this,
            {
                when (it) {
                    is Result.Success<SearchImagesResponse> -> {
                        val imagesData = it.data?.data
                        imagesData?.let {
                            imagesAdapter.removeLoadingView()
                            imagesAdapter.addData(imagesData)
                            scrollListener.setLoaded()
                        }
                    }
                    is Result.Error -> {
                        Snackbar.make(binding.parent, it.message, Snackbar.LENGTH_LONG).show()
                    }
                }
            })
    }

}