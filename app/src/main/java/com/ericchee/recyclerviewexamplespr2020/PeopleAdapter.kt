package com.ericchee.recyclerviewexamplespr2020

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.DiffUtil

import androidx.recyclerview.widget.RecyclerView

class PeopleAdapter(initialListOfPeople: List<Person>): RecyclerView.Adapter<PeopleAdapter.PersonViewHolder>() {

    private var listOfPeople: List<Person> = initialListOfPeople.toList()  // This is so we create a duplicate of the list passed in
    var onPersonClickListener: ((person: Person) -> Unit)? = null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PersonViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_person, parent, false)
        return PersonViewHolder(view)
    }

    override fun getItemCount() = listOfPeople.size

    override fun onBindViewHolder(holder: PersonViewHolder, position: Int): Unit {
        val person = listOfPeople[position]
        holder.bind(person, position)
    }

    fun change(newPeople: List<Person>) {
        // Normal way up applying updates to list
//        listOfPeople = newPeople
//        notifyDataSetChanged()

        // Animated way of applying updates to list
        val callback = PersonDiffCallback(listOfPeople, newPeople)
        val diffResult = DiffUtil.calculateDiff(callback)
        diffResult.dispatchUpdatesTo(this)

        // We update the list
        listOfPeople = newPeople


    }

    inner class PersonViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        private val tvName = itemView.findViewById<TextView>(R.id.tvName)

        fun bind(person: Person, position: Int) {
            tvName.text = person.name

            itemView.setOnClickListener {
                onPersonClickListener?.invoke(person)
            }
        }
    }

}