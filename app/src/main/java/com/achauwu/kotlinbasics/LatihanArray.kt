package com.achauwu.kotlinbasics

fun main() {

    //satu
    val bulan = arrayOf("Januari", "Februari", "Maret", "April", "Mei", "Juni", "Juli", "Agustus", "September", "Oktober", "November", "Desember")
    println(bulan[2])

    //dua
    val nilai = intArrayOf(90, 83, 78, 88, 50)
    println(nilai[4])

    //tiga
    val arrayBoolean = booleanArrayOf(true, false)
    println(arrayBoolean[0])
    println(arrayBoolean[1])

    val arrayFloat = floatArrayOf(1.2f, 2.3f, 3.5f)
    println(arrayFloat[0])
    println(arrayFloat[1])
    println(arrayFloat[2])

    val arrayChar = charArrayOf('a', 'b', 'c')
    println(arrayChar[0])
    println(arrayChar[1])
    println(arrayChar[2])

    val arrayDouble = doubleArrayOf(1.4, 9.2, 4.5)
    println(arrayDouble[0])
    println(arrayDouble[1])
    println(arrayDouble[2])

    //empat
    val makanan : Array<String?> = arrayOfNulls(5)
    makanan[0] = "Cilok"
    makanan[1] = "Cimol"
    makanan[2] = "Cireng"
    makanan[3] = null
    makanan[4] = "Bakso"
    println(makanan[1])

    //lima
    val chocolate = arrayOf("Snickers", "Silverquin", "Toblerone", "DairyMilk", "Daim")
    chocolate[4] = "Hersheys"
    println(chocolate[4])
}