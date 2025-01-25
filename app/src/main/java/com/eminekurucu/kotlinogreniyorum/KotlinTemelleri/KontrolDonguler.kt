package com.eminekurucu.kotlinogreniyorum.KotlinTemelleri

fun main(){
    // If Statemenst
    println("---If Statements---")

    // increment i++ ve ++i
    // i++ önce i sonra i+1 yazdırı / ++i direkt i+1 yazdırır
    var sayi = 10
    println(sayi++) // 10
    println(sayi) // 11
    println(++sayi) //12
    println(sayi) // 12
    println("-----")

    var say = 9
    println(say) //9
    say++
    println(say) // 10
    ++say
    println(say) // 11
    say--
    println(say) // 10
    --say
    println(say) // 9


    println("-------")


    // decrement --i ve i--
    var sayi2 = 8
    println(sayi2) // 8
    println(sayi2--)//8
    println(sayi2) // 7
    println(--sayi2) // 6
    println(sayi2) // 6
    println("----")

    // REMAINDER
    println(10%3) // kalanı bulur : 1

    // IF - ELSE IF - ELSE
    println("----if-else if- else---")

    var skor = 30
    if (skor <= 10){
        println("Skorunuz kotu.")
    } else if (skor >=11 && skor <= 20){
        println("Skorunuz fena degil.")
    }else if (skor >=21 && skor <=30){
        println("Skorunuz iyi.")
    } else {
        println("Skorunuz muhtesem.")
    }
    // if içine boolean değer döndürebiln her şey yazılabilir
    println("------")

    // When Kontrolleri
    println("---When---")
    // when ile yapılanlar if else ile de yapılabilir
    // çok fazla içiçe if else istemezsen when kullan

    val notRakam = 3
    var notString = ""

    if (notRakam == 0){
        notString = "Gecersiz not"
    } else if (notRakam == 1){
        notString = "Zayif"
    } else if (notRakam == 2){
        notString = "Kotu"
    } else if (notRakam == 3){
        notString = "Orta"
    } else if (notRakam == 4){
        notString = "Iyi"
    } else {
        notString ="Pek iyi"
    }

    println("Notunuz: ${notRakam} : ${notString}.")

    // When ile hali
    when(notRakam){ // bağımsız değişken içeri yazılır
    0 -> notString = "Gecersiz not"
    1 -> notString = "Zayif"
    2 -> notString = "Kotu"
    3 -> notString = "Orta"
    4 -> notString = "Iyi"
    5 -> notString = "Pek iyi"
    }

    println("Notunuz : ${notRakam} : ${notString}.")
    println("-----")

    // Döngüler
    println("---While Dongusu---")

    var j = 0
    while (j < 10){
        println(j)
        j++
    } // 0-9 arası yazdırır

    println("-----")

    println("---For Dongusu---")
    // for döngüsü genelde bir veri yapısı ile beraber kullanılır (list,map,array,set)

    var baskaDizi = arrayListOf(5,10,15,20,25,30)
    baskaDizi.forEach {
        println(it / 5 * 3 )
    } //alt alta 3 6 9 12 15 18
    println("-------")
    for (numara in baskaDizi){
        println(numara / 5 * 4)
    } // 4 8 12 16 20 24
    println("----")

    for (num in 0..9 ){ // for (num in 0..9 yazdık)
        println(num)
    } //0-9 arasını yazdırır
    println("-----")

    var stringDizi = arrayListOf("Okan", "Fatma", "Can ", "Kerem")
    for (kelime in stringDizi){
        println(kelime.uppercase())
    } // alt alta OKAN CAN FATMA KEREM

    // aşağıdaki bir lambda fonksiyonu
    stringDizi.forEach { kelime -> // it yerine kelime atadık
        println(kelime.lowercase())
    } // okan fatma can kerm




}
