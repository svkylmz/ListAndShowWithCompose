package com.svkylmz.listandshowwithcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.svkylmz.listandshowwithcompose.repository.PersonRepository
import com.svkylmz.listandshowwithcompose.ui.theme.ListAndShowWithComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ListAndShowWithComposeTheme {
                MainScreen()
            }
        }
    }
}

@Composable
fun MainScreen() {
    val personRepository = PersonRepository()
    val getAllData = personRepository.getAllData()

    LazyColumn(
        modifier = Modifier.padding(12.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp),
    ) {
        items(items = getAllData) { person ->
            CustomItem(person = person)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ListAndShowWithComposeTheme() {
    MainScreen()
}
