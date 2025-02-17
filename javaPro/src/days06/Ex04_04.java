/**
 * 
 */
package days06;

import java.util.Scanner;

/**
 * @author user
 *	@date-2025. 2. 10.오후 12:38:18
 * @subject
 * @content
 */
public class Ex04_04 {

	public static void main(String[] args) {
		//[for/while] 두 정수(n,m)를 입력받아서 
		//두 정수 사이의 홀수의 합을 출력
		
		int n,m;
		int sum=0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("두 정수(n,m)를 입력 > ");
		n = scanner.nextInt();
		m=scanner.nextInt();
		int max=Math.max(n, m);
		int min = Math.min(n, m);

	
		while (min<=max) {
				System.out.printf("%d+", min);
				sum +=min;
				min+=2;
			} //while
			System.out.printf("=%d",sum);
		}

//		int i=0;
//			for (int i = n; i <m ; i++) {
//		
//				if (i%2 !=0) {
//					System.out.printf("%d+", i);
//					sum +=i;
//				} //if
////				
//		
//	} //for i

	}




