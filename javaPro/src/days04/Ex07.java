/**
 * 
 */
package days04;

import java.util.Scanner;

/**
 * @author user
 *	@date-2025. 2. 6.오후 2:15:57
 * @subject 분기문 switch
 * @content
 */
public class Ex07 {
//		switch (key) {
//		case value:
//			break;
//		case value:
//			break;
//		case value:
//			break;
//		[default:
//			break;]
//		}//switch
	
	public static void main(String[] args) {
		// [ 문제 ]  switch 문 사용
		// 정수를 입력받아서 "홀수" / "짝수"라고 출력
		
		int n;
		Scanner scanner = new Scanner(System.in);
		System.out.println("> 정수(n)입력 ?");
		n = scanner.nextInt();
		String result = null;
		switch (n%2) {
		case 0:
//			System.out.printf("짝수(Even Number");
			result = "짝수(Even Number";
			break;
		case 1:
//			System.out.println("홀수( Odd Number)");
			result = "홀수( Odd Number)";
			break;

			//default:
			//break;
		}//switch

		


	}

}
