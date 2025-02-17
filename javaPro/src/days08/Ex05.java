/**
 * 
 */
package days08;

import java.util.Scanner;

/**
 * @author user
 *	@date-2025. 2. 12.오후 2:07:03
 * @subject
 * @content
 */
public class Ex05 {

	public static void main(String[] args) {
		//오버로딩
		//drawLine()
		//drawLine(int)
		//drawLine(int,String)
		
		int x,y,result;
		Scanner scanner = new Scanner(System.in);
		System.out.print(" > x, y input?");
		x = scanner.nextInt();
		y = scanner.nextInt();
		
//		result=x+y;
		//두 정수의 합을 반환하는 sum() 메서드를 선언 ->호출
		result =sum(x,y); //메소드 호출부
		
		System.out.printf("%d+%d=%d\n",x,y,result);
		
		
	}

	// 메소드 호출이 아닌 선언부분.
	private static int sum(int x, int y) {
		int result = x + y;
		//return result; 
		return x+y; // 두 정수의 합을 돌려줌
	}

}
