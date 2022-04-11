package helloworld.variable;

import java.util.Scanner;

public class Pro2 {
	public static void main(String[] args) {
		//점수를 세개 입력 합, 평균, 고득점 =>합은 230이고 평균은 76.67이고 최고점은 90점입니다
		Scanner scn = new Scanner(System.in);
		
		int a, b, c, sum, max;
		double avg;
		
		System.out.println("점수 입력");
		a = scn.nextInt();
		System.out.println("점수 입력");
		b = scn.nextInt();
		System.out.println("점수 입력");
		c = scn.nextInt();
		
		sum = a + b + c;
		avg = (a + b + c) / 3.0;
		System.out.printf("점수 세개의 합과 평균은 :%2d, %.2f", sum, avg);

		//최고점을 구하는 방식(a, b, c) 비교
		max = 0;
		if(a > b) {
			max = a;
		} else {
			max = b;
		} if(max < c) {
			max = c;
		}
		
		System.out.printf("최고점은 %3d", max);
	}

}
