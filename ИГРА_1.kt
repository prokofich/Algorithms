fun main(args:Array<String>) {
    // ���� �� ���������� ��������� ��������� ������
    //���� ����:�� ������ ����� ����� �������� ���������� ����� ����� ������� ��������
    println("������� ���������� �����")
    val mutlist = mutableListOf<Int>() //���������� ������������� ������
    val n = readLine() //���� ���������� �����

    val random_1 = (0..(n!!.toInt()-1)).random()// ����� ���������� ����� (�� ���� ��������� ��������)
    for (i in 0..((n!!.toInt()) - 1)) {
        val d = readLine()
        mutlist.add(d!!.toInt()) //���������� ��������� ����� � ������
    }

    val random_2 = mutlist[random_1] //�������� ���������� ����� �� ������
    mutlist.sort() //���������� ������ �� �����������
    println(mutlist)
    println("""���� �������� ���� �� ���� �����
        ��� ��������� ������� ��� ����� �� ���������� ���������� �������""")

    var count = readLine()!!.toInt()
    var popitka = 0
    if (count != random_2) {
        while (count != random_2) {
            if (count < random_2) println("���� ����� ������")
            if (count > random_2) println("���� ����� ������")
            popitka+=1
            count = readLine()!!.toInt()
        }
        println("�����������,�� ������ �����")
        println("���������� �������: ${popitka+1}")
    }
}

