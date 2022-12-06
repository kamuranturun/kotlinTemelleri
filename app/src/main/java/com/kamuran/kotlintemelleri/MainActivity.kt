package com.kamuran.kotlintemelleri

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
/*
fun main() {
    var meyveler=arrayListOf<String>()
    var istenen="armut"
    meyveler.add("elma")
    meyveler.add("armut")
    meyveler.add("portakal")

    for(index in 0..meyveler.size-1){
        println("${index} indeksindeki meyvenin ad:${meyveler[index]}")

   if(meyveler[index]==istenen){
       println(index)
   }
    }

    for(meyve in meyveler){
        println(meyve)
        if(meyve==istenen){
            println(meyveler.indexOf(istenen))
        }
          println(meyveler.indexOf(istenen))
    }

}


fun main() {
    //istediğimiz tip
  var dizi= arrayOf("eleman1","eleman 2")

  dizi[0]="değişen eleman 1"
    dizi.set(1,"1. indis yani 2. eleman 3  oldu")

  println(dizi[0])
  println(dizi[1])

  var sayidizisi= intArrayOf(1,2,3,4,5,6)
  println(sayidizisi[0])
  var karisikdizi= arrayOf("sayi1",2)
  println(karisikdizi[0])
}
***********************************************************

fun main() {
    //set bir kere alır
   var st=setOf<Int>(1,2,3,4,5,6,4,3,2)
   println(st.size)

   st.forEach{
       println(it)
       //tekrarlıları eklemez
   }
   var hasSt= HashSet<Int>()
   hasSt.add(1)
   hasSt.add(2)
   println(hasSt)
   hasSt.forEach{
       println(it)
   }
}

*******************************************************************************************

fun main() {
 //map sözlük dictionary dir...
    //anahtar kelime değer mevzusu

    var meyveler= arrayOf("elma","armut")
    var kaloriler=arrayOf(100,120)

    println("${meyveler[0]}=${kaloriler[0]}")

    var hMap= hashMapOf<String,Int>()
    //string keydir Int valuedir
    hMap.put("elma",100)
    //put değiştirir yoksa oluşturur
    hMap.put("armut",120)
    println(hMap["elma"])
    //elmanın kalorisini verdi

    hMap["elma"]=200
    println(hMap["elma"])

    hMap["elma"]=300
    println(hMap["elma"])
    //başka bir yöntem
    var hMap2= hashMapOf<String,Int>("elma" to 100,"armut" to 120)
    hMap2.forEach{
        println(it)
        println("${it.key}:${it.value}")
    }
   var filtrelihash= hMap2.filter{
        it.value<110
       //valuesi 110 dan küçükleri yazar
    }
   filtrelihash.forEach{
       println("${it.key}:${it.value}")
   }

}
********************************************************************************************
fun main() {
    //not ortalaması hesapla
    var notlar =arrayListOf<ArrayList<Float>>()
    var ortalamalar= arrayListOf<Float>()
    var durumlar=arrayListOf<String>()

    notlar.add(arrayListOf(50f,40f,40f))
    notlar.add(arrayListOf(10f,10f,20f))

    for(i in 0..notlar.size-1){
        var ortalama=notlar[i].reduce{
            baslangicdegeri,gecerlideger->
            baslangicdegeri+gecerlideger
        }/notlar[i].size
       // println(ortalama)
        ortalamalar.add(ortalama)
    }
    durumlar=ortalamalar.map{
        if(it<50){
            "kaldı"
        }else{
            "gecti"
        }
    }as ArrayList<String>
    ortalamalar.forEach{
        println(it)
    }
    durumlar.forEach{
        println(it)
    }

}

---------------------------------------------------------------------------------------------------------------
fun main() {
 //oop kotlin
    //gercek hayata uyumlu
    //kod güvenliği var
    //modulerdir parca parca
    //ekip calısmasına uygundur
    //esnek ve genişletilebilir
    //tekrar kullanılabilir

}

>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
fun main() {
 //oop
    // yönetim ve bakımı kolay
    //türetim ve kalıtım yapılır
    //erişim belirleme ve kısıtlama yapılır
    //class ve struct kullanlılır
    //arayüzler ve interfaceler kullanılır kod şablonu

}

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
Classlar....
fun main(){
    //sınıflardan nesne ürettik
var sandalye1= Sandalye()
val sandalye2= Sandalye()
}
class Sandalye{
    //özellik
    //işlevler
    //standartlar

}

*****************************************************************************************
//özellik property ekleme
fun main() {
   // println("Hello, world!")
    var sandalye1= Sandalye()
    sandalye1.bacakSayisi=4
    sandalye1.model="Model1"
    println(sandalye1.bacakSayisi)
    println(sandalye1.model)
    val sandalye2= Sandalye()
    sandalye2.bacakSayisi=6
    sandalye2.model= "Model2"
    println(sandalye2.model)
}

class Sandalye{

    //property özellik yada field dir
    //bellekte alan kaplar
    var bacakSayisi:Int=0
     var model= ""

}


**************************************************************************************************
fun main() {
    //kapsulleme erişim kısıtlama

    var sandalye1= Sandalye()
    var sandalye2= Sandalye()
  sandalye1.bacakYuksekligi=30
    println(sandalye1.bacakYuksekligi)
    //aşağıda set açtığımız için
    //burdaki değişiklik olmadı
    //seti kapatırsak olur
}

class Sandalye{
    var bacakSayisi:Int=0
    var model=""

    var bacakYuksekligi:Int=0
    get
    set
  //bacakYuksekligi=alue
  //recursive call sonsuz döngü

}
----------------------------------------------------------------
fun main() {

    var k= Kare()
   // k.kenar=-1f    println(k.kenar)
   k.kenar=110f
    println(k.kenar)



 k.cevre=39
    println(k.cevre)//burada
    //hata verecek çünkü aşağıda
    //private ile kısıtladık
    //doşarıdan deger ataması yapamayız


}

class Kare{
    var kenar:Float=0.0f
    //get setle kontrol yapıyoruz
    get(){return field//field kenarın değeridir
    }
    set(yeniKenar){
        if(yeniKenar>0){field=yeniKenar}
        else{field=0f
        }
    }
    var cevre:Float=0.0f
    get(){return kenar*4
    }
    //private set dışarıdan erişimi engeller
    private set
}

****************************************---------------


package com.kamuran.kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
//fonksiyon yazma
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

   Yaz()
        var k= Kare()
        k.kenar=10f
      k.Bilgileriyaz()

    }


    fun Yaz(){
       // println("fonksiyon cağrıldı")
    }
}

class Kare{

    var kenar:Float= 0.0f

    get(){
        return field
    }
    set(yenikenar){
        if (yenikenar>0){
            field=yenikenar
        }
        else{
            field=0f
        }
    }

    fun Bilgileriyaz(){
        println("kenar uzunluğu :${kenar}")
    }
}

************************************************************************



package com.kamuran.kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
//fonksiyon parametreleri
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        f1("deger1 kamuran")
        f2("değer2   ",45)


    }
fun f1(p1:String){
    println(p1)
}

    fun f2(p1:String,p2:Int){
        println(p1+p2.toString())

    }
}

-----------------------------------------------------------------------

package com.kamuran.kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
//geriye deger döndürme
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var gelenDeger= degerGetir()
        println(gelenDeger)

        var toplam= Topla(12,34)
        println(toplam)


    }




    fun degerGetir():String{
       return "getirilen deger string"
   }

    fun Topla(sayi1:Int,sayi2:Int):Int{
        return sayi1+sayi2
    }
}

%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
package com.kamuran.kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
//deger döndürme
//kotlin birden cok değeri döndürmeye izin vermez ancak pair yapısı ile bunu yapabiliriz
//pair birden fazla değer tutar
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //var sonuc = karsilastir(223,35)
        //println(sonuc)

        var s1= 91
        var s2= 88
        var snc= karsilastir(s1,12)
       // println(snc.first)

        //println(snc.second)

        println("küçük sayi ${snc.first}, büyük sayi ${snc.second}")


       /*
        var cokludeger= cokluDeger()
        println(cokludeger.first)//birinci deger
        println(cokludeger.second)//ikinci deger
        println(cokludeger)//ikiside
        */

    }


    fun cokluDeger():Pair<String,Int>{
       return Pair("str",1)
    }

    fun karsilastir(sayi1:Int,sayi2:Int):Pair<Int,Int>{
        if(sayi1<sayi2){
            return Pair(sayi1,sayi2)
        }
  else{
            return Pair(sayi2,sayi1)
        }
    }

}
***************************************************************
package com.kamuran.kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
//listedeki en düşük ve en düşük puanı hesaplama
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val liste= intArrayOf(3,44,2,4,56,356,662,323)
        var sonuc= PuanHesapla(liste)
        println("en dusuk puan  ${sonuc.first}")
        println("en yuksek  puan  ${sonuc.second}")
    }

    fun PuanHesapla(puanlar:IntArray):Pair<Int,Int>{

        var dusuk= puanlar[0]
        var yuksek= puanlar[0]

        for(puan in puanlar){

            if(puan<dusuk){
                dusuk=puan
            }else if (puan>yuksek){
                yuksek=puan
            }
        }



        return Pair(dusuk,yuksek)

    }
}
------------------------------------------------------
package com.kamuran.kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
//constructor= bir nesnenin belleğe çıkması için çağrılması gereken bir fonksiyondur
//doğrudan cağrılmaz
//iki çeşit var primary ve secondary

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //primary
        //var t= Test()
       var t=Test("ali",10)
        //println(t.yas)
       // println(t.isim)

        //secondary
        var t2=Test2("",2)
        var t3= Test2(21,"ata")
        var t4= Test2(40 )
        println(t3.adres)
        println(t3.yas)
        println(t4.yas)
    }
}

