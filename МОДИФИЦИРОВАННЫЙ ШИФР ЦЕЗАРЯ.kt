fun main (args:Array<String>) {
    //ввод данных
    println("введите,пожалуйста,сообщение:")
    var sms = readLine()
    println("введите,пожалуйста,ключ:")
    var key = readLine()

    //создаю строку с сообщением без пробелов
    var stroka = ""
    if (sms != null) {
        for (i in sms) {
            if (i != ' ') {
                stroka +=  i
            }
        }
    }
    var prow = stroka.indexOfAny(charArrayOf('q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p', 'a', 's', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'z', 'x', 'c', 'v', 'b', 'n', 'm',
            '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '!', '@', '#', '$', '%', '^', '&', '*', '(', ')', '_', '+',
            '"', 'є', ';', ':', '?', '-', '=', '>', '<', '/'))>=0

        var sizestroka = stroka.length
        var sizekey = key?.length


        //вставл€ю в строку недостающие символы
        if (stroka != null) {
            if (sizestroka % 5 == 1) {
                stroka += stroka[0]
                stroka += stroka[1]
                stroka += stroka[2]
                stroka += stroka[3]
            }
            if (sizestroka % 5 == 2) {
                stroka += stroka[0]
                stroka += stroka[1]
                stroka += stroka[2]
            }
            if (sizestroka % 5 == 3) {
                stroka += stroka[0]
                stroka += stroka[1]
            }
            if (sizestroka % 5 == 4) {
                stroka += stroka[0]
            }
        }

        var sizestroka2 = stroka.length
        var shet = 0
        //создадим строку из ключей длиной как наше дополненное сообщение
    if (sizekey != null) {
        if (sizekey<sizestroka2) {
            if (sizekey != null) {
                if (key != null) {
                    for (i in 1..(sizestroka2 - sizekey)) {
                        key += key[(shet % sizekey)]
                        shet += 1
                    }
                }
            }
        }
    }

        var prow2 = key?.indexOfAny(charArrayOf('q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p', 'a', 's', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'z', 'x', 'c', 'v', 'b', 'n', 'm',
                '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '!', '@', '#', '$', '%', '^', '&', '*', '(', ')', '_', '+',
                '"', 'є', ';', ':', '?', '-', '=', '>', '<', '/'))!!>=0
    if (prow==false && prow2==false){


        //создаем массивы чисел дл€ сообщени€ и ключа
        var masstr = Array(sizestroka2, { 0 })
        var maskey = Array(sizestroka2, { 0 })
        var chet2 = 0
        var chet3 = 0
        for (i in stroka) {
            when (i) {
                'а' -> masstr[chet2] = 1
                'б' -> masstr[chet2] = 2
                'в' -> masstr[chet2] = 3
                'г' -> masstr[chet2] = 4
                'д' -> masstr[chet2] = 5
                'е' -> masstr[chet2] = 6
                'Є' -> masstr[chet2] = 7
                'ж' -> masstr[chet2] = 8
                'з' -> masstr[chet2] = 9
                'и' -> masstr[chet2] = 10
                'й' -> masstr[chet2] = 11
                'к' -> masstr[chet2] = 12
                'л' -> masstr[chet2] = 13
                'м' -> masstr[chet2] = 14
                'н' -> masstr[chet2] = 15
                'о' -> masstr[chet2] = 16
                'п' -> masstr[chet2] = 17
                'р' -> masstr[chet2] = 18
                'с' -> masstr[chet2] = 19
                'т' -> masstr[chet2] = 20
                'у' -> masstr[chet2] = 21
                'ф' -> masstr[chet2] = 22
                'х' -> masstr[chet2] = 23
                'ц' -> masstr[chet2] = 24
                'ч' -> masstr[chet2] = 25
                'ш' -> masstr[chet2] = 26
                'щ' -> masstr[chet2] = 27
                'ъ' -> masstr[chet2] = 28
                'ы' -> masstr[chet2] = 29
                'ь' -> masstr[chet2] = 30
                'э' -> masstr[chet2] = 31
                'ю' -> masstr[chet2] = 32
                '€' -> masstr[chet2] = 33
            }
            chet2 += 1
        }
        if (key != null) {
            for (i in key) {
                when (i) {
                    'а' -> maskey[chet3] = 1
                    'б' -> maskey[chet3] = 2
                    'в' -> maskey[chet3] = 3
                    'г' -> maskey[chet3] = 4
                    'д' -> maskey[chet3] = 5
                    'е' -> maskey[chet3] = 6
                    'Є' -> maskey[chet3] = 7
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
                    '€' -> maskey[chet3] = 33
                }
                chet3 += 1
            }
        }

        //создаем массив с просуммированными числами дл€ шифровки
        var massum = Array(sizestroka2, { 0 })
        for (i in 0..(sizestroka2 - 1)) {
            massum[i] = (masstr[i] + maskey[i]) % 33
        }

        //создаем строку и помещаем в ней необходимые буквы в зависимости от числа в массиве
        var laststroka = ""
        var chet4 = 1
        for (i in massum) {
            when (i) {
                1 -> laststroka += 'а'
                2 -> laststroka += 'б'
                3 -> laststroka += 'в'
                4 -> laststroka += 'г'
                5 -> laststroka += 'д'
                6 -> laststroka += 'е'
                7 -> laststroka += 'Є'
                8 -> laststroka += 'ж'
                9 -> laststroka += 'з'
                10 -> laststroka += 'и'
                11 -> laststroka += 'й'
                12 -> laststroka += 'к'
                13 -> laststroka += 'л'
                14 -> laststroka += 'м'
                15 -> laststroka += 'н'
                16 -> laststroka += 'о'
                17 -> laststroka += 'п'
                18 -> laststroka += 'р'
                19 -> laststroka += 'с'
                20 -> laststroka += 'т'
                21 -> laststroka += 'у'
                22 -> laststroka += 'ф'
                23 -> laststroka += 'х'
                24 -> laststroka += 'ц'
                25 -> laststroka += 'ч'
                26 -> laststroka += 'ш'
                27 -> laststroka += 'щ'
                28 -> laststroka += 'ъ'
                29 -> laststroka += 'ы'
                30 -> laststroka += 'ь'
                31 -> laststroka += 'э'
                32 -> laststroka += 'ю'
                33 -> laststroka += '€'
            }
            if (chet4 % 5 == 0) {
                laststroka += ' '
            }
            chet4 += 1
        }
        println("зашифрованное сообщение получено: $laststroka")

    }else{
        println("вводите символы русского алфавита !")
    }
}