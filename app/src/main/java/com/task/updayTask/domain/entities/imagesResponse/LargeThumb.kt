package com.task.updayTask.domain.entities.imagesResponse


import com.google.gson.annotations.SerializedName

data class LargeThumb(
    @SerializedName("height")
    val height: Int,
    @SerializedName("url")
    val url: String,
    @SerializedName("width")
    val width: Int
)