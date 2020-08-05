package com.achauwu.kotlinbasics

fun main(){
    /*
    operator aritmatika
    1. pertambahan +
    2. pemgurangan -
    3. perkalian *
    4. pembagian /
    5. modulus (sisa hasil bagi) %
     */

    //contoh ke 1
    val hasilPertambahan = 5 + 3
    println(hasilPertambahan)

    //contoh ke 2
    val hasilModulus = 15 % 2
    println(hasilModulus)

    //contoh ke 3
    var hasilPerkalian = 5
    hasilPerkalian *= 2
    println(hasilPerkalian)

    //contoh ke 4
    val a = 20
    val b = 4
    val hasilPembagian = a / b
    println(hasilPembagian)

    //contoh ke 5 dalam bentuk tipe data
    val c = 5
    val d = 3
    val hasil = c / d
    println(hasil)

    /*
    operator pembanding
    1. == sama dengan
    2. != tidak sama dengan
    3. < lebih kecil
    4. > lebih besar
    5. <= kurang dari sama dengan
    6. >= lebih dari sama dengan
     */

    //contoh ke 1
    val isEqual = 5 == 3 //false brou
    println(isEqual)

    //contoh ke 2
    val isNotEqual = 5 != 5 //salah
    println("isNotEqual is $isNotEqual")

    //string interpolation
    println("is 5 greater 3 ${5 > 3}") //benar

    println("is -5 greater 3 ${-5 > 3}")

    println("is 5 lower equal 3 ${5 <= 3}")

    println("is 5 greater equal 3 ${5 >= 3}")

    println("is 5 greater equal 5 ${5 >= 5}")

    /*
    penugasan, peningkatan, dan penurunan operator
     */

    //penugasan operator
    // +=, -=, *=, /+, %=

    var myNumber = 5
    myNumber += 3
    println("myNumber is $myNumber")
    // 5 + 3 = 8 * 4 = 32

    //peningkatan operator
    //++ = menambah variable sebanyak 1 angka
    myNumber++
    println("myNumber is ${++myNumber}")

    //penurunan operator
    // -- = mengurangi variable sebanyak 1 angka
    println("myNumber is ${--myNumber}")

}