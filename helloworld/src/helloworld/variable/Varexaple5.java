package helloworld.variable;

public class Varexaple5 {
	public static void main(String[] args) {
		int val = 2147483647; // 4 * 1byte => byte = 8 * bit; 값이 on/off
		
		System.out.println(Integer.MAX_VALUE);
		
		long val2 = 2147483648L;
		long val3 = 10; // 10이라는 값을 -> long 으로 변환(promotion)
		
		int val4 = (int) 10L; // long의 값 2147483648 -> int (casting : 강제형변환)으로 변환
									//큰 값을 작은값으로 하면 손실이 있다 ?
		int result = (int) (100L / 5); // 
		
		long val5 = 10000000000L;
		long val6 = 10L;
		
		result = (int) (val5 - val6); // casting(강제형변환);
		System.out.println(result);
		
		char charLit = 97; // 0 ~ 65535
		charLit = 44032;
		System.out.println(charLit++);
		System.out.println(charLit++);
		System.out.println(charLit++);
		System.out.println(charLit++);
		System.out.println(charLit++);
		System.out.println(charLit++);
		System.out.println(charLit++);
		System.out.println(charLit++);
		System.out.println(charLit++);
		System.out.println(charLit++);
		
	}
}
