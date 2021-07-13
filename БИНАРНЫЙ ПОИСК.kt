fun main(args:Array<String>){
    //алгоритм с применением бинарного поиска
    println("введите количество чисел")
    val mutlist = mutableListOf<Int>() //объявление динамического списка
    val n = readLine() //ввод количества чисел

    val random_1 = (0..(n!!.toInt()-1)).random()// выбор случайного числа (из всех возможных индексов)
    for (i in 0..((n!!.toInt()) - 1)) {
        val d = readLine()
        mutlist.add(d!!.toInt()) //добавление введенных чисел в список
    }
    println("теперь программа загадет одно из этих чисел и сама же его потом найдет")

    val random_2 = mutlist[random_1] //создание случайного числа из списка
    mutlist.sort() //сортировка списка по возрастанию
    //программа выбирает любое число в списке и сама же его потом находит по алгоритму двоичного поиска
    var nachalo = 0  //индекс начала диапозона
    var seredina = (n!!.toInt()-1)/2  //индекс середины диапозона
    var konec = n!!.toInt()-1  //индекс конца диапозона
    var popitka = 0 //счетчик попыток

    if (mutlist[seredina]!=random_2){
        while (mutlist[seredina]!=random_2){
            if (mutlist[seredina]>random_2){
                konec = (n!!.toInt()-1)/2
                seredina = (konec+nachalo)/2
            }else{
                nachalo = (n!!.toInt()-1)/2
                seredina = (konec+nachalo)/2
            }
            popitka+=1
        }
    }
    println("загаданное число - ${mutlist[seredina]}")
    println("количество попыток-${popitka+1}")
}