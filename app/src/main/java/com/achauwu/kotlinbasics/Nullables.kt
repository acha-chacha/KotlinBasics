package com.achauwu.kotlinbasics

fun main(){
    //NULL artinya KOSONG
    //NULL adalah error yang sering programmer dapatkan
    //yaitu "Null Pointer Exception"
    //NULL di sebut juga The Billion Dollar Mistake

    var name : String = "Haura"
    //name = null -> Compilation Error

    //Memakai tanda tanya
    var nullableName : String? = "Haura"
//    nullableName = null

    var len1 = name.length

    var len2 = nullableName?.length
    println(nullableName?.toLowerCase())
    //Lower case = huruf kecil semua (tidak ada kapital)

    nullableName?.let { println(it.length)}
}