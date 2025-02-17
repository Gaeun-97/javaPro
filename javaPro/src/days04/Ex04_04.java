/**
 * 
 */
package days04;

import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

/**
 * @author user @date-2025. 2. 6.오후 12:42:17
 * @subject
 * @content // 이름(String), 나이(byte), 키(double), 성별(boolean) 입력받아서 출력. // (출력형식)
 *          // > 이름:홍길동, 나이:20살, 키:178.89, 성별:남자/여자
 */
public class Ex04_04 {
	public static void main(String[] args) {

		/*
		 * String name ; int age; double height; //변수 선언 //
		 * System.out.print("> 이름 입력 ?"); System.out.print("> 나이 입력 ?");
		 * System.out.print("> 키 입력 ?"); System.out.print("> 성별 입력 ?");
		 * 
		 * 
		 * String str1= ; String str2=; String gender = ? 남자:여자 ;
		 * 
		 * //남자/여자 구별을 하려면..삼항연산자 사용해야하는데 //조건 맞으면 남자 나오고 아니면 여자
		 * 
		 * 
		 * System.out.printf(
		 * "> 이름:%s, 나이:%d살, 키:%0.2f, 성별:남자/여자",name,age,height,gender);
		 */
		String name;
		byte age;
		double height;
		boolean gender;

		Scanner scanner = new Scanner(System.in);

		// 홍길동 20 178.89 true
		
		  System.out.print("> 이름 나이 키 성별 입력 ?"); 
		  name = scanner.next(); age =
		  scanner.nextByte(); height = scanner.nextDouble(); 
		  gender = scanner.nextBoolean();
		 
		System.out.printf("> 이름:%s, 나이:%d살, 키:%.2f, 성별 : %b\n", name, age, height, gender ? "남자" : "여자");

		// [체크] 홍길동 20 178.89 true Scanner의 구분자를 콤마로 설정.

	}

}
