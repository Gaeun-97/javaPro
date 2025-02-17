/**
 * 
 */
package days10;

import java.util.Random;

/**
 * @author user
 *	@date-2025. 2. 14.오전 8:57:24
 * @subject
 * @content
 */
public class Ex01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		      
		   }//main
	   public static String binaryConvert(int n) {
		      
		      int share, rest; // 몫, 나머지 변수
		      String binary = "";
		      while ( n != 0 ) {
		         share = n / 2;
		         rest = n % 2;
		         System.out.println( rest );
		         binary = rest + binary;
		         n = share;
		      } // while
		      
		      // System.out.println( binary );
		      //                  1010
		      return String.format("%s%s"
		            , "0".repeat( 8- binary.length()), binary);
		   }
		   
		}//class


