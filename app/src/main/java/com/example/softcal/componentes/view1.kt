package com.example.softcal.componentes

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.AddCircle
import androidx.compose.material.icons.filled.KeyboardArrowRight
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun view1() {

    Scaffold (
        topBar = {
            CenterAlignedTopAppBar(title = { Text(text = "UnstopLim", fontFamily = FontFamily.Cursive, fontSize = 35.sp, fontWeight = FontWeight.Bold) },
                colors = TopAppBarDefaults.centerAlignedTopAppBarColors(
                    MaterialTheme.colorScheme.primary
                ))
        }
    ){
        dato(it)
    }

}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun dato(it:PaddingValues) {

    var num1  by remember { mutableStateOf("") }
    var num2  by remember { mutableStateOf("") }
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(it)
            .padding(top = 30.dp)
    )
    {
        item()
        {

            OutlinedTextField(value = num1, onValueChange = {num1=it},
                label = { Text(text = "Ingrese numero1")},
                trailingIcon = { Icon(imageVector = Icons.Default.Add, contentDescription = "num1") },
                leadingIcon = { Icon(imageVector = Icons.Default.KeyboardArrowRight, contentDescription = "num1") },
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
                modifier = Modifier.fillMaxWidth().padding(horizontal = 30.dp).padding(bottom = 30.dp)
            )

            OutlinedTextField(value = num2, onValueChange = {num2=it},
                label = { Text(text = "Ingrese numero2")},
                leadingIcon = { Icon(imageVector = Icons.Default.KeyboardArrowRight, contentDescription = "num1") },
                trailingIcon = { Icon(imageVector = Icons.Default.Add, contentDescription = "num2") },
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
                modifier = Modifier.fillMaxWidth().padding(horizontal = 30.dp).padding(bottom = 30.dp)
            )


        }


    }

}

@Preview(showBackground = true)
@Composable
fun viewV() {
    view1()
}