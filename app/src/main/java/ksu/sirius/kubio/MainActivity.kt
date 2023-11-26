package ksu.sirius.kubio

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.gestures.detectDragGesturesAfterLongPress
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
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.input.pointer.positionChange
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
    Card(
        modifier = Modifier
            .padding(5.dp)
            .fillMaxWidth()
            .pointerInput(Unit){
                               detectDragGesturesAfterLongPress { change, dragAmount ->
                                   Log.d("MyLog", "LongPressnGesture: ${change.positionChange()}")
                               }
            }
            ,
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
                ) {
                    Text(name)
                    Text(profession)
                }
            }
        }
    }
}
