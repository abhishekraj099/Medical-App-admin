package com.example.medicaladminapp.navigation


import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.toRoute
import com.example.medicaladminapp.allUsers.AddProduct
import com.example.medicaladminapp.allUsers.AllProducts
import com.example.medicaladminapp.allUsers.AllUsers
import com.example.medicaladminapp.allUsers.DetailsScreen
import com.example.medicaladminapp.viewmodel.AllUsersViewModel



@Composable
fun NavGraph(allUsersViewModel: AllUsersViewModel, navHostController: NavHostController) {
    NavHost(navController = navHostController, startDestination = Routes.AllUsers) {
        composable<Routes.AllUsers> {
            AllUsers(allUsersViewModel, navHostController)
        }

        composable<Routes.DetailsScreen> {
            val data: Routes.DetailsScreen = it.toRoute()
            DetailsScreen(
                user = data,
                allUsersViewModel = allUsersViewModel,
                navHostController = navHostController
            )
        }

        composable<Routes.AddProduct> {
            AddProduct(allUsersViewModel = allUsersViewModel, navHostController = navHostController)
        }

        composable<Routes.AllProducts> {
            AllProducts(allUsersViewModel = allUsersViewModel, navHostController = navHostController)
        }
    }
}