class Test(val isim :String, var yas:Int){
    /*var isim:String
    var yas:Int*/

    init {
        //özel fonk parametre almaz ve ismi değişmes
        //Test classının içindeki cunstructor çalıştıktan hemesn sonra
        //çalışır
       // println(isim)
    }
}

class Test2
{
    var isim:String
    var yas:Int
    var adres:String

    constructor(yas:Int, adres:String =""){
        this.isim="kamuran"
        this.yas= yas
        this.adres=adres
    }

    constructor(isim:String,yas:Int){
        this.isim=isim
        this.yas= yas
        adres=""
    }
}
class Test3(var isim:String,var yas:Int,var adres:String)
//primary ve secondary beraber kullanalım
{
  /*
    var isim:String
    var yas:Int
    var adres:String
   */

    constructor(yas:Int, adres:String =""):this("",yas,adres){
        /*
        this.isim="kamuran"
        this.yas= yas
        this.adres=adres
         */
    }

    constructor(isim:String,yas:Int):this(isim,yas,""){
        this.isim=isim
        this.yas= yas
        adres=""
    }
}
++++++++++++++++++++++++++++++++++++++++++++++++++++++++
package com.kamuran.kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

//personel listesi oluşturup ekrana yazalım
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var personellistesi= arrayListOf<Personel>()
        var personel = Personel("ali","","kaya","545645",2412312)
        personellistesi.add(personel)


        personel= Personel("ahmet","murat","turan","3234234",43534)
        personellistesi.add(personel)

        for(p in personellistesi){
            p.BilgileriYazdir()
        }
    }

}

