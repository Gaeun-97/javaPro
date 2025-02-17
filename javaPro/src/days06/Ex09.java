/**
 * 
 */
package days06;

import java.util.Scanner;

/**
 * @author user
 *	@date-2025. 2. 10.오후 4:36:59
 * @subject
 * @content
 */
public class Ex09 {

	
	public static void main(String[] args) {
		
		//한 문자 입력받아서 출력
		Scanner scanner = new Scanner(System.in);
		char one = '\u0000';
		System.out.print("> 한 문자를 입력 ?");
		scanner.next();
		
		/*
		 String input = scanner.next(); 
		 one = input.charAt(0);
		 */
		
		one = scanner.next().charAt(0);
		
		// "A"						'A'
		//'A'+'\0'				
	
		System.out.printf("%c\n",one);
	}

}
