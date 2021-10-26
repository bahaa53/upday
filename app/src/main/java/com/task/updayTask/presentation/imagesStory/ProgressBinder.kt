package com.task.updayTask.presentation.imagesStory

import android.graphics.BlendMode
import android.graphics.BlendModeColorFilter
import android.graphics.Color
import android.graphics.PorterDuff
import android.os.Build

fun bindProgressViewHolder(progressViewHolder: ImagesAdapter.LoadingViewHolder) {
    val progressBar = progressViewHolder.binding
        .progressbar
    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
        progressBar.indeterminateDrawable.colorFilter =
            BlendModeColorFilter(Color.WHITE, BlendMode.SRC_ATOP)
    } else {
        progressBar.indeterminateDrawable.setColorFilter(
            Color.WHITE,
            PorterDuff.Mode.MULTIPLY
        )
    }
}