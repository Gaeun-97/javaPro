/**
 * 
 */
package days06;

import java.io.IOException;

/**
 * @author user
 *	@date-2025. 2. 10.오후 5:26:25
 * @subject
 * @content
 */
public class Ex09_03 {

	public static void main(String[] args) throws IOException {
		
		char one;
		System.out.print(" > 한 문자 입력?");
		one =(char)System.in.read();
		System.out.printf("%c\n", one);
		System.in.read();
		System.in.read();
		System.out.print(" > 한 문자 입력?");
		one =(char)System.in.read();
		System.out.printf("%c\n", one);
		//두 번 입력 할 수 있게 해주는 기능...

	}

}
