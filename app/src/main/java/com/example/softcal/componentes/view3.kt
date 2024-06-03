package com.example.softcal.componentes

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.PopupProperties

@Composable
fun view3() {
    var expanded by remember { mutableStateOf(false) }
    var selectedOption by remember { mutableStateOf("Selecciona una opción") }
    val opciones = listOf("Aritmética", "Geometría", "Álgebra", "Cálculo")


    var valor ="hola"


    Column (modifier = Modifier.fillMaxSize())
    {
        Text(text = "${valor}")

        Box(modifier = Modifier.padding(16.dp)) {
            Column {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .clickable { expanded = true }
                        .padding(20.dp)
                        .clip(CircleShape)
                        .background(Color.LightGray),
                    contentAlignment = Alignment.Center
                ) {
                    Text(
                        text = selectedOption,
                        fontSize = 16.sp,
                        color = Color.Black,
                        modifier = Modifier.padding(16.dp)
                    )
                }
                DropdownMenu(
                    expanded = expanded,
                    onDismissRequest = { expanded = false },
                    properties = PopupProperties(focusable = false),
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(Color.White)  // Color de fondo del menú desplegable
                ) {
                    opciones.forEach { opcion ->
                        DropdownMenuItem(
                            onClick = {
                                selectedOption = opcion
                                expanded = false
                                when (opcion) {
                                    "Aritmética" -> {valor="aritmetica"}
                                    "Geometría" -> {valor="geometria"}
                                    "Álgebra" -> {valor="Aalgrebra"}
                                    "Cálculo" -> {valor="Calculo"}
                                }
                            },
                            text = {
                                Text(
                                    opcion,
                                    color = Color.Black // Color del texto de las opciones
                                )
                            }
                        )
                    }
                }
            }
        }




    }


}


@Preview(showBackground = true)
@Composable
fun view3V() {
    view3()

}