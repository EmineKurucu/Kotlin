package com.eminekurucu.kotlinogreniyorum.KotlinTemelleri

fun main(){
    // içerisinde birden fazla veri tutabilen veri yaplarini görücez
    println("---Array(Dizi)---")
    val diziTanim = arrayOf("emine","buket","nisa","burcu")

    // dizilerde index mantığı geçerlidir
    println(diziTanim[0]) // emine
    println(diziTanim[2]) // nisa
    println(diziTanim.size)
    println(diziTanim.last())

    // val ile tanımlasak bile eleman sonradan değişebilir
    diziTanim[0] = "oya"
    println(diziTanim[0])
    println(diziTanim.get(1)) // buket

    // Dizilere sonradan eleman eklemek çıkarmak mümkün değil

    val numaraDizisi = arrayOf(1,10,20,15,32,66,108)
    println(numaraDizisi[3])
    println(numaraDizisi[5]*10)

    // karışık veri türleri de kullanılabilir
    val karisikDizi = arrayOf(1,3.14,20, "kelime", true)
    println(karisikDizi[2])
    println(karisikDizi[4])

    // ARRAY LİST (LİSTELER)
    println("---ArrayList---")
    // arraylerden daha esnek haldeler

    val arrayListTanim = arrayListOf("sena", "hamza", "meryem")
    println(arrayListTanim[2])

    //liste sonuna eleman ekleme
    arrayListTanim.add("mustafa")
    println(arrayListTanim[3])

    // eleman çıkarıladabilir
    // removeAt(index) index'teki elemanı çıkarır
    // remove(eleman) elemanı çıkarır

    // boş liste tanımlanabilir ama tür belirtilmeli
    val bosIntListe = arrayListOf<Int>() // boş int listesi oluşturduk
    val digerYol = ArrayList<String>() // boş str listesi

    bosIntListe.add(10)
    bosIntListe.add(25)
    bosIntListe.add(32)

    digerYol.add("bursa")
    digerYol.add("kalem")
    digerYol.add("kitap")

    println(bosIntListe[0])
    println(digerYol[2])

    // karışık türde boş liste  oluşturmak
    val karisikBosListe = arrayListOf<Any>() // <Any> ile oluşturulur Any bir sınıf
    karisikBosListe.add(46)
    karisikBosListe.add("aykut")
    karisikBosListe.add(false)
    println(karisikBosListe[2])

    // SETLER
    println("---Set---")
    // elemanlar unique olmalı aynı elemandan birden fazla koyarsan sadece birini alır
    val ornekSet = setOf(10,10,10,10,20,30,40)
    println(ornekSet.size) // 4 (10,20,30,40 bunları saydı)
    // setOf'la tanımlanınca sonradan eleman ekleme çıkarma yapılamaz

    // setler sıralanmamış elemanlardan oluşur : indexleme yok
    // içindeki elemanları döngüyle yazdırabiliriz
    ornekSet.forEach {
        println(it) // it her bir elemana denk gelir
    } // alt alta 10 20 30 40 yazdırır

    // boş string seti
    val bosSet = HashSet<String>()
    // Hash fonksiyonuyla oluşturup bir değer ararsak daha kısa zamanda bulup getirir
    // HashSet ile tanımlanınca sonradan ekleme çıkarma yapılabilir
    bosSet.add("murat")
    bosSet.add("ulku")
    bosSet.add("orhan")
    bosSet.add("murat")

    bosSet.forEach {
        println(it) // alt alta orhan ülkü murat yazdırır (sıralama ve eleman çiftlme yok)
    }

    // var olan listedeki duplike değerleri atmak için .toHashSet kullanılabilir
    // yukarıda tanımlı : val ornekSet = setOf(10,10,10,10,20,30,40)
    val ornekTekilSet = ornekSet.toHashSet()
    ornekTekilSet.forEach {
        println(it) // alt alta 40 10 20 30
    }

    // MAP (Dictionary)
    println("---Map---")
    // anahtar değer eşleşmesi var (key-value)

    val yemekDizisi = arrayListOf("elma", "armut", "karpuz")
    val kaloriDizisi = arrayListOf(100,150,200)

    //Not String format
    println("${yemekDizisi[0]}'nin kalorisi ${kaloriDizisi[0]}") //elma'nin kalorisi 100

    val yemekKaloriMapi = hashMapOf<String, Int>() // key-value string-ınteger
    yemekKaloriMapi.put("Elma", 100)
    yemekKaloriMapi.put("Armut", 150)
    yemekKaloriMapi.put("Karpuz", 200)

    println(yemekKaloriMapi["Elma"]) // 100
    println(yemekKaloriMapi.get("Armut")) // 150
    println(yemekKaloriMapi.get("Yeşil Elma")) // null döner

    yemekKaloriMapi.put("Elma", 300) // aynı key ile yeni value eklersek
    println(yemekKaloriMapi.get("Elma")) // yeni değeri döner : 300

    // remove ile çıkartma yapılabilir replace ile değiştirilebilir








}