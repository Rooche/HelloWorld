package helloworld.variable;

public class VarExple6 {
	public static void main(String[] args) {
		String myName = "홍길동"; // 참조데이터타입 , 문자열 값을 담을때는 String
		
		int age = 25; // 기본데이터타입
		double height = 167.4;
		int mathScore, engScore;
		mathScore = 80;
		engScore = 90;
		
		System.out.println(myName + "의 나이는 " + age + "이고 키는" + height + "이고" + " 영어와 수학점수의 합은" + (mathScore + engScore) + "입니다.");
		// 앞(첫번째)이 문자열이면 뒤에도 다 문자열로 인식함 그래서 ()를 안붙이면 점수가 8090이라고 나와서 ()를 붙여 연산하게 해둠
//		char firstChar = myName.charAt(0);
//		System.out.println((int) firstChar);
	}

}
