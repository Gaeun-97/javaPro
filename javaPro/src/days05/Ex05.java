/**
 * 
 */
package days05;

/**
 * @author user
 *	@date-2025. 2. 7.오후 12:14:45
 * @subject
 * @content
 */
public class Ex05 {

	public static void main(String[] args) {
		
		int sum = 0;
//		for (int i = 1; i <=10; i++) {
////			if (i==10) {
////				System.out.printf("%d",i);
////			} else {
////				System.out.printf("%d+",i);
////			}
//		System.out.printf("%d+",i);
//			sum+=i;
//		
//		} //for i
		int i=10;
		
//		for (int i = 10;i>=1 ; i--) {
			for (	;	 ;	 ) {
				
			System.out.printf("%d+",i);
			sum += i;
			if(i==0) break; //위치에 따라 달라짐
			i--;
		} //for i
			//Unreachable code
		System.out.printf("\b=%d\n",sum);
	}
	

}
