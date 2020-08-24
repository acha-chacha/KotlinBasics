package com.achauwu.kotlinbasics

fun main(){
    myfFunction()
    println(addUp(5,2))
    println(avg(3.5,4.3))

}

fun myfFunction(){
    println("Aku belajar bahasa pemorograman kotlin")
}

fun addUp(a : Int, b : Int) : Int{
    return a*b
}

fun avg(a : Double, b : Double) : Double{
    return (a-b)/2
}
