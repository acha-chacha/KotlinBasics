package com.achauwu.kotlinbasics

fun main(){

    /*
    Array sering digunakan untuk menyimpan kumpulan data yang memiliki
    tipe data yang sama.

    Contoh, digunakan untuk menyimpan produk apa saja yang dibeli
    oleh pelanggan dalam sebuah sistem kasir.
     */

    //Menggunakan function arrayOf
    val produkYangDibeli = arrayOf("Susu Ultra", "Sari Roti", "Nutella")
    println(produkYangDibeli[1])

    /*
    kita membuat variable (penampung terlebih dahulu), lalu variable tersebut di isi dengan memanggil function arrayOf().
    arguments yang di isi di dalam function arrayOf adalah data yang ingin kita simpan di dalam array.
     */

    //arrayOf sendiri merupakan sebuah function yang dimana kita bisa menyimpan
    //berbagai macam tipe data yang berbeda beda di dalam suatu array
    val detailProduk = arrayOf("Susu Ultra", 1.5, 18000)
    println(detailProduk[0])

    //Bisa juga dengan contohnya membuat array khusus tipe data integer
    val jumlahProdukYangDibeli = intArrayOf(5, 1, 2)
    println(jumlahProdukYangDibeli[2])

    //Function array bisa untuk = integer, boolean, char, float, double

    //contoh lain
    val names = arrayOf("Acha", "Bilqis", "Dina", "Meisyell", "Haura")
    names[4] = "Firyal"
    println(names[4])

    val nilai = intArrayOf(10, 8, 9, 5)
    println(nilai[0])
    println(nilai[1])
    println(nilai[2])
    println(nilai[3])

    //array boleh null
    val binatang : Array<String?> = arrayOfNulls(5)
    binatang[0] = "Anjing"
    binatang[1] = "Monyet"
    binatang[2] = "Buaya"
    binatang[3] = null
    binatang[4] = "Singa"
    println(binatang[2])
}