package com.example.softcal.componentes


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun view3() {
    var count by remember { mutableIntStateOf(0) }

    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .padding(16.dp)
            .background(Color.White)
    ) {
        Text(
            text = count.toString(),
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(end = 16.dp)
        )
        Column {
            Button(
                onClick = { count++ },
                modifier = Modifier.padding(4.dp)
            ) {
                Text("▲")
            }
            Button(
                onClick = { count-- },
                modifier = Modifier.padding(4.dp)
            ) {
                Text("▼")
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun view3V() {
    view3()

}