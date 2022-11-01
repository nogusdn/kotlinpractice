package com.example.firstpractice

open class Human ( val name : String = "Anonymous") {

    constructor(name: String, age: Int) : this(name){
        println("my name is ${name}, ${age}years old")
    }

    init {
        println("New human has been born!!")
    }

    fun eatingCake(){
        println("This is so YUMMY")
    }

    open fun singAsong(){
        println("lalala")
    }
}

class Korean : Human(){
    override fun singAsong(){
        super.singAsong()
        println("랄라랄")
    }
}

fun main(){
    val korean = Korean()
    korean.singAsong()
//    val human = Human("HyeonU")
//    val stranger = Human()
//    human.eatingCake()

//    val mom = Human("Ryu", 14)


//    println("This human's name is ${stranger.name}")
}