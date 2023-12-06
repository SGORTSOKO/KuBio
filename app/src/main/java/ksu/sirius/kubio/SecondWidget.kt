
package ksu.sirius.kubio

import android.content.Context
import android.util.Log
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
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.android.volley.Request
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley
import ksu.sirius.kubio.ui.theme.KuBioTheme


@Composable
fun SecondWidget(context: Context){
    KuBioTheme {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ){
            SecondGreeting("London", context)
        }
    }
}

@Composable
fun SecondGreeting(name: String, context: Context){
    val state = remember {
        mutableStateOf("Unknown")
    }
    Column (modifier = Modifier.fillMaxSize()) {
        Box(modifier = Modifier
            .fillMaxHeight(0.5f)
            .fillMaxWidth()
            .background(color = Color.Gray),
            contentAlignment = Alignment.Center
        ){
            Text(text = "Temp in $name = ${state.value}")
        }
        Box(modifier = Modifier
            .fillMaxHeight()
            .fillMaxWidth()
            .background(color = Color.Blue),
            contentAlignment = Alignment.BottomCenter
        ){
            Button(onClick = {
                getResult(name, state, context)
            }, modifier = Modifier
                .padding(5.dp)
                .fillMaxWidth()) {
                Text(text = "Refresh")
            }
        }
    }
}

private fun getResult(city: String, state: MutableState<String>, context: Context){
    val url = "http://api.weatherapi.com/v1/current.json" +
            "?key=$API_KEY&" +
            "q=$city" +
            "&aqi=no"
    val queue = Volley.newRequestQueue(context)
    val stringRequest = StringRequest(
        Request.Method.GET,
        url,
        {
            response ->
            state.value = response
        },
        {
            error ->
            Log.d("MyLog", "Error $error")
        }
    )
    queue.add(stringRequest)
}

