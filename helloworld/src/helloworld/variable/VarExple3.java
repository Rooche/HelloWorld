package helloworld.variable;

public class VarExple3 {
	public static void main(String[] args) {
		
		{
			int age = 20;
			System.out.println("나이는 " + age);
		}
		int age = 25;
		System.out.println("나이는 " + age);
		
		//조건문 if 변수 int 뭔지 모르는데 double , true와 false를 담고싶으면 boolean
		boolean isTrue = true;
		isTrue = false;
		isTrue = age > 20;
		
		if(isTrue); {
			System.out.println(age+ "는 20보다 큽니다");
		}
	}
}
