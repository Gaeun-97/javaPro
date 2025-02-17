/**
 * 
 */
package days06;

import java.util.Scanner;

/**
 * @author user
 *	@date-2025. 2. 10.오후 12:03:04
 * @subject
 * @content
 */
public class Ex04_01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//[for] 두 정수(n,m)를 입력받아서 두 정수 사이의 합을 출력,
		//[while]
		

		int n,m=0;
		int sum=0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("n,m을 입력 >");
		n= scanner.nextInt();
		m= scanner.nextInt();
		
		//[문제]★
		//삼항 연산자 or Math.max(n,m);
		
		//int min = n > m ? m : n ;
		int min = Math.min(n, m);
		
		int max=Math.max(n, m);
		
		for(int i = min; i<=max; i++) {
			System.out.printf("%d+", i);
			sum += i;
		}
		System.out.printf("=%d",sum);
		
		 // [2]  n 작은값 m 큰값    자리바꾸기 
	      /*
	      if ( n > m ) {
	         int temp = n;
	         n = m;
	         m = temp;
	      } // if 
	      
	      for (int i = n; i <= m ; i++) {
	         System.out.printf("%d+", i);
	         sum += i;
	      } // for i
	      */
	      
	      /* [1]
	      if (n > m) {  // n == m
	         for (int i = m; i <= n ; i++) {
	            System.out.printf("%d+", i);
	            sum += i;
	         } // for i
	      } else {
	         for (int i = n; i <= m ; i++) {
	            System.out.printf("%d+", i);
	            sum += i;
	         } // for i
	      } // if      
	      */

		
//		for (int i = n; i < m; i++) {
//	
//			System.out.printf("%d+", i);
//			sum=+i;
//			
//		} //for i
		
		

	}

}
