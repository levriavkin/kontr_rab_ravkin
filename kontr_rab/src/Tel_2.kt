class Tel_2( empnumber:String,var empdate:String,var  emplong:Int,var empkod:Int):Tel(empnumber,empdate,emplong,empkod) {
    override fun input() {
        super.input()
    }
    fun price()
    {
        try {
            var a = emplong *5
            println("Стоимость звонка - $a")
        }catch (e:Exception)
        {
            println("Неверный ввод")
        }

    }
    fun ohv()
    {
        try {
            println("Введите радиус действия сети")
            var a = readLine()!!.toInt()
            var b = a*4
            println("Качество сети - "+b)


        }catch (e:Exception)
        {
            println("Неверный ввод")
        }

    }
    fun otz()
    {
        try {
            println("Оцените качество работы связи(от 1 до 5)")
            var a = readLine()!!.toInt()
            if(a>5||a<1)
            {
                println("Неверное значение")
            }
            else
            {

                println("Качество работы связи - "+a)
            }



        }catch (e:Exception)
        {
            println("Неверный ввод")
        }
    }


}