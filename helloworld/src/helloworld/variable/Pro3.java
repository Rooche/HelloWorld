package helloworld.variable;

public class Pro3 {
	public static void main(String[] args) {
		
		int a = 75300;
		int b = (int)(a/50000);
		int c = (a%50000)/10000;
		int d = (a%10000)/5000;
		int e = (a%5000)/1000;
		int f = (a%1000)/500;
		int g = (a%500)/100;
		
		System.out.println("금액 : " + a);
		System.out.println("오만원 :" + b + "만원권:" + c + "오천원권:"+ d + "천원권:" + e + "오백원권:"+ f + "백원권:" + g);		
	}

}
