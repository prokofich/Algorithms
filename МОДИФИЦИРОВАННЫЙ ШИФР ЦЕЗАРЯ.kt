fun main (args:Array<String>) {
    //���� ������
    println("�������,����������,���������:")
    var sms = readLine()
    println("�������,����������,����:")
    var key = readLine()

    //������ ������ � ���������� ��� ��������
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
            '"', '�', ';', ':', '?', '-', '=', '>', '<', '/'))>=0

        var sizestroka = stroka.length
        var sizekey = key?.length


        //�������� � ������ ����������� �������
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
        //�������� ������ �� ������ ������ ��� ���� ����������� ���������
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
                '"', '�', ';', ':', '?', '-', '=', '>', '<', '/'))!!>=0
    if (prow==false && prow2==false){


        //������� ������� ����� ��� ��������� � �����
        var masstr = Array(sizestroka2, { 0 })
        var maskey = Array(sizestroka2, { 0 })
        var chet2 = 0
        var chet3 = 0
        for (i in stroka) {
            when (i) {
                '�' -> masstr[chet2] = 1
                '�' -> masstr[chet2] = 2
                '�' -> masstr[chet2] = 3
                '�' -> masstr[chet2] = 4
                '�' -> masstr[chet2] = 5
                '�' -> masstr[chet2] = 6
                '�' -> masstr[chet2] = 7
                '�' -> masstr[chet2] = 8
                '�' -> masstr[chet2] = 9
                '�' -> masstr[chet2] = 10
                '�' -> masstr[chet2] = 11
                '�' -> masstr[chet2] = 12
                '�' -> masstr[chet2] = 13
                '�' -> masstr[chet2] = 14
                '�' -> masstr[chet2] = 15
                '�' -> masstr[chet2] = 16
                '�' -> masstr[chet2] = 17
                '�' -> masstr[chet2] = 18
                '�' -> masstr[chet2] = 19
                '�' -> masstr[chet2] = 20
                '�' -> masstr[chet2] = 21
                '�' -> masstr[chet2] = 22
                '�' -> masstr[chet2] = 23
                '�' -> masstr[chet2] = 24
                '�' -> masstr[chet2] = 25
                '�' -> masstr[chet2] = 26
                '�' -> masstr[chet2] = 27
                '�' -> masstr[chet2] = 28
                '�' -> masstr[chet2] = 29
                '�' -> masstr[chet2] = 30
                '�' -> masstr[chet2] = 31
                '�' -> masstr[chet2] = 32
                '�' -> masstr[chet2] = 33
            }
            chet2 += 1
        }
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

        //������� ������ � ����������������� ������� ��� ��������
        var massum = Array(sizestroka2, { 0 })
        for (i in 0..(sizestroka2 - 1)) {
            massum[i] = (masstr[i] + maskey[i]) % 33
        }

        //������� ������ � �������� � ��� ����������� ����� � ����������� �� ����� � �������
        var laststroka = ""
        var chet4 = 1
        for (i in massum) {
            when (i) {
                1 -> laststroka += '�'
                2 -> laststroka += '�'
                3 -> laststroka += '�'
                4 -> laststroka += '�'
                5 -> laststroka += '�'
                6 -> laststroka += '�'
                7 -> laststroka += '�'
                8 -> laststroka += '�'
                9 -> laststroka += '�'
                10 -> laststroka += '�'
                11 -> laststroka += '�'
                12 -> laststroka += '�'
                13 -> laststroka += '�'
                14 -> laststroka += '�'
                15 -> laststroka += '�'
                16 -> laststroka += '�'
                17 -> laststroka += '�'
                18 -> laststroka += '�'
                19 -> laststroka += '�'
                20 -> laststroka += '�'
                21 -> laststroka += '�'
                22 -> laststroka += '�'
                23 -> laststroka += '�'
                24 -> laststroka += '�'
                25 -> laststroka += '�'
                26 -> laststroka += '�'
                27 -> laststroka += '�'
                28 -> laststroka += '�'
                29 -> laststroka += '�'
                30 -> laststroka += '�'
                31 -> laststroka += '�'
                32 -> laststroka += '�'
                33 -> laststroka += '�'
            }
            if (chet4 % 5 == 0) {
                laststroka += ' '
            }
            chet4 += 1
        }
        println("������������� ��������� ��������: $laststroka")

    }else{
        println("������� ������� �������� �������� !")
    }
}