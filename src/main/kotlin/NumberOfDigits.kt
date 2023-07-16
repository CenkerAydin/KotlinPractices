fun main() {
    var count = 0
    println("Enter the number: ")
    var number = readLine()!!.toInt()
    while (number != 0) {
        number /= 10
        ++count
    }
    println("Number of digits: $count")
}

