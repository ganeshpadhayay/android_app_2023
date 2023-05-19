package com.ganesh.myapplication.ui.screens.genre

import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import com.ganesh.myapplication.ui.component.MovieItemList

@Composable
fun GenreScreen(
    navController: NavController,
    genreId: String
) {
    val genreViewModel = hiltViewModel<GenreViewModel>()
    MovieItemList(
        navController = navController,
        movies = genreViewModel.moviesByGenre(genreId),
        null,
        null
    ){

    }
}