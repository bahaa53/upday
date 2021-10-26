package com.task.updayTask.presentation.imagesStory

import com.squareup.picasso.Picasso
import com.task.updayTask.domain.entities.imagesResponse.Data

fun bindItemViewHolder(itemViewHolder: ImagesAdapter.ItemViewHolder, data: Data?) {
    val imageView = itemViewHolder.binding.ivImage
    val imageUrl = data?.assets?.preview1000?.url ?: ""
    Picasso.get().load(imageUrl).fit().centerInside().into(imageView)
}