package com.lost.holamundkotlin

open class Dog {

    open fun sayHello() {
        println("wow wow!")
    }
}

class Yorkshire : Dog() {
    override fun sayHello() {
        println("wif wif!")
    }
}

fun main() {
    val dog: Dog = Yorkshire()
    dog.sayHello()

    var x = myFunction()

}

fun myFunction():Unit{
    println("Hola")
    println("adios")
}