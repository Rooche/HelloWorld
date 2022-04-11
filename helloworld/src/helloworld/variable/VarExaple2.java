package helloworld.variable;

public class VarExaple2 {
	public static void main(String[] args) {
		// 국어 80 , 영어 70 , 수학 69
		// 평균 변수 선언 + + + /
		int koreanScore = 80;
		int engScore = 70;
		int mathscore = 63;
		
		int reslut = koreanScore + engScore + mathscore;
		
		//국어85 영어75 수학60 220/3 = 73.333
		
		koreanScore = 85;
		engScore = 70;
		mathscore = 60;
		
		double avg = ( 85 + 75 + 60) / 3.0;
		
		System.out.println(" 국어점수" + koreanScore + " 영어점수" + engScore + " 수학점수" + mathscore + "의 평균 : " + reslut / 3 + "입니다." );
		System.out.println(" 국어점수" + koreanScore + " 영어점수" + engScore + " 수학점수" + mathscore + "의 평균 : " + reslut / 3 + "입니다." + avg);
	}

}
