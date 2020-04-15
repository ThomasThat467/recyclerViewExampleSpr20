package com.ericchee.recyclerviewexamplespr2020

import androidx.recyclerview.widget.DiffUtil

/**
 * Used for animation changes
 */
class PersonDiffCallback(
    private val oldPeople: List<Person>,
    private val newPeople: List<Person>
): DiffUtil.Callback() {


    override fun getOldListSize(): Int = oldPeople.size

    override fun getNewListSize(): Int = newPeople.size

    override fun areItemsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {

        val oldPerson = oldPeople[oldItemPosition]
        val newPerson = newPeople[newItemPosition]

        return oldPerson.id == newPerson.id
    }

    override fun areContentsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
        val oldPerson = oldPeople[oldItemPosition]
        val newPerson = oldPeople[newItemPosition]
        return oldPerson.name == newPerson.name
    }
}