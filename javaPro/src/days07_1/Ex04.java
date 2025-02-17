/**
 * 
 */
package days07_1;

/**
 * @author user
 *	@date-2025. 2. 11.오후 12:04:14
 * @subject
 * @content
 */
public class Ex04 {

	public static void main(String[] args) {
		//[for문] 구구단 출력 - (가로로 출력)
//		System.out.printf("[ %d단 ] \n", 2);
//	      System.out.printf("%d * %d = %2d \n", 2, 1, 2*1);
//	      System.out.printf("%d * %d = %2d \n", 2, 2, 2*2);
//	      System.out.printf("%d * %d = %2d \n", 2, 3, 2*3);
//	      System.out.printf("%d * %d = %2d \n", 2, 4, 2*4);
//	      System.out.printf("%d * %d = %2d \n", 2, 5, 2*5);
//	      System.out.printf("%d * %d = %2d \n", 2, 6, 2*6);
//	      System.out.printf("%d * %d = %2d \n", 2, 7, 2*7);
//	      System.out.printf("%d * %d = %2d \n", 2, 8, 2*8);
//	      System.out.printf("%d * %d = %2d \n", 2, 9, 2*9); 
	      for (int d = 2; d <=9; d++) {
	    	  for (int i = 1; i <=9; i++) {
				 System.out.printf(" %d * %d = %2d ", d, i, d*i);
				
			} //for
	    	  System.out.println();
		} //for i
	    
	     

	}//main
}


