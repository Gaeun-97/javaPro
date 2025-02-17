/**
 * 
 */
package days06;

/**
 * @author user
 *	@date-2025. 2. 10.오전 11:37:08
 * @subject
 * @content
 */
public class Ex03_03 {

	public static void main(String[] args) {
//		int sum = 0;
//		//[for] 1~10=55
//		for (int i = 0; i <= 10; i++) {
//				if (i%2 != 0) break;
//				//break 제어문을 빠져 나갈때
//				System.out.printf("%d+", i);
//				sum+=i;
//		}
//	

		//[for] 1~10=55
//		for (int i = 0; i <= 10; i++) {
//				if (i%2 != 0) break;
//				//break 제어문을 빠져 나갈때
//				System.out.printf("%d+", i);
//				sum+=i;
//		}//for
		int sum = 0;
		int i=0;
		while (i<=10) {
			if (i%2!=0) {
				System.out.printf("%d+", i);
				sum+=i;
				i+=2;
			} //if
			System.out.printf("=%d",sum);
		}
	
		
	}//main

}