class Personel
{
    var Ad:String
    var IkinciAd:String?
    var Soyad:String
    var KimlikNo:String
    var SicilNo:Int

    constructor(ad:String, ikinciAd:String, soyad:String,kimlikNo:String, sicilNo:Int)
    {
        this.Ad= ad
        IkinciAd=ikinciAd
        this.Soyad= soyad
        KimlikNo= kimlikNo
        SicilNo= sicilNo
    }

    fun BilgileriYazdir(){
        println("Ad:${Ad}")

        if (IkinciAd !=null){

            println("ikinciAd:${IkinciAd}")
        }

        println("soyad ${Soyad}\n kiimlikNo ${KimlikNo}\n sicilNo ${SicilNo}")
    }

}
!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!



package com.kamuran.kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
//Companion Object-Static
//Sınıf üzerinden fonksiyon ve field'lara erişim işlemleri anlatılıyor.

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //var h= Hesapla()


        Hesapla.Karekok()
Hesapla2.d=90
Hesapla2.Karekok()

    }

}

class Hesapla{


    companion object{
        var d:Int=10
            fun Karekok(){
                println("hesapla karekok")
            }
    }
}

object Hesapla2{
    var d:Int=10
    fun Karekok(){
        println("hesapla karekok2")
        println(d)
    }
}

