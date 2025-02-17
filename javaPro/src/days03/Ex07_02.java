/**
 * 
 */
package days03;

/**
 * @author user
 *	@date-2025. 2. 5.오후 3:34:03
 * @subject	산술연산자 	+  -  * /
 * @content
 */
public class Ex07_02 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int i = 10, j = 3;
		System.out.println(i + j);
		System.out.println(i - j);
		System.out.println(i * j);
		System.out.println(i / j);  //몫 연산자
		System.out.println((double)i / j);  //3.333333 나머지가 나옴
		System.out.println( i % j );
		
		
		//[주의할점]
		/*
		 * System.out.println(10/0); //ArithmeticException산술적 오류 발생
		 */		
		//System.out.println(10%0);//ArithmeticException:
		
		System.out.println( 10.0 / 0 ); //Infinity
		System.out.println( 10.0 % 0 ); //NaN (not a number)
	}

}
