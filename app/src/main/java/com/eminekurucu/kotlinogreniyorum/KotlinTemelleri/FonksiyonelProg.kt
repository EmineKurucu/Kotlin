package com.eminekurucu.kotlinogreniyorum.KotlinTemelleri

fun main(){
    println("---Lambda---")

    yazdigimiYazdir("Kahve")

    val yazdirdigimiYazdirLambda = {verilenString : String -> println(verilenString) }
    yazdigimiYazdir("test yazdir")

    // lambda ile sadece return de edilebilir
    val carpmaIslemiLambda = {a: Int, b: Int -> a*b}
    println(carpmaIslemiLambda(8,7)) // 56

    val carpmaIslemiIkinciVer : (Int, Int) -> Int = {a, b -> a*b}
    println(carpmaIslemiIkinciVer(5,3)) // 15
    println()

    println("---High Order Functions---")
    println("---Filter---")

    val benimListem = arrayListOf(1,3,5,7,9,11,13,15,17,19)
    val _10dankucukler = benimListem.filter { num -> num < 10  }
    for (number in _10dankucukler){
        println(number)
    } // alt alta 1 3 5 7 9
    println()

    val _6dankucukler = benimListem.filter { it < 6 }
    for (nm in _6dankucukler){
        println(nm)
    } // alt alta 1 3 5

    println()
    println("---Map---")
    val hepsininKaresi = benimListem.map { num -> num * num }
    for (say in hepsininKaresi){
        println(say)
    } // alt alta 1 9 .... 289 361
    println()

    val hepsininKaresiDiger = benimListem.map{it * it }
    for (sayi in hepsininKaresiDiger){
        println(sayi) // 1 9 ... 289 361
    }
    println()

    val _10danKucukKaresi = benimListem.filter { it < 10 }.map { it * it }
    _10danKucukKaresi.forEach{println(it)} // 1 9 25 49 81
    println()

    val sanatci1 = Sanatci("Okan", 28, "Gitar")
    val sanatci2 = Sanatci("Can",34, "Gitar")
    val sanatci3 = Sanatci("Kerem", 36, "Bateri")
    val sanatcilar = arrayListOf<Sanatci>(sanatci1, sanatci2, sanatci3)

    val _30danBuyukSanatcilarinEnstrumanlari = sanatcilar.filter { it.yas > 30 }.map { it.enstruman }
    _30danBuyukSanatcilarinEnstrumanlari.forEach{ println(it) } // Gitar / Bateri
    println()

    val _35denKucuklerinIsimleri = sanatcilar.filter { it.yas < 35 }.map { it.isim }
    _35denKucuklerinIsimleri.forEach { println(it) } // Okan/ Can
    println()

    println("---Scope Fonksiyonlari---")
    println("---Let---")

    // let
    var benimInt : Int? = null
    benimInt = 10
    benimInt?.let {
        println(it)
    }// null değilse it'i yazdıracak

    val yeniInt = benimInt?.let {
        it + 10
    } ?: 0 // benimInt null gelirse 0 yazdırır
    println(yeniInt)
    println()

    println("---Also---")
    // also

    sanatcilar.filter { it.yas > 30 }.also{it.forEach { println(it.isim) } }
    // can kerem









}

fun yazdigimiYazdir(string: String){
    println(string)
}