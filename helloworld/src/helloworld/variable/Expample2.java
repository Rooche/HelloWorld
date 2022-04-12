package helloworld.variable;

import java.util.Scanner;

public class Expample2 {
	public static void main(String[] args) {
		
	      Scanner scn = new Scanner(System.in);
	      int a, b, c, d;
	      
	      System.out.print("현금: ");
	      a = scn.nextInt();
	      System.out.print("물건 가격: ");
	      b = scn.nextInt();
	      c = b * 1/10;
	      System.out.println("부가세: " + c);
	      d = a - b;
	      System.out.println("잔돈: " + d);
	   }
		
}
