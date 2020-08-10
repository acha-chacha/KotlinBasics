package com.achauwu.kotlinbasics

fun main(){
    //LOOPING (PERULANGAN)

    //Perulangan While

    //Perulangan while menjalankan kode berulang kali selama kondisi yang diberikan benar


    //contoh ke 1
    var angka1 = 1

    while (angka1 <=10){
        print("$angka1 ")
        angka1++
    }
    println("Perulangan While Selesai")

    //contoh ke 2
    var a = 100

    while (a >= 0){
        print("$a ")
        a -= 2
    }
    println("\nPerulangan While Selesai")

    //contoh ke 3
    var rasaSuhu = "Dingin"
    var suhuRuangan = 16

    while (rasaSuhu == "Dingin"){
        print("$suhuRuangan")
        rasaSuhu = "Nyaman"
        println("\nSekarang suhu nya nyaman")
    }

    //PERULANGAN FOR
    // perulangan for di gunakan untuk melakukan array

    //contoh ke 1
    for(number in 1..10){
        print("$number ")
    }

    println("_______________________")

    //contoh ke 2
    for (i in 1 until 10){
        print("$i ")
    }

    println("_______________________")

    //contoh ke 3
    for (a in 10 downTo 1){
        print("$a ")
    }

    println("_______________________")

    //contoh ke 4
    for (b in 10 downTo 1 step 2){
        print("$b ")
    }

    println("_______________________")

    //contoh ke 5
    val banyakKota = listOf("Jakarta", "Surabaya", "Bandung", "Malang", "Jogja")
    for (kota in banyakKota){
        print("$kota ")
    }



}