package com.achauwu.kotlinbasics

fun main(){
    //OPERATOR ELVIS = ?:
    var nameNullable : String? = "Bilqis"
//    nameNullable = null

//    val nama = nameNullable ?: "Dina"
//    println("Name is $nama")

    //NOT NULL ASSERTION = !!
    //Fungsi nya mengubah tipe nullable ke tipe non-nullable, dan membuat
    // error "null pointer exception" jika tipe nullable tidak memiliki nilai

    println(nameNullable!!.toLowerCase())
}