>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
package com.kamuran.kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
//Enumeration
//Enum yapısının kullanımı ve kullanım alanları anlatılıyor.
//sabit değer ve bellekte az yer kaplar
//enumlar yoğun olarak hata kodlarının yonetiminde kullanılır

//enumlar aynı zamanda birer classtır ve class özelliklerini barındırır
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var g= Gun.cars


        if( g== Gun.cars)
        {
            println(g)
        }

        var hata= HataKodları.SitemHatasi
        hata.MesajGoster()
    }

}

enum class Gun{
    //her karakter 2 byte
    Pazartesi,sali,cars,pers,cuma,ct, pazar
}


enum class HataKodları(val kod:Int,val Mesaj:String){
    SitemHatasi(1,"Bilinmeyen hata"),
    InterNetHatasi(2,"Baglantinizi kontrol ediniz");


    fun MesajGoster(){
        println(Mesaj)
    }
}
>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<
package com.kamuran.kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
//Kalıtım yapısı ve kullanımı anlatılıyor.
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var dikdortgen= Dikdortgen()
        dikdortgen.cevre=100f

        var kare= Kare()
        kare.alan=123f



    }


}

class Kare:Sekil(){
    var kenar:Float?=null

}

class Dikdortgen:Sekil(){
    var uzunkenar:Float?=null
    var kısakenar:Float?=null

}

open class Sekil{
    var cevre:Float?=null
    var alan:Float?=null
}
---------------------------------------------------
package com.kamuran.kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
//Kalıtım alınan sınıf ile kalıtım alan sınıfın contructor ilişkileri ve birlikte kullanımları anlatılıyor.
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var dikdortgen= Dikdortgen(10f,23f,"sarı")
       println(dikdortgen.cevre)

       // dikdortgen.cevre=100f


        var kare=Kare(24f,"mavi")
       // kare.alan=123f
println(kare.alan)


    }
}

class Kare(kenar:Float,renk:String) :Sekil("kare",renk)
 {
    //var kenar:Float?=null

    init {
        cevre= kenar*4
        alan=kenar*kenar
    }
}

class Dikdortgen:Sekil{
    var kisakenar:Float?
    var uzunkeanr:Float

    constructor(k:Float, u:Float,renk:String):super("dikdortgen",renk){

        kisakenar=k
        uzunkeanr=u

        cevre=(kisakenar!! +uzunkeanr)*2
        alan=(kisakenar!! *uzunkeanr)
    }
}

open class Sekil(isim:String,renk:String)
{
    var cevre:Float?=null
    var alan:Float?=null
}
----------------------------------------------------------
package com.kamuran.kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

//Kalıtım alınan sınıf ile kalıtım alan sınıfın contructor ilişkileri anlatılıyor.
//çalışanların biliglerinin tutulup modellenmesi
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}


open class Calisan
{
    var SicilNo:Int
    var Ad:String
    var Soyad:String

    constructor(sicilno:Int,ad:String,soyad:String)
    {
        SicilNo=sicilno
        Ad=ad
        Soyad=soyad
    }
}

