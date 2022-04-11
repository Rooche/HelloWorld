package helloworld.variable;

import java.io.IOException;
import java.util.Scanner;

public class SystemExaple {
	public static void main(String[] args) {
		//표준입력. System.in, Sysem.out
	//	Scanner scn = new Scanner(System.in); //키보드
		Scanner scn = new Scanner("홍길동 길동 박길동");
	//	System.out.println("세개의 단어를 입력, 예) 안녕 방가 잘가");
		while(scn.hasNext()) {
			String str = scn.next(); //입력하는 장치가 키보드라는 의미.
			System.out.println(str);
			if(str.equals("멈춰")) {
				break;
			}
		} 
			System.out.println("숫자를 입력하세요");
			while(true) {
				int readByte;
				try {
					readByte = System.in.read();
					System.out.println(readByte);
					if(readByte == -1)
						break;
				} catch (IOException e) {
					e.printStackTrace();
				}

			}
		
		
		System.out.println("end of program");
	}

}
