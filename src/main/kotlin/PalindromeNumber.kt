fun main() {
    //Check Whether a number is palindrome or Not
    var num= readln().toInt()
    val originalNum=num
    var reverseNum=0
    while (num !=0){
        var digit=num%10
        reverseNum =reverseNum*10 +digit
        num /=10
    }
    if (originalNum==reverseNum){
        println("$originalNum is a palindrome.")
    }else{
        println("$originalNum is not a palindrome.")
    }
}