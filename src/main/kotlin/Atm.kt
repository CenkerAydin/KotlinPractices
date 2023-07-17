import java.util.*

fun main() {
    var userName:String
    var password:String
    var hak=3
    var choose:Int
    var money =3000

    while (hak>0){
        println("Kullanıcı Adınız(Küçük Harfle): ")
        userName= readLine().toString().lowercase()
        println("Şifreniz(Küçük Harfle): ")
        password= readLine().toString().lowercase()
            if (userName.equals("cenker aydın") && password.equals("ca1903")){
                println("Banka hesabına başarıyla giriş yapıldı. ")
                println("Toplam Bakiyeniz: $money")
                do {
                    print("Hangi işlemi yapmak istiyorsunuz?\n 1-Para Yatırma \n 2-Para Çekme \n 3-Kalan Bakiye \n 4-Çıkış Yap\n")
                    choose= readLine()!!.toInt()
                    when(choose){
                        1 -> {
                            println("Yatırmak istediğiniz miktarı giriniz: ")
                            val amount = readLine()!!.toInt()
                            if (amount < 0 ){
                                println("Lütfen pozitif miktar giriniz!")
                            }else{
                                money +=amount
                            }
                            println("İşlem Başarılı")
                            println("Toplam Bakiyeniz: $money")
                        }
                        2 ->{
                        println("Çekmek istediğiniz parayı giriniz: ")
                        val amount= readLine()!!.toInt()
                            if (amount> money){
                                println("Yetersiz bakiye")
                            }else{
                                println("Paranızı çektiniz")
                                money -=amount
                                println("Toplam Bakiyeniz: $money")
                            }
                    }
                        3 ->{
                            println("Kalan Bakiyeniz: $money")
                        }
                        4 ->{
                            break
                        }
                        else -> println("Hatalı bir giriş yaptınız!")
                    }
                }while (choose !=4)
                    println("Çıkış Yapıldı.Tekrar Görüşmek Üzere")
                        break
            }else{
                hak--
                println("Hatalı Giriş Denediniz.Tekrar Deneyiniz.")
                if (hak==0){
                    println("Hesabınız Bloke Oldu.Bankayla iletişime geçiniz.")
                }else{
                    println("Kalan Hakkınız: $hak")
                }
            }

    }
}

fun showChoose(){
    println("1-Para Yatırma")
    println("2-Para Çekme")
    println("3-Kalan Bakiye")
    println("4-Çıkış Yap")
}