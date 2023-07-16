fun main() {
var select:Int
    val menu = """
        1- Toplama İşlemi
        2- Çıkarma İşlemi
        3- Çarpma İşlemi
        4- Bölme işlemi
        5- Üslü Sayı Hesaplama
        6- Mod Alma
        0- Çıkış Yap
        """.trimIndent()

    do {
        println(menu)
        println()
        print("Bir işlem seçiniz: ")
        select= readLine()!!.toInt()
        when (select){
            1 ->plus()
            2 ->minus()
            3->times()
            4->divided()
            5->power()
            6 ->mod()
            else -> println("yanlış değer girdiniz tekrar deneyin.")
        }

    }while (select !=0)
}
fun plus(){
    var number:Int
    var result=0
    var i=1;

    while (true){
        print("${i++}. sayı: ")
        number= readLine()!!.toInt()
        if (number==0){
            break
        }
        result +=number
    }
    println("Sonuç: "+result)
    println()
}

fun minus(){
    print("Kaç adet sayı gireceksiniz: ")
    var counter= readLine()!!.toInt()
    var number:Int
    var result=0

    for (i in 1..counter){
        print("$i + .sayı: ")
        number= readLine()!!.toInt()
        if (i==1){
            result +=number
            continue
        }
        result -=number
    }
    println("Sonuç: $result")
    println()
}

fun times(){
    print("Kaç Adet sayı gireceksiniz: ")
    var counter= readLine()!!.toInt()
    var number:Int
    var result=1
    var i=1

    while (counter !=0){
        print("${i++}.sayı: ")

        number = readLine()!!.toInt()
        if (number==1){
            break
        }
        if (number==0){
            result=0
            break
        }
        result *=number
        counter--
    }
    println("Sonuç: $result")
    println()
}

fun divided(){
    print("Enter the first number: ")
    var num1= readLine()!!.toDouble()
    print("Enter the second number")
    var num2= readLine()!!.toDouble()
    if (num2 !=0.0){
        val result=num1 / num2
        println("Sonuç $result")
    }else{
        println("Bir sayıyı 0'a bölemezsiniz.")
    }

    }

fun power(){
    print("Taban değerini giriniz: ")
    val base= readLine()!!.toInt()
    print("Üs değerini giriniz: ")
    var exponent= readLine()!!.toInt()
    var result=1
    for (i in 1..exponent){
        result *=base
    }
    println("Sonuç: $result")
    println()
}

fun mod(){
    var number1:Int
    var number2:Int
    var result:Int
    var counter=1
    while (counter !=0){
        result=0
        print("Enter the first number: ")
        number1= readLine()!!.toInt()
        counter--
        if (number1==0){
            break
        }
        print("Enter the second number: ")
        number2= readLine()!!.toInt()
        result=number1%number2
        print("Sonuç $result")
        println()

    }
}
