fun main() {
    print("Enter the midTerm exam Note(0-100): ")
    val midterm= readLine()!!.toInt()
    print("Enter the final exam Note(0-100): ")
    val final= readLine()!!.toInt()
    val finalNote=(midterm*0.4).toInt()+(final *0.6).toInt()

    if (finalNote in 88..100){
        print("Your final grade is $finalNote and your letter grade is AA")
    }else if (finalNote in 80 until 88){
        print("Your final grade is $finalNote and your letter grade is BA")
    }else if (finalNote in 73 until 80){
        print("Your final grade is $finalNote and your letter grade is BB")
    }else if (finalNote in 65 until 73){
        print("Your final grade is $finalNote and your letter grade is CB")
    }else if (finalNote in 60 until 65){
        print("Your final grade is  $finalNote and your letter grade is CC")
    }else{
        print("Your final grade is $finalNote and your letter grade is FF")
    }
}