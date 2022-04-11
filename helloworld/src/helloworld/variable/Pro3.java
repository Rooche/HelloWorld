package helloworld.variable;

public class Pro3 {
	public static void main(String[] args) {
		
		int a, b, c, d, e, f;
		a = 75300;
		b = (int)(a/50000);
		c = (a%10000)/5000;
		d = (a%5000)/1000;
		e = (a%1000)/500;
		f = (a%500)/100;
		
		System.out.println("금액 : " + a);
		System.out.println("오만원 :" b + "오천원권:" c + "천원권:" d + "오백원권:" e + "백원권:" f);		
	}

}
