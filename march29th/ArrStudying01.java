package march29th;

public class ArrStudying01 {
	public static void main(String[] args) {
	
		int [] gangnamPrice = {3000, 4000, 5000};
		
		
		int [] hongdaePrice = gangnamPrice;
		// => hondagePrice를 선언하면서 gangnamPrice 배열 값을 삽입하기
		
		System.out.println("강남점의 커피 가격은: " + gangnamPrice[0] + "입니다.");
		System.out.println("강남점의 홍차 가격은: " + gangnamPrice[1] + "입니다.");
		System.out.println("강남점의 오렌지쥬스 가격은: " + gangnamPrice[2] + "입니다.\n");
		
		System.out.println("홍대점의 커피 가격은: " + hongdaePrice[0] + "입니다.");
		System.out.println("홍대점의 홍차 가격은: " + hongdaePrice[1] + "입니다.");
		System.out.println("홍대점의 오렌지쥬스 가격은: " + hongdaePrice[2] + "입니다.");
		
		
		hongdaePrice[2] = 5500;
		// => 홍대점의 오렌지쥬스 가격 인상하기
		
		System.out.println();
		
		System.out.println("홍대점과 강남점의 메뉴가 업데이트 되었습니다.\n");
		
		System.out.println("강남점의 커피 가격은: " + gangnamPrice[0] + "입니다.");
		System.out.println("강남점의 홍차 가격은: " + gangnamPrice[1] + "입니다.");
		System.out.println("강남점의 인상된 오렌지쥬스 가격은: " + gangnamPrice[2] + "입니다.\n");
		
		System.out.println("홍대점의 커피 가격은: " + hongdaePrice[0] + "입니다.");
		System.out.println("홍대점의 홍차 가격은: " + hongdaePrice[1] + "입니다.");
		System.out.println("홍대점의 인상된 오렌지 쥬스 가격은: " + hongdaePrice[2] + "입니다.");
		
		
		
		
		
		
		
	}
	

	
	
	
	


}
