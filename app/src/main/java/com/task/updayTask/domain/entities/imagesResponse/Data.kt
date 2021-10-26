package com.task.updayTask.domain.entities.imagesResponse


import com.google.gson.annotations.SerializedName

data class Data(
    @SerializedName("aspect")
    val aspect: Double,
    @SerializedName("assets")
    val assets: Assets,
    @SerializedName("contributor")
    val contributor: Contributor,
    @SerializedName("description")
    val description: String,
    @SerializedName("has_model_release")
    val hasModelRelease: Boolean,
    @SerializedName("id")
    val id: String,
    @SerializedName("image_type")
    val imageType: String,
    @SerializedName("media_type")
    val mediaType: String
)