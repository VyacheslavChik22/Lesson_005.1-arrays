public class Arrays {
    public static void main(String[] args) {
//������1.1 �������� ������������� ������, ����������� ����� ������� � 1, 2 � 3 � � ������� ��������� ����� new.

        System.out.println("*** ������ 1: ���������� �������� \n");

        int[] arrInt = new int[3];
        arrInt[0] = 1;
        arrInt[1] = 2;
        arrInt[2] = 3;
        System.out.println("�������� ������ arrInt. ��� ����� = " + arrInt.length);

//������1.2 �������� ������, � ������� ����� ������� ��� ������� ����� � 1.57, 7.654, 9.986 �  ����� �������� ���
// ����������.


        double[] arrDouble = {1.57, 7.654, 9.986};
        System.out.println("�������� ������ arrDouble. ��� ����� = " + arrDouble.length);


//������1.3 ������������ ������ � ��� � ���������� ������ ���������� ����. �������������� �������� ������ ��������
// �������: � ������� ��������� ����� ��� ����� ����������� ����������.


        String[] arrString = {"I", "love", "you", "JAVA", "so", "much", "!"};
        System.out.println("�������� ������ arrString. ��� ����� = " + arrString.length);

//������2  �������� �� ������� �� ���� �������� � ������������ ��� �������� ���� ���� ��������, ������� � �������
// ��������, ����� �������. ������� ����� ��������� ��������� ������ ������� � ������ ��������� ���������� �� �����.
        System.out.println("\n*** ������ 2: ����� � ������� �������� ��������� �������� \n");

        for (int i = 0; i < arrInt.length; i++) {  // ���������� ���� for ��� ������� �� ��������� �������

            if (i == arrInt.length - 1) {             // (��������) ���� ������� ������� ���������, �� ������� ��� �
                // ������� ��� ���������� �������, �� ��������� ������� �� ��������� ������.
                System.out.print(arrInt[i] + "\n");
            } else {                                 // (��������) ����� ������� ������� �� ���������, ������� ��� �
                // ������� � ����������� �������.
                System.out.print(arrInt[i] + ",");
            }

        }


        for (int f = 0; f < arrDouble.length; f++) {
            if (f == arrDouble.length - 1) {
                System.out.print(arrDouble[f] + "\n");
            } else {
                System.out.print(arrDouble[f] + ",");

            }

        }

        for (int j = 0; j < arrString.length; j++) {
            if (j == arrString.length - 1) {
                System.out.print(arrString[j]);
            } else {
                System.out.print(arrString[j] + ",");
            }

        }

        System.out.println("\n*** ������ 3: ����� � ������� �������� ��������� �������� � �������� ������� \n");

        for (int k = arrInt.length - 1; k >= 0; k--) {  // ���������� ���� for ��� ������� �� ��������� �������, �� � ����
            // ��� ���������� ������ ����������� �������� ����� ������� � ���� ��� >= 0( ����� - ��� ��� 0 - ��� ������
            // ������� �������� �������), �� ��������� ��� ������ �������� ��������� �� �������� � �� ������� � �������
            // �������� ������� ������� � ����������.

            if (k == 0) {  // (��������) ���� ������� ������� ������, �� ������� ��� �
                // ������� ��� ���������� �������, �� ��������� ������� �� ��������� ������.
                System.out.print(arrInt[k] + "\n");
            } else {                                 // (��������) ����� ������� ������� �� ������, ������� ��� �
                // ������� � ����������� �������.
                System.out.print(arrInt[k] + ",");
            }

        }


        for (int l = arrDouble.length - 1; l >= 0; l--) {
            if (l == 0) {
                System.out.print(arrDouble[l] + "\n");
            } else {
                System.out.print(arrDouble[l] + ",");

            }

        }

        for (int m = arrString.length - 1; m >= 0; m--) {
            if (m == 0) {
                System.out.print(arrString[m]);
            } else {
                System.out.print(arrString[m] + ",");
            }

        }

        System.out.println("\n*** ������ 4:������������� ��� �������� ����� � ������������� ������� ������� � �������" +
                " " +
                "����������� 1 \n");

        int[] arrEven = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        for (int c = 0; c < arrEven.length; c++) {// �������� �� ��������� �������

            if (arrEven[c] % 2 != 0) {  // ���� ��� ������� �� 2 �������� �������� ������� �� ����� 0 - �� ���
                // ��������, ����� ���������� � ���� 1 � ������� � ������� ������ � ������� � ��������������.
                arrEven[c]++;
                System.out.println(arrEven[c] + " �������� �������������");
            } else {                             // ����� - ����� ������ �  ������� � ������� �� ��� ����
                System.out.println(arrEven[c]);
            }

        }
    }
}
