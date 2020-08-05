package com.achauwu.kotlinbasics

fun main(){

    //soal pertama

    val lampu = "hijau"
    if (lampu == "merah"){
        println("di mohon untuk berhenti berkendara")
    }else if (lampu == "kuning"){
        println("di mohon untuk berhati hati dalam berkendara")
    }else if (lampu == "hijau"){
        println("silahkan teruskan perjalanan")
    }else{
        println("bebas deh")
    }

    //soal kedua

    val nilai = 60
    if (nilai >= 90){
        println("selamat kamu lulus")
    } else if (nilai <= 70){
        println("maaf kamu engk lulus brou")
    }

    //boolean
    val panas = true
    if (panas){
        println("yh betul hari ini panas")
    }

    //percabangan when 1

    val kelas = 1
    when(kelas){
        1 -> println("baru sd")
        6 -> println("udah mau lulus sd")
        7 -> {
            println("baru masuk smp")
            println("udah smp")
        }
        9 -> println("mau lulus smp")
        else -> println("ngga tau ah")
    }

    //percabangan when handphone

    val handphone = "xiaomi"
    when(handphone){
        "iphone" -> println("256GB 2GB RAM")
        "samsung" -> println("128GB 8GB RAM")
        "xiaomi" -> println("64GB 4GB RAM")
        "vivo" -> println("32GB 4GB RAM")
        "oppo" -> println("64GB 4GB RAM")
    }

    //percabangan when jajan
    val uang = 100
    when(uang){
        in 5..10 -> println("aku akan jajan seblak")
        in 20..50 -> println("aku akan jajan kokumi")
        in 70..100 -> println("aku akan jajan bittersweet")
        else -> println("km nga bisa beli apa apa")
    }

    //any boolean
    val x : Any = true
    when(x){
        is Int -> println("$x is an Int")
        is Boolean -> println("$x is a Boolean")
        is String -> println("$x is a String")
        else -> println("$x Tidak ada di atas")

    }










}