package com.example.medicaladminapp.allUsers

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Face
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.medicaladminapp.viewmodel.AllUsersViewModel


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AddProduct(allUsersViewModel: AllUsersViewModel, navHostController: NavHostController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        val name = remember { mutableStateOf("") }
        val price = remember { mutableStateOf("") }
        val category = remember { mutableStateOf("") }
        val stock = remember { mutableStateOf("") }
        val context = LocalContext.current

        Text(
            text = "Enter the product details:",
            fontSize = 32.sp,
            fontWeight = FontWeight.Bold,
            color = MaterialTheme.colorScheme.primary
        )

        Spacer(modifier = Modifier.size(25.dp))

        OutlinedTextField(
            value = name.value,
            onValueChange = { name.value = it },
            placeholder = {
                Text(
                    text = "Enter Product Name",
                    fontSize = 14.sp,
                    color = Color.Gray
                )
            },
            modifier = Modifier.fillMaxWidth(),
            label = { Text(text = "Name", fontSize = 16.sp) },
            leadingIcon = { Icon(Icons.Filled.Face, contentDescription = "Face Icon") },
            colors = TextFieldDefaults.outlinedTextFieldColors(
                focusedBorderColor = MaterialTheme.colorScheme.primary,
                unfocusedBorderColor = Color.Gray
            )
        )

        Spacer(modifier = Modifier.size(20.dp))

    }
}