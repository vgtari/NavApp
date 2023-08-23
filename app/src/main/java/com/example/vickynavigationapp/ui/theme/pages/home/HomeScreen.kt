package com.example.vickynavigationapp.ui.theme.pages.home

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.vickynavigationapp.ui.theme.VickyNavigationAppTheme

@Composable
fun HomeScreen(navHostController: NavHostController){
    Text(text = "Welcome to home screen")
}
@Preview
@Composable
fun HomeScreenPreview(){
    VickyNavigationAppTheme {
        HomeScreen(rememberNavController())
    }
}