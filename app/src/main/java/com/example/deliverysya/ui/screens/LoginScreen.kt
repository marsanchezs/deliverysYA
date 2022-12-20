package com.example.deliverysya.ui.screens

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController

@Composable
fun loginScreen(navController: NavController) {
    //Las funciones Composables van en mayúscula fun LoginScreen(navController: NavController)
    login()
}

@Composable
fun login() {
    //fun Login() 
    Text("Login")
}

@Preview(showBackground = true)
@Composable
fun loginScreenPreview() {
    //fun LoginScreenPreview()
    login()
    //Login()
}
