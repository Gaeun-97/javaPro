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
public class Ex03_06 {

	public static void main(String[] args) {
		//[별찍기 - 6 ]
		// 						공백 /		별
		//					i   	j		/		   j
		//		__*		1		2				1	
		//		_***	2		1				3	
		//		*****3		0				5
		
		for (int i = 1; i <=3; i++) {
			for (int j = 1; j <=5; j++) {
				//System.out.print(i+ j==4 || i==3||j-i==2 ?"*":" ");
				System.out.print(i+j>=4 && j-i<=2? "*":" ");
				
				
			} //for j
			System.out.println();
		} //for i

	}
}
