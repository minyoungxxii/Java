package march29th;

public class ArrStudying02 {
	
	public static void main(String[] args) {

        // ���ᰡ���� �����ϴ� �迭 jasonPrice�� ����� ��� �ʱ�ȭ
        int[] jasonPrice = { 3000, 4000, 5000 };

        // ���ᰡ���� �����ϴ� �迭 gangnamPrice�� �����ϰ� �迭 jasonPrice�� �� ��ҷ� �ʱ�ȭ
        int[] gangnamPrice = new int[3];

        gangnamPrice[0] = jasonPrice[0];
        gangnamPrice[1] = jasonPrice[1];
        gangnamPrice[2] = jasonPrice[2];

        System.out.println("===== ȫ���� ===== ");
        System.out.println("������:" + jasonPrice[0] + "��");
        System.out.println("ȫ����:" + jasonPrice[1] + "��");
        System.out.println("Ŀ�� :" + jasonPrice[2] + "��");

        System.out.println("===== ������ =====");
        System.out.println("������:" + gangnamPrice[0] + "��");
        System.out.println("ȫ����:" + gangnamPrice[1] + "��");
        System.out.println("Ŀ�� :" + gangnamPrice[2] + "��");

        System.out.println();
        System.out.println("���ݺ��� ��\n");

        // �������� �� ���� ����
        gangnamPrice[1] = 4500;

        System.out.println("===== ȫ���� =====");
        System.out.println("�� ��:" + jasonPrice[0] + "��");
        System.out.println("ȫ����:" + jasonPrice[1] + "��");
        System.out.println("Ŀ�� :" + jasonPrice[2] + "��");

        System.out.println("===== ������ =====");
        System.out.println("������:" + gangnamPrice[0] + "��");
        System.out.println("ȫ����:" + gangnamPrice[1] + "��");
        System.out.println("Ŀ�� :" + gangnamPrice[2] + "��");
    }
}


