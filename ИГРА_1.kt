fun main(args:Array<String>) {
    // игра на применение алгоритма бинарного поиска
    //суть игры:из списка чисел нужно отгадать загаданное число самым быстрым способом
    println("введите количество чисел")
    val mutlist = mutableListOf<Int>() //объявление динамического списка
    val n = readLine() //ввод количества чисел

    val random_1 = (0..(n!!.toInt()-1)).random()// выбор случайного числа (из всех возможных индексов)
    for (i in 0..((n!!.toInt()) - 1)) {
        val d = readLine()
        mutlist.add(d!!.toInt()) //добавление введенных чисел в список
    }

    val random_2 = mutlist[random_1] //создание случайного числа из списка
    mutlist.sort() //сортировка списка по возрастанию
    println(mutlist)
    println("""было загадано одно из этих чисел
        вам предстоит угадать это число за наименьшее количество попыток""")

    var count = readLine()!!.toInt()
    var popitka = 0
    if (count != random_2) {
        while (count != random_2) {
            if (count < random_2) println("ваше число меньше")
            if (count > random_2) println("ваше число больше")
            popitka+=1
            count = readLine()!!.toInt()
        }
        println("поздравляем,ты угадал число")
        println("количество попыток: ${popitka+1}")
    }
}

