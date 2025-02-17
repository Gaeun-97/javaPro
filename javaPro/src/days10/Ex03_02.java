/**
 * 
 */
package days10;

/**
 * @author user
 *	@date-2025. 2. 14.오전 11:46:52
 * @subject
 * @content
 */
public class Ex03_02 {

	public static void main(String[] args) {
		//[별 찍기 - 2]
		//		*
		//		**
		//		***
		//		****
		//	[2]
		for (int i = 1; i <=4; i++) {
			for (int j = 1; j <=4; j++) {
				System.out.print(i>= j ?"*":" ");
			} //for j
			System.out.println();
		} //for i




		/*[1]
		for (int i = 1; i < 4; i++) {
			for (int j = 0; j < 5-i; j++) {
				System.out.print("_");
			for (int j1 = 0; j1 <i; j1++) {
					System.out.print("*");
				} //for k
			System.out.println();
			} //for 
		} //for j
		 */

	}//main



}//class


