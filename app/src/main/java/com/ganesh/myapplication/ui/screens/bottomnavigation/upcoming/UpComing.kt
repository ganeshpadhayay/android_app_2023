package com.ganesh.myapplication.ui.screens.bottomnavigation.upcoming

import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import com.ganesh.myapplication.data.model.GenreId
import com.ganesh.myapplication.data.model.moviedetail.Genre
import com.ganesh.myapplication.ui.component.MovieItemList


@Composable
fun Upcoming(
    navController: NavController,
    genres: ArrayList<Genre>? = null,
) {
    val upComingViewModel = hiltViewModel<UpComingViewModel>()
    MovieItemList(
        navController = navController,
        movies = upComingViewModel.upcomingMovies,
        genres = genres,
        selectedName = upComingViewModel.selectedGenre.value
    ) {
        upComingViewModel.filterData.value =  GenreId(it?.id.toString())
        it?.let {
            upComingViewModel.selectedGenre.value = it
        }
    }
}