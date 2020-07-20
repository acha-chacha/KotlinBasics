package com.achauwu.kotlinbasics

fun main(){
    //tipe data angka

    //tipe data byte = 8 bit = 2 angka
    val myByte : Byte = 13

    //tipe data short = 16bit = 5 angka
    val myShort : Short = 12345

    //tipe data Int/Integer = 32bit = 10 angka
    val myInt : Int = 12345_12345

    //tipe data long = 64bit = 19 angka
    val myLong : Long = 123_456_7989_123_456_789

    //tipe data angka titik

    //tipe data float = 32bit
    val myFloat = 12.342F

    //tipe data double = 64bit
    val myDouble : Double = 8.8282828828

    /*
    ada 2 cara membuat tipe data
    1. tipe inference (simple)
    2. menetapkan tipe data nya
     */

    //tipe data Boolean, Char, dan String

    //Tipe data boolean
    var isSunny = true
     isSunny = false

    //tipe data Char
    val letterChar = 'H'
    val digitChar = '1'
    val signChar = '&'

    //tipe data String
    val myString = "Hello Acha"

    //String
    val myString2 = "Hello Kamu"
    val firstChar = myString2[0]
    val lastChar = myString2[myString2.length - 1]
    println("First Character "+ firstChar)
    println("Last Character "+ lastChar)

}

