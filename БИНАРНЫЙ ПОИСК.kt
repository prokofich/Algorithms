fun main(args:Array<String>){
    //�������� � ����������� ��������� ������
    println("������� ���������� �����")
    val mutlist = mutableListOf<Int>() //���������� ������������� ������
    val n = readLine() //���� ���������� �����

    val random_1 = (0..(n!!.toInt()-1)).random()// ����� ���������� ����� (�� ���� ��������� ��������)
    for (i in 0..((n!!.toInt()) - 1)) {
        val d = readLine()
        mutlist.add(d!!.toInt()) //���������� ��������� ����� � ������
    }
    println("������ ��������� ������� ���� �� ���� ����� � ���� �� ��� ����� ������")

    val random_2 = mutlist[random_1] //�������� ���������� ����� �� ������
    mutlist.sort() //���������� ������ �� �����������
    //��������� �������� ����� ����� � ������ � ���� �� ��� ����� ������� �� ��������� ��������� ������
    var nachalo = 0  //������ ������ ���������
    var seredina = (n!!.toInt()-1)/2  //������ �������� ���������
    var konec = n!!.toInt()-1  //������ ����� ���������
    var popitka = 0 //������� �������

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
    println("���������� ����� - ${mutlist[seredina]}")
    println("���������� �������-${popitka+1}")
}