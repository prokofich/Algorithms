fun main (args:Array<String>) {
    //���� ������
    println("������� ������������� �����")
    var shifr = readLine()
    println("������� ����")
    var key = readLine()

    //������ ������ �������������� ������ ��� ��������
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
            '"', '�', ';', ':', '?', '-', '=', '>', '<', '/')) >= 0

    //������ ����� ����� � �����
    var sizeshifr2 = shifr2.length
    var sizekey = key?.length

    //�������� ��� ������
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
            '"', '�', ';', ':', '?', '-', '=', '>', '<', '/'))!! >= 0
    if (prow == false && prow2 == false) {

        //������� �������� ������� ����� �����
        var masshifr = Array(sizeshifr2, { 0 })
        var maskey = Array(sizeshifr2, { 0 })
        var chet2 = 0
        for (i in shifr2) {
            when (i) {
                '�' -> masshifr[chet2] = 1
                '�' -> masshifr[chet2] = 2
                '�' -> masshifr[chet2] = 3
                '�' -> masshifr[chet2] = 4
                '�' -> masshifr[chet2] = 5
                '�' -> masshifr[chet2] = 6
                '�' -> masshifr[chet2] = 7
                '�' -> masshifr[chet2] = 8
                '�' -> masshifr[chet2] = 9
                '�' -> masshifr[chet2] = 10
                '�' -> masshifr[chet2] = 11
                '�' -> masshifr[chet2] = 12
                '�' -> masshifr[chet2] = 13
                '�' -> masshifr[chet2] = 14
                '�' -> masshifr[chet2] = 15
                '�' -> masshifr[chet2] = 16
                '�' -> masshifr[chet2] = 17
                '�' -> masshifr[chet2] = 18
                '�' -> masshifr[chet2] = 19
                '�' -> masshifr[chet2] = 20
                '�' -> masshifr[chet2] = 21
                '�' -> masshifr[chet2] = 22
                '�' -> masshifr[chet2] = 23
                '�' -> masshifr[chet2] = 24
                '�' -> masshifr[chet2] = 25
                '�' -> masshifr[chet2] = 26
                '�' -> masshifr[chet2] = 27
                '�' -> masshifr[chet2] = 28
                '�' -> masshifr[chet2] = 29
                '�' -> masshifr[chet2] = 30
                '�' -> masshifr[chet2] = 31
                '�' -> masshifr[chet2] = 32
                '�' -> masshifr[chet2] = 33
            }
            chet2 += 1
        }
        var chet3 = 0
        if (key != null) {
            for (i in key) {
                when (i) {
                    '�' -> maskey[chet3] = 1
                    '�' -> maskey[chet3] = 2
                    '�' -> maskey[chet3] = 3
                    '�' -> maskey[chet3] = 4
                    '�' -> maskey[chet3] = 5
                    '�' -> maskey[chet3] = 6
                    '�' -> maskey[chet3] = 7
                    '�' -> maskey[chet3] = 8
                    '�' -> maskey[chet3] = 9
                    '�' -> maskey[chet3] = 10
                    '�' -> maskey[chet3] = 11
                    '�' -> maskey[chet3] = 12
                    '�' -> maskey[chet3] = 13
                    '�' -> maskey[chet3] = 14
                    '�' -> maskey[chet3] = 15
                    '�' -> maskey[chet3] = 16
                    '�' -> maskey[chet3] = 17
                    '�' -> maskey[chet3] = 18
                    '�' -> maskey[chet3] = 19
                    '�' -> maskey[chet3] = 20
                    '�' -> maskey[chet3] = 21
                    '�' -> maskey[chet3] = 22
                    '�' -> maskey[chet3] = 23
                    '�' -> maskey[chet3] = 24
                    '�' -> maskey[chet3] = 25
                    '�' -> maskey[chet3] = 26
                    '�' -> maskey[chet3] = 27
                    '�' -> maskey[chet3] = 28
                    '�' -> maskey[chet3] = 29
                    '�' -> maskey[chet3] = 30
                    '�' -> maskey[chet3] = 31
                    '�' -> maskey[chet3] = 32
                    '�' -> maskey[chet3] = 33
                }
                chet3 += 1
            }
        }

        //������� ������ � �������������� �������
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

        //������� ������ �� ������������� �������
        var stroka = ""
        for (i in massms) {
            when (i) {
                1 -> stroka += '�'
                2 -> stroka += '�'
                3 -> stroka += '�'
                4 -> stroka += '�'
                5 -> stroka += '�'
                6 -> stroka += '�'
                7 -> stroka += '�'
                8 -> stroka += '�'
                9 -> stroka += '�'
                10 -> stroka += '�'
                11 -> stroka += '�'
                12 -> stroka += '�'
                13 -> stroka += '�'
                14 -> stroka += '�'
                15 -> stroka += '�'
                16 -> stroka += '�'
                17 -> stroka += '�'
                18 -> stroka += '�'
                19 -> stroka += '�'
                20 -> stroka += '�'
                21 -> stroka += '�'
                22 -> stroka += '�'
                23 -> stroka += '�'
                24 -> stroka += '�'
                25 -> stroka += '�'
                26 -> stroka += '�'
                27 -> stroka += '�'
                28 -> stroka += '�'
                29 -> stroka += '�'
                30 -> stroka += '�'
                31 -> stroka += '�'
                32 -> stroka += '�'
                33 -> stroka += '�'
            }
        }
        println(stroka)
    }else{
        println("������� ������� �������� ��������")
    }
}