class Yazilimci(sicilno:Int,ad:String,soyad:String):Calisan(sicilno,ad,soyad)
{
    var ProjeAdi:String?=null

}

class TemizlikGorevlisi(sicilno:Int,ad:String,soyad:String):Calisan(sicilno,ad,soyad)
{

    var GorevAlani:String?=null

}



open class Yonetici(sicilno:Int,ad:String,soyad:String):Calisan(sicilno,ad,soyad)
{
var EkipListesi= arrayListOf<Calisan>()
}

class MudurYardimicisi(sicilno:Int,ad:String,soyad:String,departman:String):Yonetici(sicilno,ad,soyad)
{
    var sorumlulukalani:String

    init {
        sorumlulukalani=departman
    }
}

class Mudur(sicilno:Int,ad:String,soyad:String,mudurluk:String):Yonetici(sicilno,ad,soyad)
{
    var Mudurluk:String

    init {
        Mudurluk=mudurluk
    }
}
-----------------------------------------------------------
package com.kamuran.gelecegiyazanlar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.telephony.TelephonyCallback.BarringInfoListener

//override bir nevi geçersiz kılma demek yani eski fonksiyonları gecersiz kılabiliriz
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var kare= Kare()
        kare.BilgileriGoster()

        var dikdortgen= Dikdortgen()
        dikdortgen.BilgileriGoster()


    //dikdortgen.BilgileriGosterDik( )
    }
}

class Kare:Sekil(){

}

class Dikdortgen:Sekil(){

    override fun BilgileriGoster(){
        println("bu bir dikdortkendir")
    }
}
open class Sekil
{

    open fun BilgileriGoster(){
        println("bu bir sekildir")
    }

}

/////////////////////////////////////////////////////////////
package com.kamuran.gelecegiyazanlar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.telephony.TelephonyCallback.BarringInfoListener

//Abstract-Interface Kullanımı
//Kalıtım alınmasını istemediğimiz soyut sınıfların ve standartların belirlendiği arayüzlerin kullanımı anlatılıyor.
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       // var s = Sekil()
    }
}

//abstract , sınıflardan nesne üretmemizi engeller
/*
abstract class Sekil
{

}
 */

//interfaceler sınıflara standartlar belirlememizi sağlar
interface Kalem
{
    var murekkepRengi:String?
    fun Yaz(){
println("kalem")
    }
}

interface ElFeneri
{
    var pilSayisi:Int?

    fun Ac()


    fun Kapat()

}

 class IsikliKalem:ElFeneri,Kalem{
     override var murekkepRengi: String?
         get() = TODO("Not yet implemented")
         set(value) {}
     override var pilSayisi: Int?
         get() = TODO("Not yet implemented")
         set(value) {}

     override fun Ac() {
         TODO("Not yet implemented")
     }

     override fun Kapat() {
         TODO("Not yet implemented")
     }


 }
////////////////////////////////////////////////////////////////////////
package com.kamuran.gelecegiyazanlar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.telephony.TelephonyCallback.BarringInfoListener

//Interface Lab
//Arayüzlerin kullanıldığı örnek uygulama geliştirilmesi anlatılıyor.
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
}

interface CalisanStandart{
    var sicilNo:Int
    var Ad:String
    var Soyad:String

    fun IzinKullan()
}

interface YoneticiStandart:CalisanStandart
{
fun KontrolEt()

}

class Calisan:CalisanStandart
{
    override var sicilNo: Int=0

    override var Ad: String
        get() = TODO("Not yet implemented")
        set(value) {}
    override var Soyad: String
        get() = TODO("Not yet implemented")
        set(value) {}

    override fun IzinKullan() {
        TODO("Not yet implemented")
    }

}

class Mudur:YoneticiStandart {
    override var sicilNo: Int
        get() = TODO("Not yet implemented")
        set(value) {}
    override var Ad: String
        get() = TODO("Not yet implemented")
        set(value) {}
    override var Soyad: String
        get() = TODO("Not yet implemented")
        set(value) {}

