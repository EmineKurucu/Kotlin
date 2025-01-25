package com.eminekurucu.kotlinogreniyorum.KotlinTemelleri
var sayac = 10
fun main(){
    birinciFonfksiyon()
    ikinciFonksiyon()
    deduct(258, 126) // 132
    var sonuc = sum(356 , 147) // bu sonuc bir integer
    val sonuc_cikarma = deduct(5,3) // bu sonuc bir unit
    println(sonuc_cikarma) // kotlin.unit : yani değişkene atama için return yapmak gerekir
    println("Return edilen sonuc: ${sonuc}") // 503

    // SuperKahraman sınıfına ait object(instance) oluşturuyoruz
    val superman = SuperKahraman("Clark Kent", 30, "Journalist")
    println(superman.meslek) // Journalist
    println(superman.isim) // Clark Kent
    println(superman.age) // 30

    val batman = SuperKahraman("Bruce Wayn", 32, "Businessman")
    println(batman.isim)
    println(batman.age)
    println(batman.meslek)

    // Nullability
    println("---Nullability---")
    // hesap makinesi vb yaparken kullanıcı girdi değerine int yapılamaz bir değer girerse:

    var kullaniciGirdisi = "kemal"
    var kullaniciGirdisiInteger = kullaniciGirdisi.toIntOrNull() // inte çeviremezse null döndürü
    if (kullaniciGirdisiInteger != null){
        println(kullaniciGirdisiInteger * 5 )
    } else {
        println("null")
    }

    // değişkeni nullability'ye göre de oluşturabiliriz.
    var benimDouble : Double? = null // double olabilir olmaya dabilir ama null'a initialize ettik
    // benimDouble.div(2) hata verir null

    var kullaniciGirdisiDouble = kullaniciGirdisi.toDoubleOrNull()

    // !! kesin eminim double dönecek demek
    // kullaniciGirdisiDouble!!.div(2)  şu an değer null hata verir

    // ? işlem sonucu null gelse de uygulama çökmez
    kullaniciGirdisiDouble?.div(2)

    // elvis operatörtü ?:
    println(kullaniciGirdisiDouble?.div(2) ?: 20) // 20
    // null değil değer gelirse onu , null gelirse 20'yi yazdırır.

    // 5. yöntem null değilse çalıştırılır : let
    kullaniciGirdisiDouble?.let {
        println(it * 2) // null değilse çalışır , null ise uygulama çökmez
    }

}



fun birinciFonfksiyon(){
    sayac++
    println("birinci fonksiyon calistirildi.")

}

fun ikinciFonksiyon(){
    println("ikinciFoncksiyon su kadar calistirildi: ${sayac}")

}

// girdi almak
fun deduct(a:Int , b:Int ){
    println(a - b)
}

// çıktı vermek : return
fun sum(num1:Int, num2:Int) : Int { // int return edeceğimizi bildirdik
    return num1 + num2
}
