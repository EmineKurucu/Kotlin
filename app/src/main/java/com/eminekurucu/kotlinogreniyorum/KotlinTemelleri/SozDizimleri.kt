package com.eminekurucu.kotlinogreniyorum.KotlinTemelleri

fun main(){
    println("Satir yazdirma fonksiyonudur.")
    // yorum satiri kullanımı
    println(10/2 + 10*5) // bolme islemi integer bolme

    // KOTLINDE VERI TIPLERI VE DEGISKENLER
    // TAM SAYILAR = INTEGER
    println("------Integer--------")
    var x = 10 // var: variable oluştururken kullanılan keyword
    println(x)
    println(x * 20)

    x = 30 // değişkeni oluşturduktan sonra istediğin zaman değeri değiştir. reassign
    println(x * 2)

    println("---Implicit Tanimlama----")
    val z = 12 // val ile tanımlanan sabittir reassign edilemez
    println(z)
    // z = 20 // hata verir

    // long short byte değişkenler de int değerlere atanabilir
    println("---Explicit tanimlama-----")
    var ornekLong : Long = 10
    println(ornekLong)
    var ornekShort : Short = 2
    println(ornekShort)
    var ornekByte : Byte = 15
    println(ornekByte)

    // değişken isimlendirme snake_case / camelCase

    // Double-Float Kesirli Sayılar
    println("---Double-Float---")
    val pi = 3.14
    println(pi / 2) // 1.57
    println(5/2) // 2 integer/integer = integer

    // float tanımlarken sonuna f koy / kotlin double kullanmayı destekler
    val ornekFloat : Float = 2.25f
    println(ornekFloat)

    //STRING
    println("---STRING---")
    var BenimString = "Sting boyle tanimlanir"
    println(BenimString)

    var charTanimlama = 'c' // white spaceler \n gibi de char
    println(charTanimlama)

    var isim = "burak"
    println(isim.uppercase())
    println(isim.length) // 5
    println(isim.lowercase())
    println(isim.replace('u', 'i')) // birak

    var soyisim = "batmaz"
    println(isim + " " +soyisim)

    var sonradanAtama : String // değişken oluşturup sonradan atama yapabiliriz
    sonradanAtama = "Sonradan deger atadik"
    println(sonradanAtama)

    // Conversion
    println("---Conersion---")
    // klavyeden alınan değer string olarak geçer sayı bile girilse
    var deger = "15"
    deger.toInt() //  artık ınteger
    println(deger+12)
    println(deger.toInt()+12)
    val yasInt = deger.toInt()
    println(yasInt + 32)

    println("---Boolean---")
    // Boolean True False || or && and ! not
    var BooleanTanim : Boolean = true
    println(BooleanTanim)
    BooleanTanim = false
    println(BooleanTanim)
}