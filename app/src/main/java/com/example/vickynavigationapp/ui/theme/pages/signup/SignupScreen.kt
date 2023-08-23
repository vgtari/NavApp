package com.example.vickynavigationapp.ui.theme.pages.signup

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.vickynavigationapp.ui.theme.VickyNavigationAppTheme

@Composable
fun SignupScreen(navController: NavController) {
    Text(text = "Welcome to signup screen")
}
@Preview
@Composable
fun SignupScreen(){
    VickyNavigationAppTheme {
        SignupScreen(rememberNavController())

    }
}