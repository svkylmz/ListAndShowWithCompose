package com.svkylmz.listandshowwithcompose.repository

import com.svkylmz.listandshowwithcompose.model.Person

class PersonRepository {
    fun getAllData(): List<Person> {
        return listOf(
            Person(
                id = 0,
                name = "Şevket Yılmaz",
                age = 25
            ),
            Person(
                id = 1,
                name = "John Doe",
                age = 27
            ),
            Person(
                id = 2,
                name = "Name Surname",
                age = 18
            ),
            Person(
                id = 3,
                name = "Test Test",
                age = 35
            ),
            Person(
                id = 4,
                name = "Test1 Test2",
                age = 38
            ),
            Person(
                id = 5,
                name = "Test1 Test2",
                age = 44
            ),
            Person(
                id = 6,
                name = "Test1 Test2",
                age = 52
            ),
            Person(
                id = 7,
                name = "Test1 Test2",
                age = 27
            ),
            Person(
                id = 8,
                name = "Test1 Test2",
                age = 34
            )
        )
    }
}