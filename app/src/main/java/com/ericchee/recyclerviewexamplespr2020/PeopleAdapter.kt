package com.ericchee.recyclerviewexamplespr2020

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

import androidx.recyclerview.widget.RecyclerView

class PeopleAdapter(private val listOfPeople: List<String>): RecyclerView.Adapter<PeopleAdapter.PersonViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PersonViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_person, parent, false)

        return PersonViewHolder(view)
    }

    override fun getItemCount() = listOfPeople.size

    override fun onBindViewHolder(holder: PersonViewHolder, position: Int) {
        val personsName = listOfPeople[position]
        holder.bind(personsName)
    }

    class PersonViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        private val tvName = itemView.findViewById<TextView>(R.id.tvName)

        fun bind(name: String) {
            tvName.text = name
        }
    }

}