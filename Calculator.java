import java.util.Scanner;

interface Operaions {
    public int add(int num1, int num2);
    public int sub(int num1, int num2);
    public int mul(int num1, int num2);
    public int div(int num1, int num2);
}

class Calcy implements Operaions {
    public Calcy(int num1, int num2, String o) {
        if (o.equals("+")) {
            System.out.println(num1 + "+" + num2 + "=" + add(num1, num2));
            return;
        }
        if (o.equals("-")) {
            System.out.println(num1 + "-" + num2 + "=" + sub(num1, num2));
            return;
        }
        if (o.equals("*")) {
            System.out.println(num1 + "*" + num2 + "=" + mul(num1, num2));
            return;
        }
        if (o.equals("/")) {
            System.out.println(num1 + "/" + num2 + "=" + div(num1, num2));
            return;
        }
        System.out.println("����������� ��������");
    }

    public int add(int num1, int num2) {
        return num1 + num2;
    }

    public int sub(int num1, int num2) {
        return num1 - num2;
    }

    public int mul(int num1, int num2) {
        return num1 * num2;
    }

    public int div(int num1, int num2) {
        return num1 / num2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("������� ������ �����: ");
        int num1 = sc.nextInt();
        System.out.print("������� ������ �����: ");
        int num2 = sc.nextInt();
        System.out.println("�������� ��������:" + "\n" + "�������� +" + "\n" + "��������� -" + "\n" + "��������� *" + "\n" + "������� /" + "\n");
        String o = sc.next();
	Calcy Cal = new Calcy(num1,num2,o);
        sc.close();
        }
    }