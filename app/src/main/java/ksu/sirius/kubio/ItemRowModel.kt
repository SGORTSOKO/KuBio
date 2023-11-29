package ksu.sirius.kubio

import androidx.compose.ui.graphics.Color

data class ItemRowModel(
    val imageId: Int,
    val name: String,
    val profession: String,
    val count: Int = 0,
    val color:Color
)