    override fun IzinKullan() {
        TODO("Not yet implemented")
    }

    override fun KontrolEt() {
        TODO("Not yet implemented")
    }
}
/////////////////////////////////////////////////////
package com.kamuran.gelecegiyazanlar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.telephony.TelephonyCallback.BarringInfoListener
//Sınıflara extension yaparak genişletme yapılması anlatılıyor.
//sınıfları genişletmek için extension fonksiyonlar tanımlarız
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


       var c=C()

        c.f1()
        c.f2()
        //önce nesne içindeki fonksiyonu calıştırır
        //diğeri gecesiz kalır ama bulamazsa dışardakini çalıştırır

        var str="metin"
       var eklenen= str.Ekle("  yeni")
        println(eklenen)
    }
}


class C{
    fun f2(){
        println("class f2")
    }

}
fun C.f1()
{
    println("extensions f1")
}

fun C.f2(){
    println("extension f2")
}

fun String.Ekle(deger:String):String{
    return this+deger
}
///////////////////////////////////////////////////////
package com.kamuran.gelecegiyazanlar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.telephony.TelephonyCallback.BarringInfoListener
//Erişim belirleyiciler ile yapıların erişimlerinin kontrol altına alınması anlatılıyor.
//public her yerden erişilir varsayılandır
//import edilen tüm projelerden türetilir
//sınıf fonk ve değişkenlerden elde edilir override edilir

//internal ,sadece tanımlandığı modülden erişilir
//erişildiği yerden türetilip override edilir


//protected, sınıflarda kullanılamaz sınıf elemanlarında kullanılabilir
//tanımlandığı sınıf içinden kullanılır dışından kullanılmaz
//türetilen sınıftan kullanılır kalıtım yolu ile
//aynı sınıfın farklı dosyalardaki extensionlarına erişemez


//private , en kısıtlısıdır
//sınıf elemanlarında kullanılır field ve metotlarda
//aynı dosya extensionlara ulaşamaz

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    var c= C()

    }
}

public class C
{
    public var a=""
    internal var b= ""
    protected var c=""
    private var d=""
}

fun C.fe(){
    a= ""
    b=""

}
//////////////////////////////////////////////
package com.kamuran.gelecegiyazanlar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.telephony.TelephonyCallback.BarringInfoListener
import java.io.IOException

//Eğitimin bu bölümünde ileri seviye kotlin işlemleri anlatılıyor.
//Try Catch
//Try-catch yapısı kullanılarak hata yönetimlerinin yapılması anlatılıyor.
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var str= "5a"
        var i:Int


        //try içine hata ihitmali olan kodlar yazılır
        try {
           i =str.toInt()
        }catch (e:IOException){
            println(e.message)
            i=-3
            //catch sayısı arttırılabilir
        }catch (e:NumberFormatException){
            //number fe hatası
            println("Yanlış format")
            i=-1
        }catch (e:Exception){//exception en genel hatadır

            //catch try içinde herhangi bir hata olduğunda devreye girer
            println(e.message)
            i=-2
        }

        //hata alsakda almasak da finally i kullanırız
        finally {
            //herdurumda calısır
            println("finally")
        }
        println(i)

    }
}

///////////////////////////////*************************
package com.kamuran.gelecegiyazanlar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.telephony.TelephonyCallback.BarringInfoListener
import java.io.IOException
//Throw ile kontrollü hata fırlatma işlemleri anlatılıyor.
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var str= "5a"

        var i:Int

        try {
            i=str.toInt()
            Kontrol()
        }catch (e:NumberFormatException){
            println("yanliş format")
        i=-1
        }catch (e:Exception){
            println(e.message)
            i=-2
        }
        finally {
            println("finally")
        }

        i= try {
            str.toInt()
        }catch (e:Exception){
            -55
        }

        println(i)


    }

    fun Kontrol(){
        throw Exception("hata oluştu")
    }


}
*************************************************
package com.kamuran.gelecegiyazanlar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.telephony.TelephonyCallback.BarringInfoListener
import java.io.IOException

