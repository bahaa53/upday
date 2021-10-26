package com.task.updayTask.domain.entities.imagesResponse


import com.google.gson.annotations.SerializedName

data class Assets(
    @SerializedName("huge_thumb")
    val hugeThumb: HugeThumb,
    @SerializedName("large_thumb")
    val largeThumb: LargeThumb,
    @SerializedName("preview")
    val preview: Preview,
    @SerializedName("preview_1000")
    val preview1000: Preview1000,
    @SerializedName("preview_1500")
    val preview1500: Preview1500,
    @SerializedName("small_thumb")
    val smallThumb: SmallThumb
)