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
public class Ex03_03 {

	public static void main(String[] args) {
		// [ 별 찍기 - 3 ]
		// ****      i=1   j=4
		// ***     	 i=2   j=3
		// **    	 i=3   j=2
		// *         i=4   j=1
		//           j=5-i 

		//		for (int i = 1; i <=4; i++) {
		//			for (int j = 1;  j <=5-i; j++) {
		//					System.out.print("*");
		//				} //for k
		//				
		//				} //for 
		//				System.out.println();
		//			} //for 
		//

		
		//[3]
				for (int i = 1; i <=4; i++) {
					for (int j = 1; j <=4; j++) {
						System.out.print(i+ j<=5 ?"*":" ");
					} //for j
					System.out.println();
				} //for i

	}
}


