package ksu.sirius.kubio.TrainPacket

import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import ksu.sirius.kubio.R


@Preview
@Composable
fun MainWidget(){
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
    ){
        itemsIndexed(
            listOf(
                "Vlad" to "Programmer",
                "Artem" to "Backeder",
                "Vitaly" to "Frontender",
                "1" to "Programmer",
                "2" to "Backeder",
                "3" to "Frontender",
                "4" to "Programmer",
                "5" to "Backeder",
                "6" to "Frontender",
                "7" to "Programmer",
                "8" to "Backeder",
                "9" to "Frontender",
                "10" to "Programmer",
                "11" to "Backeder",
                "12" to "Frontender",
                "13" to "Programmer",
                "14" to "Backeder",
                "15" to "Frontender",
            )
        ){index, item ->
            ListItem(
                name = item.first,
                profession = item.second
            )
        }
    }
}
@Composable
fun ListItem(name: String,profession: String){
    val counter = remember {
        mutableStateOf(0)
    }
    val color = remember {
        mutableStateOf(Color.White)
    }
    Card(
        modifier = Modifier
            .padding(5.dp)
            .fillMaxWidth()
            .clickable {
                color.value = when (val innerNumber = (++counter.value).mod(10)) {
                    in 1..3 -> {
                        Log.d("MyLog", "1 - $innerNumber")
                        Color.White
                    }

                    in 4..6 -> {
                        Log.d("MyLog", "2 - $innerNumber")
                        Color.Black
                    }

                    else -> {
                        Log.d("MyLog", "3 - $innerNumber")
                        Color.Green
                    }
                }
            },
        shape = RoundedCornerShape(15.dp),
        elevation = CardDefaults.cardElevation(5.dp)
    ){
        Box(
        ){
            Row(
                verticalAlignment = Alignment.CenterVertically
            ){
                Image(
                    painter = painterResource(id = R.drawable.ic_launcher_foreground),
                    contentDescription = "Android",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .padding()
                        .size(64.dp)
                        .clip(CircleShape)
                )
                Column(
                    modifier = Modifier
                        .padding(start = 16.dp)
                        .background(color.value)
                ) {
                    Text(name)
                    Text(profession)
                    Text(counter.value.toString())
                }
            }
        }
    }
}
