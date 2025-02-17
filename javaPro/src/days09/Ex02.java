/**
 * 
 */
package days09;

/**
 * @author user
 *	@date-2025. 2. 13.오전 10:17:14
 * @subject	재귀함수
 * @content
 */
public class Ex02 {
	public static void main(String[] args) {
		// 팩토리얼(factorial)	== 계승
		//n !
		//0! = 1
//		int result = factorial(5);
		int result = recursiveFactorial(5);
		System.out.println("=" + result);
		
		

	}//main

	/**
	 * @param i
	 * @return
	 */
	private static int recursiveFactorial(int n) {
		if (n==1||n==0) {
			return 1;
		} else {
			return n * recursiveFactorial(n-1);
		}
	
	}

	private static int factorial(int n) {
		// 1*2*3*4 . . . . *n = n!
		int result = 1;
		for (int i = 1; i <= n; i++) {
			System.out.printf("%d",i);
			result *= i;
			
		} //for j 
		return result;
	}

}//class
