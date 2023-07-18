fun main() {

    val pi=3.14


    print("Dairenin yarıçapını giriniz: ")
    val r= readLine()!!.toDouble()

    val area=pi*r*r
    val perimeter=2*pi*r

    println("Daire Alanı: $area")
    println("Daire Çevresi: $perimeter")
    println()
    print("Dilimin açısını giriniz: ")
    val angle= readLine()!!.toDouble()
    val pieceArea=(area*angle)/360

    println("Dilim Alanı: $pieceArea")
}