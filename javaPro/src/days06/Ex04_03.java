/**
 * 
 */
package days06;

import java.util.Scanner;

/**
 * @author user
 *	@date-2025. 2. 10.오후 12:28:47
 * @subject
 * @content
 */
public class Ex04_03 {

	public static void main(String[] args) {
		//[while] 두 정수(n,m)를 입력받아서 두 정수 사이의 합을 출력
		int n,m;
		int sum=0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("두 정수(n,m)를 입력 > ");
		n = scanner.nextInt();
		m=scanner.nextInt();
		int max=Math.max(n, m);
		int min = Math.min(n, m);
		int i = 0;
		
		while (i<=max) {
			System.out.printf("%d+", i);
			sum+=i;
			
			i++;
			
			
		}
		/*
		 * while (min<=max) {
			System.out.printf("%d+", i);
			sum+=min;
			
			min++;
			
		}*/
		//금요일날  git 수업 할 생각이니 잊지말고 선생님께 알려드리기
				System.out.printf("=%d",sum);
	}

}
