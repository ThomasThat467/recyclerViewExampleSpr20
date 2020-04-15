package com.ericchee.recyclerviewexamplespr2020

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_person.*

class PersonActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_person)

        // Grab data from Intent's Extras
        val name = intent.getStringExtra(NAME_KEY)
        val position = intent.getIntExtra(POSITION_KEY, -1)
        val person = intent.getParcelableExtra<Person>(PERSON_KEY)

        // Utilize data
        tvNameActivity.text = "${person.name} is how old? ${person.age}"

        tvNameActivity.setOnClickListener {
            // to destroy/finish the activity (similar to going back)
            finish()
        }
    }


    companion object {
        // Keys for intents
        const val NAME_KEY = "NAME_KEY"
        const val POSITION_KEY = "POSITION_KEY"
        const val PERSON_KEY = "person_key"
    }
}
