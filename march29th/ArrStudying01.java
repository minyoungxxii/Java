package march29th;

public class ArrStudying01 {
	public static void main(String[] args) {
	
		int [] gangnamPrice = {3000, 4000, 5000};
		
		
		int [] hongdaePrice = gangnamPrice;
		// => hondagePrice�� �����ϸ鼭 gangnamPrice �迭 ���� �����ϱ�
		
		System.out.println("�������� Ŀ�� ������: " + gangnamPrice[0] + "�Դϴ�.");
		System.out.println("�������� ȫ�� ������: " + gangnamPrice[1] + "�Դϴ�.");
		System.out.println("�������� �������꽺 ������: " + gangnamPrice[2] + "�Դϴ�.\n");
		
		System.out.println("ȫ������ Ŀ�� ������: " + hongdaePrice[0] + "�Դϴ�.");
		System.out.println("ȫ������ ȫ�� ������: " + hongdaePrice[1] + "�Դϴ�.");
		System.out.println("ȫ������ �������꽺 ������: " + hongdaePrice[2] + "�Դϴ�.");
		
		
		hongdaePrice[2] = 5500;
		// => ȫ������ �������꽺 ���� �λ��ϱ�
		
		System.out.println();
		
		System.out.println("ȫ������ �������� �޴��� ������Ʈ �Ǿ����ϴ�.\n");
		
		System.out.println("�������� Ŀ�� ������: " + gangnamPrice[0] + "�Դϴ�.");
		System.out.println("�������� ȫ�� ������: " + gangnamPrice[1] + "�Դϴ�.");
		System.out.println("�������� �λ�� �������꽺 ������: " + gangnamPrice[2] + "�Դϴ�.\n");
		
		System.out.println("ȫ������ Ŀ�� ������: " + hongdaePrice[0] + "�Դϴ�.");
		System.out.println("ȫ������ ȫ�� ������: " + hongdaePrice[1] + "�Դϴ�.");
		System.out.println("ȫ������ �λ�� ������ �꽺 ������: " + hongdaePrice[2] + "�Դϴ�.");
		
		
		
		
		
		
		
	}
	

	
	
	
	


}
