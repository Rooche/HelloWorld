package helloworld.variable;

public class VarExaple7 {
	public static void main(String[] arg) {
	
	int myAge = 19;	
	boolean over20; //변수의 길이 의미있는 변수명
	over20 = myAge > 20; // over20 == myAge > 20 같음
	
	if(over20) {
		System.out.println("over 20");
		} else {
			System.out.println("under 20");
		}
	}
}
