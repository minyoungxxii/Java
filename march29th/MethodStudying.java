package march29th;

public class MethodStudying {
	
	//�� ������ �Է¹ް� ������ �޼ҵ� �ۼ��ϱ�(�и�� 0�� �Էµ� ���� else������ �ۼ��Ѵ�.)
	void divide(int num1, int num2) {
		double result = 0.0;
		if(num2 != 0) {
			result = Double.parseDouble(String.format("0.3f", (double)num1/num2)); //���� �ȵǴ� �κ� (1)
			System.out.println(result);
			} else{
				System.out.println("0���� ū ���� �Է��ϼ���.");
			}
	}
		
	//������ �Է¹ް� �ѱ۷� �ٲٴ� �޼ҵ� �ۼ��ϱ� (ex. 4->��, 1024->�ϰ��̻�)
		void changeToHangle(String data) {
			String hangle = "�����̻�����ĥ�ȱ�";
			String result = "";
			int num = Integer.parseInt(data);
			for (int i = 0; i<data.length(); i++) {
				result += hangle.charAt(num % 10);
				num /= 10;
			}
			for(int i = data.length()-1; i>-1; i--) {
				System.out.println(result.charAt(i));
			}
	
	}
		
		public static void main(String[] args) {
			MethodStudying m = new MethodStudying();
			m.divide(5,3);
			m.changeToHangle("3");
			
		}

}



