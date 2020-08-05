package com.achauwu.kotlinbasics

fun main (){
    //PERCABANGAT IF-ELSE

    //contoh pertama
    val tinggiOrangKe1 = 170
    val tinggiOrangKe2 = 189

    if(tinggiOrangKe1 > tinggiOrangKe2){
        println("Tinggi orang ke 1 kebih besar dari Tinggi orang ke 2")
    } else if (tinggiOrangKe1 == tinggiOrangKe2){
        println("Tinggi orang ke 1 sama dengan Tinggi orang ke 2")
    } else{
        println("tidak diketahui tinggi nya")
    }

    //contoh kedua

    val umur = 31
    if (umur >= 21){
        println("kamu boleh menikah")
    } else if (umur >= 18){
        println("kamu harus membuat KTP")
    } else if (umur >= 16){
        println("kamu boleh mengendarai motor")
    } else{
        println("kamu masih kecil")
    }

    //contoh ketiga
    val umur2 = 31

    if (umur2 >= 30)
        println("kamu lebih dari umut 30")

    //contoh keempat
    val nama = "Acha"

    if (nama == "Acha"){
        println("Selamat datang Acha")
    } else{
        println("siapa kamu?")
    }

    //contoh kelima
    val hujan = true
    if (hujan){
        println("hari ini hujan")
    }

    //percabangan when

    //contoh kesatu
    val musim = 5
    when(musim){
        1 -> println("musim semi")
        2 -> println("musim panas")
        3 -> {
            println("musim gugur Fall")
            println("musim gugur Autumn")
        }
        4 -> println("musim dingin")
        else -> println("musim tidak valid")
    }

    //contoh ke 2
    val bulan = 3
    when(bulan){
        in 3..5 -> println("musim semi")
        in 6..8 -> println("musim panas")
        in 9..11 -> println("musim gugur")
        in 12 downTo 1 -> println{"musim dingin"}
        else -> println("musim tidak valid")
    }

    //contoh ke 3
    val umur3 = 21

    when(umur3){
        !in 0..20 -> println("kamu boleh menikah")
        in 18..20 -> println("kamu harus membuat ktp")
        16,17 -> println("kamu boleh mengendarai motor")
        else -> println("kamu masih terlalu kecil untuk melakukan sesuatu")
    }

    //contoh keempat
    val x : Any = 13.37
    when(x){
        is Int -> println("$x is an Int")
        is Double -> println("$x is a Double")
        is String -> println("$x is a String")
        else -> println("$x Tidak ada di atas")

    }

    val x2 : Any = 13.37f
    when(x2){
        is Int -> println("$x2 is an Int")
        !is Double -> println("$x2 is a Double")
        is String -> println("$x2 is a String")
        else -> println("$x2 Tidak ada di atas")

    }


}