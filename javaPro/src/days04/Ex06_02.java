/**
 * 
 */
package days04;

import java.util.Iterator;
import java.util.Scanner;

/**
 * @author user @date-2025. 2. 6.오후 2:15:38
 * @subject
 * @content
 */
public class Ex06_02 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// [문제]
		// 정수를 입력받아서 "홀수"/"짝수" 라고 출력
		int n;
		// Resource leak: 'scanner' is never closed
		// scanner.close()
		@SuppressWarnings("resource") // 어노테이션
		Scanner scanner = new Scanner(System.in);
		System.out.printf("> 정수(n)입력 ?");
		n = scanner.nextInt();

		/*
		 * if (n%2==0) { System.out.println("짝수(Even Number)"); } //if
		 * 
		 * if ( n % 2 !=0) { System.out.println("홀수( Odd Number)"); } //if
		 */
		if (n%2==0) {
			System.out.println("짝수(Even Number)");
		} else {
			System.out.println("홀수( Odd Number)");
		}
		System.out.println("end");

	}// main

}
