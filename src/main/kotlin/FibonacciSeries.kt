fun main() {
    //Fibonacci series using for loop
    val n=15
    var i1=0
    var i2=1
    print("First $n terms")
    for (i in 1..n){
        print(" $i1 ,")
        val sum=i1+i2
        i1=i2
        i2=sum
    }
}