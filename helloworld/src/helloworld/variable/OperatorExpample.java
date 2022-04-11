package helloworld.variable;

public class OperatorExpample {
	public static void main(String[] args) {
		// 나머지: %
		// 6/4 => 몫 : 1 나머지: 2
//		int result = 6 / 4;
//		int result2 = 6 % 4; // 나머지 값 구하기
//		int val = 5;
		
//		if(val % 2 == 0) {
//			System.out.println("짝수입니다");
//		} else {
//			System.out.println("홀수입니다");
//		}
		
		// 75300원
		// 5만원 => ?개, 1만원 => ?개, 5천원 => ?개
		// 1천원 => ?개, 5백원 => ?개, 1백원 => ?개
		
		//75300원이라는 값은 5만원 1개, 1만원 2개, 5천원 1개, 1백원 3개

		int a = 75300;
		int b = (int)(a/50000);
		int c = (a%10000)/5000;
		int d = (a%5000)/1000;
		int e = (a%1000)/500;
		int f = (a%500)/100;
		
		System.out.println("금액 : " + a);
		System.out.println("오만원 :" b + "오천원권:" c+ "천원권:" d+ "오백원권:" e+ "백원권:" f);		
	}
}
