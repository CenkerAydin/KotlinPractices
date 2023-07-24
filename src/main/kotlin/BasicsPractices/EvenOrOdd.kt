package BasicsPractices

fun main() {
    //Program Check Whether a number is even or odd
    print("Enter the number: ")
    val num= readLine()!!.toInt()
    if (num %2==0){
        print("$num is Even")
    }else{
        print("$num is Odd")
    }

}