package com.ericchee.recyclerviewexamplespr2020

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.ericchee.recyclerviewexamplespr2020.PersonActivity.Companion.NAME_KEY
import com.ericchee.recyclerviewexamplespr2020.PersonActivity.Companion.PERSON_KEY
import com.ericchee.recyclerviewexamplespr2020.PersonActivity.Companion.POSITION_KEY
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Data set
        val listOfPeople =     mutableListOf(
            Person("11spongebob", "Spongebob", 35),
            Person("24squidward", "Squidward", 39),
            Person("44ericchee", "Eric Chee", 39),
            Person("78clint", "Clint", 29),
            Person("32thanoswasright", "Thanos was right", 30),
            Person("52stark", "Stark", 65),
            Person("47hulk", "Hulk", 26),
            Person("17patrick", "Patrick", 59),
            Person("36dr.oz", "Dr. Oz", 45),
            Person("77babyyoda", "Baby Yoda", 41),
            Person("66dave", "Dave", 44),
            Person("54null", "null", 18),
            Person("88pointer", "pointer", 31),
            Person("86tyrionlanister", "Tyrion Lanister", 41),
            Person("19willsmith", "Will Smith", 21),
            Person("49elsa", "Elsa", 31),
            Person("57eminem", "Eminem", 56)
        )

        // Create adapter (may want to save it as property)
        val personAdapter = PeopleAdapter(listOfPeople)

        // Set on item Click for the adapter
        personAdapter.onPersonClickListener = { somePerson: Person ->

            val intent = Intent(this, PersonActivity::class.java)
//            intent.putExtra(NAME_KEY, name)
////            intent.putExtra(POSITION_KEY, pos)
//
            intent.putExtra(PERSON_KEY, somePerson)

            startActivity(intent)


        }

        // endregion list

        btnChange.setOnClickListener {
            val newPeople = listOfPeople.apply {
                removeAt(0)
                removeAt(6)
                removeAt(10)
                removeAt(6)

                shuffle()
            }

            personAdapter.change(newPeople)

        }


        rvPeople.adapter = personAdapter





    }





}
