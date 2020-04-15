package com.ericchee.recyclerviewexamplespr2020

open class Car(var name: String, val make: Int) {

}

class ElectricCar(name: String, make: Int, private val powerLevel: Int): Car(name, make) {

}



fun main() {
    val newCar = Car("Toyota", 1234)

}


class Baz {
    val hellaLargeFreakinObject: HellaLargeFreakinObject by lazy { HellaLargeFreakinObject() }

    fun modifyHellaLargeObject() {
        this.hellaLargeFreakinObject.change()
    }




}

class HellaLargeFreakinObject {
    fun change() {

    }
}


//    listOf(
//        Person("11spongebob", "Spongebob", 35),
//        Person("24squidward", "Squidward", 39),
//        Person("44ericchee", "Eric Chee", 39),
//        Person("78clint", "Clint", 29),
//        Person("32thanoswasright", "Thanos was right", 30),
//        Person("52stark", "Stark", 65),
//        Person("47hulk", "Hulk", 26),
//        Person("17patrick", "Patrick", 59),
//        Person("36dr.oz", "Dr. Oz", 45),
//        Person("77babyyoda", "Baby Yoda", 41),
//        Person("66dave", "Dave", 44),
//        Person("54null", "null", 18),
//        Person("88pointer", "pointer", 31),
//        Person("86tyrionlanister", "Tyrion Lanister", 41),
//        Person("19willsmith", "Will Smith", 21),
//        Person("49elsa", "Elsa", 31),
//        Person("57eminem", "Eminem", 56),
//    )

/*
class PersonDiffUtilCallback(
    private val oldPeople: List<String>,
    private val newPeople: List<String>
): DiffUtil.Callback() {

    override fun areItemsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
        return oldPeople[oldItemPosition] == newPeople[newItemPosition]
    }

    override fun getOldListSize(): Int = oldPeople.size

    override fun getNewListSize(): Int = newPeople.size

    override fun areContentsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
        return oldPeople[oldItemPosition] == newPeople[newItemPosition]
    }
}





    val callback = PersonDiffUtilCallback(listOfPeople, newList)
    val diffResult = DiffUtil.calculateDiff(callback)
    diffResult.dispatchUpdatesTo(this)
    listOfPeople = newList
 */

