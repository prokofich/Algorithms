fun main (args:Array<String>) {
    //ввод данных
    println("введите зашифрованный текст")
    var shifr = readLine()
    println("введите ключ")
    var key = readLine()

    //создам строку зашифрованного текста без пробелов
    var shifr2 = ""
    if (shifr != null) {
        for (i in shifr) {
            if (i != ' ') {
                shifr2 += i
            }
        }
    }
    var prow = shifr2.indexOfAny(charArrayOf('q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p', 'a', 's', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'z', 'x', 'c', 'v', 'b', 'n', 'm',
            '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '!', '@', '#', '$', '%', '^', '&', '*', '(', ')', '_', '+',
            '"', '№', ';', ':', '?', '-', '=', '>', '<', '/')) >= 0

    //узнаем длину шифра и ключа
    var sizeshifr2 = shifr2.length
    var sizekey = key?.length

    //дополним наш ключик
    var shet = 0
    if (sizekey != null && sizeshifr2 != null) {
        if (key != null) {
            for (i in 1..(sizeshifr2 - sizekey)) {
                key += key[(shet % sizekey)]
                shet += 1
            }
        }
    }
    var prow2 = key?.indexOfAny(charArrayOf('q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p', 'a', 's', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'z', 'x', 'c', 'v', 'b', 'n', 'm',
            '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '!', '@', '#', '$', '%', '^', '&', '*', '(', ')', '_', '+',
            '"', '№', ';', ':', '?', '-', '=', '>', '<', '/'))!! >= 0
    if (prow == false && prow2 == false) {

        //создаем числовые массивы наших строк
        var masshifr = Array(sizeshifr2, { 0 })
        var maskey = Array(sizeshifr2, { 0 })
        var chet2 = 0
        for (i in shifr2) {
            when (i) {
                'а' -> masshifr[chet2] = 1
                'б' -> masshifr[chet2] = 2
                'в' -> masshifr[chet2] = 3
                'г' -> masshifr[chet2] = 4
                'д' -> masshifr[chet2] = 5
                'е' -> masshifr[chet2] = 6
                'ё' -> masshifr[chet2] = 7
                'ж' -> masshifr[chet2] = 8
                'з' -> masshifr[chet2] = 9
                'и' -> masshifr[chet2] = 10
                'й' -> masshifr[chet2] = 11
                'к' -> masshifr[chet2] = 12
                'л' -> masshifr[chet2] = 13
                'м' -> masshifr[chet2] = 14
                'н' -> masshifr[chet2] = 15
                'о' -> masshifr[chet2] = 16
                'п' -> masshifr[chet2] = 17
                'р' -> masshifr[chet2] = 18
                'с' -> masshifr[chet2] = 19
                'т' -> masshifr[chet2] = 20
                'у' -> masshifr[chet2] = 21
                'ф' -> masshifr[chet2] = 22
                'х' -> masshifr[chet2] = 23
                'ц' -> masshifr[chet2] = 24
                'ч' -> masshifr[chet2] = 25
                'ш' -> masshifr[chet2] = 26
                'щ' -> masshifr[chet2] = 27
                'ъ' -> masshifr[chet2] = 28
                'ы' -> masshifr[chet2] = 29
                'ь' -> masshifr[chet2] = 30
                'э' -> masshifr[chet2] = 31
                'ю' -> masshifr[chet2] = 32
                'я' -> masshifr[chet2] = 33
            }
            chet2 += 1
        }
        var chet3 = 0
        if (key != null) {
            for (i in key) {
                when (i) {
                    'а' -> maskey[chet3] = 1
                    'б' -> maskey[chet3] = 2
                    'в' -> maskey[chet3] = 3
                    'г' -> maskey[chet3] = 4
                    'д' -> maskey[chet3] = 5
                    'е' -> maskey[chet3] = 6
                    'ё' -> maskey[chet3] = 7
                    'ж' -> maskey[chet3] = 8
                    'з' -> maskey[chet3] = 9
                    'и' -> maskey[chet3] = 10
                    'й' -> maskey[chet3] = 11
                    'к' -> maskey[chet3] = 12
                    'л' -> maskey[chet3] = 13
                    'м' -> maskey[chet3] = 14
                    'н' -> maskey[chet3] = 15
                    'о' -> maskey[chet3] = 16
                    'п' -> maskey[chet3] = 17
                    'р' -> maskey[chet3] = 18
                    'с' -> maskey[chet3] = 19
                    'т' -> maskey[chet3] = 20
                    'у' -> maskey[chet3] = 21
                    'ф' -> maskey[chet3] = 22
                    'х' -> maskey[chet3] = 23
                    'ц' -> maskey[chet3] = 24
                    'ч' -> maskey[chet3] = 25
                    'ш' -> maskey[chet3] = 26
                    'щ' -> maskey[chet3] = 27
                    'ъ' -> maskey[chet3] = 28
                    'ы' -> maskey[chet3] = 29
                    'ь' -> maskey[chet3] = 30
                    'э' -> maskey[chet3] = 31
                    'ю' -> maskey[chet3] = 32
                    'я' -> maskey[chet3] = 33
                }
                chet3 += 1
            }
        }

        //создаем массив с дешифрованными числами
        var massms = Array(sizeshifr2, { 0 })
        for (i in 0..(sizeshifr2 - 1)) {
            massms[i] = masshifr[i] - maskey[i]
            if (massms[i] < 0) {
                massms[i] = 33 + massms[i]
            }
            if (massms[i] == 0) {
                massms[i] = 33
            }

        }

        //создаем строку по получившемуся массиву
        var stroka = ""
        for (i in massms) {
            when (i) {
                1 -> stroka += 'а'
                2 -> stroka += 'б'
                3 -> stroka += 'в'
                4 -> stroka += 'г'
                5 -> stroka += 'д'
                6 -> stroka += 'е'
                7 -> stroka += 'ё'
                8 -> stroka += 'ж'
                9 -> stroka += 'з'
                10 -> stroka += 'и'
                11 -> stroka += 'й'
                12 -> stroka += 'к'
                13 -> stroka += 'л'
                14 -> stroka += 'м'
                15 -> stroka += 'н'
                16 -> stroka += 'о'
                17 -> stroka += 'п'
                18 -> stroka += 'р'
                19 -> stroka += 'с'
                20 -> stroka += 'т'
                21 -> stroka += 'у'
                22 -> stroka += 'ф'
                23 -> stroka += 'х'
                24 -> stroka += 'ц'
                25 -> stroka += 'ч'
                26 -> stroka += 'ш'
                27 -> stroka += 'щ'
                28 -> stroka += 'ъ'
                29 -> stroka += 'ы'
                30 -> stroka += 'ь'
                31 -> stroka += 'э'
                32 -> stroka += 'ю'
                33 -> stroka += 'я'
            }
        }
        println(stroka)
    }else{
        println("вводите символы русского алфавита")
    }
}