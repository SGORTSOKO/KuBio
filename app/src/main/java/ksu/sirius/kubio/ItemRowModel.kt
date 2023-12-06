package ksu.sirius.kubio

import androidx.compose.ui.graphics.Color

data class ItemRowModel(
    val imageId: Int = R.drawable.ic_launcher_foreground,
    val name: String = "Base name",
    val profession: String = "Base profession",
    var count: Int = 0,
    var color: Color = Color.White
)
