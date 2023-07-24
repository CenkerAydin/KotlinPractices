package BasicsPractices

import java.util.*


fun main() {
    print("Kaç elemanlı dizi oluşturmak istiyorsunuz: ")
    val length = readLine()?.toInt()
    val arrays = Array(length!!) { 0 }
    var index = 0
    var max = 0
    var min = 0
    for (i in 0 until length) {
        print("${index++}. elemanı giriniz:")
        val num = readLine()?.toInt()
        arrays[i] = num!!
    }

    Arrays.sort(arrays)

    println("Hedef sayı giriniz: ")
    val num1 = readLine()?.toInt()
    for (i in arrays) {
        if (i > num1!!) {
            max = i
            break
        }
    }

    val reverseArr = arrays.reversed()
    for (i in reverseArr) {
        if (i < num1!!) {
            min = i
            break
        }
    }
    println()
    println("Girilen Sayı: $num1")
    println("Girilen sayıdan büyük en yakın sayı: $max")
    println("Girilen sayıdan küçük en yakın sayı: $min")


}
