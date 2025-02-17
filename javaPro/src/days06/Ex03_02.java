/**
 * 
 */
package days06;

/**
 * @author user
 *	@date-2025. 2. 10.오전 11:29:16
 * @subject
 * @content
 */
public class Ex03_02 {
	
	public static void main(String[] args) {
		int sum = 0;
		int i = 0;
		//1+3+5+7+9+11+=36 후위형일때는
		//1+3+5+7+9+=25 전위형이면 정상
		while (++i<=10) {
			if (i%2==0) continue;
			System.out.printf("%d+", i);
			sum+=i;
			i++;
		}//while
		
	System.out.printf("=%d",sum);

}


	}


