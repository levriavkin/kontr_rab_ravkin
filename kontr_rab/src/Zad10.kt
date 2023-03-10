import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import javax.xml.bind.JAXBElement

fun main()
{
var num = Tel_2("9889468796","123",2,16123)
num.input()
    println("Сколько раз хотите вывести функцию?")
    var count = readLine()!!.toInt()
    count = count -1

        GlobalScope.launch {
            for (i in 0..count)
            {

            println(num.ohv())
            delay(5000)
            }
        }

    println(num.price())

    runBlocking { delay(10000) }
num.otz()


}