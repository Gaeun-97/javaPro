/**
 * 
 */
package days04;

import java.util.Scanner;

/**
 * @author user
 *	@date-2025. 2. 6.오후 3:33:56
 * @subject
 * @content
 */
public class Ex06_03 {

	public static void main(String[] args) {
		//	[문제]
		//if문 사용. if~else문
		//	국어 점수를 입력 받아서 
		//	수/우/미/양/가
		//수 			90이상		100이하
		//우 			80이상		90미만(89이하)
		//미 			70이상		80미만(79이하)
		//양 			60이상		70미만(69이하)
		//가 			50이상		60미만(59이하)
		
		int n;
		Scanner scanner = new Scanner(System.in);
		System.out.println("> 국어 점수 입력 ?");
		n = scanner.nextInt();
//		switch (n) {
//		case 90:
//			System.out.println("수");
//			break;
//		case 80:
//			System.out.println("우");
//			break;
//		case 70:
//			System.out.println("미");
//		break;
//		case 60:
//			System.out.println("양");
//		break;
//		case 50:
//			System.out.println("가");
//		break;
//		}//switch
		
		
		if (n>=100) {
			System.out.printf("수");
		} 
		else if (n>=89) {
			
			System.out.printf("우");
		}
	else if (n>=79) {
			
			System.out.printf("미");
		}
	else if (n>=69) {
		
		System.out.printf("양");
	}
	else {
		System.out.printf("가");
	}

	}

}
