package march29th;

public class MethodStudying {
	
	//두 정수를 입력받고 나누는 메소드 작성하기(분모로 0이 입력될 경우는 else문으로 작성한다.)
	void divide(int num1, int num2) {
		double result = 0.0;
		if(num2 != 0) {
			result = Double.parseDouble(String.format("0.3f", (double)num1/num2)); //이해 안되는 부분 (1)
			System.out.println(result);
			} else{
				System.out.println("0보다 큰 수를 입력하세요.");
			}
	}
		
	//정수를 입력받고 한글로 바꾸는 메소드 작성하기 (ex. 4->사, 1024->일공이사)
		void changeToHangle(String data) {
			String hangle = "공일이삼사오육칠팔구";
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



