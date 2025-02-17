/**
 * 
 */
package days10;

/**
 * @author user
 *	@date-2025. 2. 14.오후 12:14:54
 * @subject
 * @content
 */
public class Ex03_05 {

	public static void main(String[] args) {
		// [ 별 찍기 - 5 ]            공백
		// ___*      i=1   j=1       3
		// __**      i=2   j=2       2
		// _***    	 i=3   j=3       1
		// ****      i=4   j=4       0


		//		for (int i = 1; i <= 4; i++) {
		//공백찍는 for문
		//			for (int j = 1; j < i-1; j++) {
		//				System.out.print(" ");
		//			}
		//			for (int j = 1;  j <5-i; j++) {
		//			
		//					System.out.print("*");
		//					
		//				} //for k
		//				
		//				} //for 
		//				System.out.println();
		//			} //for 
		//[2]
		//		for (int i = 1; i <= 4; i++) {
		//			
		//			for (int j = 0; j < i; j++) {
		//				System.out.print("*");
		//			} //for j
		//			
		//		} //for i
		//	
		
		
		//[3]
		
		//__*		
		//_***
		// *****
		
		for (int i = 1; i <=3; i++) {
			for (int j = 1; j <=5; j++) {
				System.out.print(i+ j>=5 ?"*":" ");
			} //for j
			System.out.println();
		} //for i
		
		
//
//		for (int i = 1; i < 4; i++) {
//			for (int j =1; j <3-i; j++) {
//				System.out.print("_");
//				for (int k = 0; k < 2*i-1; k++) {
//					System.out.print("*");
//
//				} //for kr
//			
//			} //for j
//		} //for i

	}
}
