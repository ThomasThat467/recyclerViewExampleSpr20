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