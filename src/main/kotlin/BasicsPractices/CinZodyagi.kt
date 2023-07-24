package BasicsPractices

fun main() {
    print("Enter the year: ")
    var year= readLine()!!.toInt()

    while (year <0){
        print("Enter the positive number: ")
        year= readLine()!!.toInt()
    }
    val zodiac=year%12
    when(zodiac){
        0 -> println("Maymun")
        1 -> println("Horoz")
        2 -> println("Köpek")
        3 -> println("Domuz")
        4 -> println("Fare")
        5 -> println("Öküz")
        6 -> println("Kaplan")
        7 -> println("Tavşan")
        8 -> println("Ejderha")
        9 -> println("Yılan")
        10 -> println("At")
        11 -> println("Koyun")
        else -> println("Geçersiz sayı girdiniz.")
    }
}