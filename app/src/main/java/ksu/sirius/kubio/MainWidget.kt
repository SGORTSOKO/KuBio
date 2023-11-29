package ksu.sirius.kubio

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
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
                ItemRowModel(name = "Vlad", profession = "Programmer \n" +
                        "programmer \n"+ "programmer \n"+
                        "programmer \n"+ "programmer \n"+
                        "programmer \n"+ "programmer \n"+
                        "programmer \n"+ "programmer \n"+
                        "programmer \n"+ "programmer \n"+
                        "programmer \n"+ "programmer \n"+
                        "programmer \n"+ "programmer \n"),
                ItemRowModel(name = "Vlad", profession = "Programmer"),
                ItemRowModel(name = "Vlad", profession = "Programmer"),
                ItemRowModel(name = "Vlad", profession = "Programmer"),
                ItemRowModel(name = "Vlad", profession = "Programmer"),
                ItemRowModel(name = "Vlad", profession = "Programmer"),
                ItemRowModel(name = "Vlad", profession = "Programmer"),
                ItemRowModel(name = "Vlad", profession = "Programmer"),
                ItemRowModel(name = "Vlad", profession = "Programmer"),
                ItemRowModel(name = "Vlad", profession = "Programmer"),
                ItemRowModel(name = "Vlad", profession = "Programmer"),
                ItemRowModel(name = "Vlad", profession = "Programmer"),
                ItemRowModel(name = "Vlad", profession = "Programmer"),
                ItemRowModel(name = "Vlad", profession = "Programmer"),
                ItemRowModel(name = "Vlad", profession = "Programmer"),
                ItemRowModel(name = "Vlad", profession = "Programmer"),
                ItemRowModel(name = "Vlad", profession = "Programmer"),
                ItemRowModel(name = "Vlad", profession = "Programmer"),
                ItemRowModel(name = "Vlad", profession = "Programmer"),
                ItemRowModel(name = "Vlad", profession = "Programmer"),
                ItemRowModel(name = "Vlad", profession = "Programmer"),
                ItemRowModel(name = "Vlad", profession = "Programmer"),
                ItemRowModel(name = "Vlad", profession = "Programmer"),
                ItemRowModel(name = "Vlad", profession = "Programmer"),
                ItemRowModel(name = "Vlad", profession = "Programmer"),
                ItemRowModel(name = "Vlad", profession = "Programmer"),
                ItemRowModel(name = "Vlad", profession = "Programmer"),
                ItemRowModel(name = "Vlad", profession = "Programmer"),
                ItemRowModel(name = "Vlad", profession = "Programmer"),
                ItemRowModel(name = "Vlad", profession = "Programmer"),
                ItemRowModel(name = "Vlad", profession = "Programmer"),
                ItemRowModel(name = "Vlad", profession = "Programmer"),
                ItemRowModel(name = "Vlad", profession = "Programmer"),
                ItemRowModel(name = "Vlad", profession = "Programmer"),
                ItemRowModel(name = "Vlad", profession = "Programmer"),
                ItemRowModel(name = "Vlad", profession = "Programmer"),
                ItemRowModel(name = "Vlad", profession = "Programmer"),
                ItemRowModel(name = "Vlad", profession = "Programmer"),
                ItemRowModel(name = "Vlad", profession = "Programmer"),
                ItemRowModel(name = "Vlad", profession = "Programmer"),
                ItemRowModel(name = "Vlad", profession = "Programmer"),
                ItemRowModel(name = "Vlad", profession = "Programmer"),
                ItemRowModel(name = "Vlad", profession = "Programmer"),
                ItemRowModel(name = "Vlad", profession = "Programmer"),
                ItemRowModel(name = "Vlad", profession = "Programmer"),
                ItemRowModel(name = "Vlad", profession = "Programmer"),
            )
        ){index, item ->
            item.count = index
            ItemRow(item)
        }
    }
}

