package ksu.sirius.kubio

import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
fun ItemRow(item: ItemRowModel) {
    var isExpanded by remember {
        mutableStateOf(false)
    }
    val counter = remember {
        mutableStateOf(item.count)
    }
    val color = remember {
        mutableStateOf(item.color)
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
    ) {
        Box(
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    painter = painterResource(id = item.imageId),
                    contentDescription = "Photo",
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
                    Text(item.name)
                    Text(
                        modifier = Modifier.clickable {
                            isExpanded = !isExpanded
                        },
                        maxLines = if (isExpanded) Int.MAX_VALUE else 1,
                        text = item.profession
                    )
                    Text(counter.value.toString())
                }
            }
        }
    }
}