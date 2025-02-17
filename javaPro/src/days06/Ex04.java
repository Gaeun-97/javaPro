/**
 * 
 */
package days06;

import java.util.Scanner;

/**
 * @author user
 *	@date-2025. 2. 10.오전 11:42:50
 * @subject
 * @content
 */
public class Ex04 {

	
	public static void main(String[] args) {
		
		int sum = 0,n;
		Scanner scanner = new Scanner(System.in);
		System.out.print(">양의 정수(n) 입력?");
		n = scanner.nextInt();
		
//		for (int i = 0 ; i <= n ; i++) {
//			System.out.printf("%d+",i);
//			sum += i;
//			
//		} //for i
		if(n<1) {
			System.out.println("[알림] 양의 정수만 입력!!");
			return;
		}
		int i=1;
		while (i<=n) {
			System.out.printf("%d+",i);
			sum +=i;
			i++;
			
		}
		System.out.printf("=%d",sum);

	}

}
