package ksu.sirius.kubio

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview


@Preview
@Composable
fun MainWidget(){
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
    ){
        itemsIndexed(
            listOf(
                ItemRowModel(
                    imageId = R.drawable.ic_launcher_foreground,
                    name = "Vlad",
                    profession = "Programmer",
                    color = Color.White
                ),

                ItemRowModel(
                    imageId = R.drawable.ic_launcher_foreground,
                    name = "Vlad",
                    profession = "Programmer",
                    color = Color.White
                ),

                ItemRowModel(
                    imageId = R.drawable.ic_launcher_foreground,
                    name = "Vlad",
                    profession = "Programmer",
                    color = Color.White
                ),

                ItemRowModel(
                    imageId = R.drawable.ic_launcher_foreground,
                    name = "Vlad",
                    profession = "Programmer",
                    color = Color.White
                )
            )
        ){index, item ->
            ItemRow(item)
        }
    }
}

