package helloworld.variable;

import java.util.*;

public class Expample2 {
	public static void main(String[] args) {
		
	      Scanner sc = new Scanner(System.in);
	      int cu, money, tax, change;
	      
	      System.out.print("현금: ");
	      cu = sc.nextInt();
	      
	      System.out.print("물건 가격: ");
	      money = sc.nextInt();
	      
	      tax = money * 1/10;
	      System.out.println("부가세: " + tax);
	      
	      change = cu - money;
	      System.out.println("잔돈: " + change);
	   }
		
}
