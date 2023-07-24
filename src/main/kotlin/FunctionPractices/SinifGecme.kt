package FunctionPractices

fun main() {
    var total=0
    print("Kaç ders girmek istiyorsunuz? ")
    val lessonCount= readLine()?.toInt()

    if (lessonCount !=null && lessonCount > 0){
        var dersNumber=1
        while (dersNumber<=lessonCount){
            print("Ders $dersNumber için not girin (0-100 arası): ")
            val not= readLine()?.toInt()

            if (not !=null && not in 0..100){
                println("Girilen not: $not")
                total +=not
                dersNumber++
            }else{
                println("Geçersiz not girişi! Lütfen 0-100 arasında giriniz.")
            }
        }
    }else{
        println("Geçersiz ders sayısı girişi!Lütfen pozitif ders sayısı giriniz.")
    }
    println()
    if (lessonCount != null) {
        isSuccess(total, lessonCount)
    }
}
fun isSuccess(total:Int,dersNumber:Int){
    val average=total/dersNumber
    if (average>=60){
        println("Tebrikler.Bu dönemi başarıyla tamamladınız.")
        println("Ortalamanız: $average")
    }else{
        println("Maalesef.Sınıfta kaldınız.")
        println("Ortalamanız: $average")
    }
}