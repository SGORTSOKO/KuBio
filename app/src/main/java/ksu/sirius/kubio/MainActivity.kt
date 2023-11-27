package ksu.sirius.kubio

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
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

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MainWidget()
        }
    }

}

@Preview
@Composable
fun MainWidget(){
    Column(
    modifier = Modifier
        .verticalScroll(rememberScrollState())
    ){
        ListItem("Vlad", "Programmer")
        ListItem("Artem", "Backender")
        ListItem("Artem", "ааа")
        ListItem("Artem", "Backender")
        ListItem("Artem", "Backender")
        ListItem("Artem", "Backender")
        ListItem("Artem", "Backender")
        ListItem("Artem", "Backender")
        ListItem("Artem", "Backender")
        ListItem("Artem", "Backender")
        ListItem("Artem", "Backender")
        ListItem("Artem", "Backender")
        ListItem("Artem", "Backender")
        ListItem("Artem", "Backender")
        ListItem("Artem", "Backender")
        ListItem("Artem", "Backender")
        ListItem("Artem", "Backender")
        ListItem("Artem", "Backender")
        ListItem("Artem", "Backender")
        ListItem("Artem", "Backender")
        ListItem("Artem", "Backender")
        ListItem("Artem", "Backender")
        ListItem("Artem", "Backender")
        ListItem("Artem", "Backender")
        ListItem("Artem", "Backender")
        ListItem("Artem", "Backender")
        ListItem("Artem", "Backender")
        ListItem("Artem", "Backender")
        ListItem("Artem", "Backender")
        ListItem("Artem", "Backender")
        ListItem("Artem", "Backender")
        ListItem("Artem", "Backender")
        ListItem("Artem", "Backender")
        ListItem("Artem", "Backender")
        ListItem("Artem", "Backender")
        ListItem("Artem", "Backender")
        ListItem("Artem", "Backender")
        ListItem("Artem", "Backender")
        ListItem("Artem", "Backender")
        ListItem("Artem", "Backender")
        ListItem("Artem", "Backender")
        ListItem("Artem", "Backender")
        ListItem("Artem", "Backender")
        ListItem("Artem", "Backender")
        ListItem("Artem", "Backender")
        ListItem("Artem", "Backender")
        ListItem("Artem", "Backender")
        ListItem("Artem", "Backender")
        ListItem("Artem", "Backender")
        ListItem("Artem", "Backender")
        ListItem("Artem", "Backender")
        ListItem("Artem", "Backender")
        ListItem("Artem", "Backender")
        ListItem("Artem", "Backender")
        ListItem("Artem", "Backender")
        ListItem("Artem", "Backender")
        ListItem("Artem", "Backender")
        ListItem("Artem", "Backender")
        ListItem("Artem", "Backender")
        ListItem("Artem", "Backender")
        ListItem("Artem", "Backender")
        ListItem("Artem", "Backender")
        ListItem("Artem", "Backender")
        ListItem("Artem", "Backender")
        ListItem("Artem", "Backender")
        ListItem("Artem", "Backender")
        ListItem("Artem", "Backender")
        ListItem("Artem", "Backender")
        ListItem("Artem", "Backender")
        ListItem("Artem", "Backender")
        ListItem("Artem", "Backender")
        ListItem("Artem", "Backender")
        ListItem("Artem", "Backender")
        ListItem("Artem", "Backender")
        ListItem("Artem", "Backender")
        ListItem("Artem", "Backender")
        ListItem("Artem", "Backender")
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
