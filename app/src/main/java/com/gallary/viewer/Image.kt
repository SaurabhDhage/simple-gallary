package com.gallary.viewer

import android.graphics.Bitmap
import android.net.Uri

data class Image(
    val uri: Uri,
    val name: String,
    val size: Int,
    val thumbnail: Bitmap?
)