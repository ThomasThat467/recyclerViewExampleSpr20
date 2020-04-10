package com.ericchee.recyclerviewexamplespr2020

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val listOfPeople = listOf("Spongebob", "Squidward", "Eric Chee", "Clint", "Thanos was right", "Stark", "Chortle", "Patrick", "Dr. Oz", "Baby Yoda", "Dave", "null", "pointer", "This lecture sucks yoooo wtf is a list")

        val personAdapter = PeopleAdapter(listOfPeople)

        rvPeople.adapter = personAdapter


    }


}
