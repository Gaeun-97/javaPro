/**
 * 
 */
package days10;

/**
 * @author user
 *	@date-2025. 2. 14.오후 2:06:47
 * @subject
 * @content
 */
public class Ex03_07 {
	

	/**													  공백		별				
	  // __*								i=1			j=2			j=1
      // _***							i=2			j=1			j=3
      // *****							i=3			j=0			j=5
      // _***							i=4			j=1			j=3
      // __*								i=5			j=2			j=1
       				
       				1행 3열/2행4열/3행5열/4행4열/5행3열
	 */
	public static void main(String[] args) {
		
		for (int i = 1; i <=4; i++) {
			for (int j = 1; j <=4; j++) {
				System.out.print(i+ j>=4 &&j-i<=2 ?"*":" ");
			} //for j
			System.out.println();
		} //for i
		
//		for (int i = 1; i <=5; i++) {
//			for (int j = 0; j <=( i<=3?3-i:i-3); j++) {
//				System.out.print("_"); 			
//			} //for j
//			for (int j = 0; j <= (i<=3?2*i-1:5-2*(i-3)) ; j++) {
//				System.out.print("*"); 
//			} //for j
//			System.out.println();
//		} //for i

	}

}
