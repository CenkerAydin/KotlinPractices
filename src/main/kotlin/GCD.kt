fun main() {
    //Find GCD of two numbers using while loop.
    print("Enter the num1: ")
    val num1= readln()!!.toInt()
    print("Enter the num2: ")
    val num2= readln()!!.toInt()

    var gcd=1
    var i=1
    while (i<=num1 && i<=num2){
        if(num1 %i==0 && num2 %i==0){
            gcd=i
        }
        ++i
    }
    println("GCD of $num1 and $num2 is $gcd")
}