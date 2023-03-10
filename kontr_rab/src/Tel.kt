import java.util.*

abstract class Tel(var number:String,var date:String,var long:Int,var kod:Int) :Interface{
    override fun input()
    {
        println("Номер  - $number")
        println("Дата- $date")
        println("Продолжительность - $long")
        println("Код города- $kod")







    }


}