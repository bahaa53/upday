package com.task.updayTask.domain.entities.imagesResponse


import com.google.gson.annotations.SerializedName

data class SearchImagesResponse(
    @SerializedName("data")
    val `data`: ArrayList<Data>? = null,
    @SerializedName("page")
    val page: Int = 0,
    @SerializedName("per_page")
    val perPage: Int = 0 ,
    @SerializedName("search_id")
    val searchId: String? = null,
    @SerializedName("total_count")
    val totalCount: Int = 0
)