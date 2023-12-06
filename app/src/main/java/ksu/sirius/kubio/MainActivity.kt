package ksu.sirius.kubio

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent


const val API_KEY = "6d52473eea504095a1a51156230612"
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SecondWidget(this)
        }
    }
}
