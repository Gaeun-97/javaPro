/**
 * 
 */
package days07_1;

import java.io.IOException;

/**
 * @author user
 *	@date-2025. 2. 11.오전 10:48:08
 * @subject
 * @content
 */
public class Ex02 {

	/**
	 * @param args
	 */
public static void main(String[] args) throws IOException {
		
		char one;
		System.out.print(" > 한 문자 입력?");
		one =(char)System.in.read();
		System.out.printf("%c\n", one);
//		System.in.read(); 	//'\r'
//		System.in.read();	//'\n' 디버깅해서 원인 알아내기
		System.in.skip(System.in.available());
		
		
		System.out.print(" > 한 문자 입력?");
		one =(char)System.in.read();
		System.out.printf("%c\n", one);

		System.out.println("end");

	}

}


