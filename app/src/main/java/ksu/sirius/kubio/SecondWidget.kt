
package ksu.sirius.kubio

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import ksu.sirius.kubio.ui.theme.KuBioTheme


@Preview
@Composable
fun SecondWidget(){
    KuBioTheme {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ){
            SecondGreeting("Human")
        }
    }
}

@Composable
fun SecondGreeting(name: String){
    Column (modifier = Modifier.fillMaxSize()) {
        Box(modifier = Modifier.fillMaxHeight(0.5f)
            .fillMaxWidth()
            .background(color = Color.Gray),
            contentAlignment = Alignment.Center){
            Text(text = "Temp in $name!")
        }
        Box(modifier = Modifier.fillMaxHeight()
            .fillMaxWidth()
            .background(color = Color.Blue),
            contentAlignment = Alignment.BottomCenter){
            Button(onClick = {

            }, modifier = Modifier.padding(5.dp).fillMaxWidth()) {
                Text(text = "Refresh")
            }
        }
    }
}

