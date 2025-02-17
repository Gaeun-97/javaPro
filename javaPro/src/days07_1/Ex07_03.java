/**
 * 
 */
package days07_1;

import java.util.Scanner;

/**
 * @author user
 *	@date-2025. 2. 11.오후 5:25:25
 * @subject
 * @content
 */
public class Ex07_03 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		 // 사용자의 가위 바위 보 입력값에 대한 유효성 검사...
	      //          1 ~ 3
		// boolean 입력한문자열.matches(regex) 
		
				int user;
				String input;
				Scanner scanner = new Scanner(System.in); 

				System.out.print("> user 가위(1)/바위(2)/보(3) 선택 ? ");
				input = scanner.next();
				// user == 1 || user ==2 || user == 3
				String regex = "[1-3]"; // "[a-zA-Z0-9]"
				
				if ( input.matches(regex) ) {
					user = Integer.parseInt(input);
					System.out.printf("> user=%d\n",  user	);
				} else {
					System.out.println("[알림]입력잘못!!!");
				} // if
				
	   } // main

}
