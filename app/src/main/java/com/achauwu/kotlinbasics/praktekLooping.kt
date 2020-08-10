package com.achauwu.kotlinbasics

fun main(){

    //soal pertama

    var angka2 = 15

    while (angka2 <=50){
        print("$angka2 ")
        angka2++
    }

    println("_______________")

    //soal kedua

    var angka3 = 20

    while (angka3 <=25){
        print("$angka3 ")
        angka3++
    }

    println("_______________")

    //soal ke 3

    var c = 25

    while (c >= 10){
        print("$c ")
        c -= 2
    }
    println("\nPerulangan While Selesai")


    //soal ke 4

    for (b in 50..100 step 2){
        print("$b ")
    }

    println("_______________")

    //soal ke 5
    for (o in 25 until 30 ){
        print("$o ")
    }

    println("_______________")

    //soal ke 6

    val makanans = listOf("Ketoprak", "Seblak", "Cilok", "Nasi", "Gorengan")
    for (food in makanans){
        print("$food ")
    }



}
