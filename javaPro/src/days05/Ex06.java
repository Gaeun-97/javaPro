/**
 * 
 */
package days05;

/**
 * @author user
 *	@date-2025. 2. 7.오후 2:26:55
 * @subject
 * @content
 */
public class Ex06 {
	public static void main(String[] args) {
		
		//[while]			1~10=55
		int sum = 0;
		int i=0;
		while (true) {
			if(i==11) break;
			System.out.printf("%d+",i);
			sum+=i;
			i++;
		}//
		System.out.printf("\b=%d\n",sum);
		
	}//main

}
