package com.eminekurucu.kotlinogreniyorum.KotlinTemelleri

fun main(){
    /*
    try {
        //code
    } catch (e: Exception){
        // handler
    } finally {
        // code
    }

     */

    // throw Exception("Hi There!")

    /*
    val ornekString = "Atil"
    val integerString = ornekString.toInt() // hata verir NumberFormatException

     */

    fun intOrNullFonksiyon(str : String) : Int? {
        try {
            var integerStr = str.toInt()
            return integerStr
        } catch (e: Exception){
            e.printStackTrace() // hatanın ne olduğunu uygulamayı çökertmede yazdırır
        }
        return  null
    }

    println(intOrNullFonksiyon("atil"))
    println(intOrNullFonksiyon("17"))

}