//Try-catch yapısının kullanıldığı örnek uygulama yapılıyor

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var k=Kisi("ali","Can")

        try {
            k.YasEkle(123)

        }catch (e:Exception){
            println(e.message)
        }

    }

}

class Kisi
{
    var Ad:String
    var Soyad:String
     var Yas:Int?=null
    get
    private set  //dısarıdan erisime kapalı

    constructor(ad:String,soyad:String)
    {

        Ad=ad
        Soyad=soyad
    }
    fun YasEkle(yas:Int){
        if(yas>=0 && yas<=120)
        {
            Yas=yas
        }
        else{
            throw Exception("yas 0 120 aralığında olmalı")
        }
    }
}
******************************************************
package com.kamuran.gelecegiyazanlar

import android.os.AsyncTask
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.telephony.TelephonyCallback.BarringInfoListener
import java.io.IOException

//Async Task ile işlemlerin arkaplanda nasıl yapılacağı anlatılıyor.
//asenkron işlemler birbirini beklemeden calısan işlemler demek
//web servis çağrımları

//asenkron tasklar android kütüphanesinde bulunan bir yapıdır
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        println("asenkron task cağırım öncesi")
        AsyncSinif{Sonuc()}.execute()
        println("asenkron task cağırım sonrası")
    }
    fun Sonuc(){
        println("sonuc fonksiyonu")
    }
}

class AsyncSinif(val sonucfonk:()->Unit):AsyncTask<Void,Void,Void>()
{
    override fun onPreExecute() {
        super.onPreExecute()
    }
    override fun doInBackground(vararg params: Void?): Void? {
        Thread.sleep(3000)

        return null
    }

    override fun onPostExecute(result: Void?) {
        super.onPostExecute(result)

        sonucfonk()
    }
}
--------------------------------------------------------
package com.kamuran.gelecegiyazanlar

import android.os.AsyncTask
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.telephony.TelephonyCallback.BarringInfoListener
import java.io.IOException
//AsyncTask ile işlemlerin arka planda nasıl yapılacağı anlatılıyor.

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       // var toplam:Long = 0

        println("işlem oncesi")

        /*
        for(i in 1..100000000){
            toplam +=i
        }
        println("toplam: ${toplam}")

         */
        Hesapla{sonuc(it)}.execute()
        println("işlem sonrası")
    }
    fun sonuc(toplam:Long){
        println("toplam: ${toplam}")
    }
}

class Hesapla(val sonucFonk:(Long)->Unit):AsyncTask<Void,Void,Long>()
{
    override fun doInBackground(vararg params: Void?): Long {
        var toplam:Long=0
        for (i in 1..1000000000)
        {
            toplam+=i
        }
        return toplam
    }

    override fun onPostExecute(result: Long) {
        super.onPostExecute(result)

        sonucFonk(result)
    }

}
----------------------------------------------------
package com.kamuran.gelecegiyazanlar

import android.os.AsyncTask
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.telephony.TelephonyCallback.BarringInfoListener
import java.io.IOException
//Generic mimari ile esnek kod yazılması anlatılıyor.
//generic değişken tipleri için kullanılan kavaramın ismidir
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var strListe= arrayListOf<String>()
        strListe.add("eleman1")
        strListe.add("eleman2")
        strListe.add("eleman3")

        var kopyastr= kopyala(strListe)
        //println(kopyastr.get(0))
        println(kopyastr)

        var intListe= arrayListOf<Int>()
        intListe.add(0)
        intListe.add(1)
        intListe.add(2)

        var kopyaInt= kopyala(intListe)
      println(kopyaInt)
    }

    fun <T>kopyala(liste:ArrayList<T>):ArrayList<T>
    {
        var kopyaliste= arrayListOf<T>()

        for(item in liste){
            kopyaliste.add(item)
        }
        return kopyaliste
    }
}
********************************************************4545


 */