/**
 * 
 */
package days04;

import java.util.Scanner;

/**
 * @author user
 *	@date-2025. 2. 6.오후 12:33:08
 * @subject
 * @content
 */
public class Ex04_02 {

	private static Readable input;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Scanner s = new Scanner(input);
		s.useDelimiter("\\s*fish\\s*"); //정규표현식 (String regex)★
		//						\s 공백★ 원래는 \\임
		//						* 반복 횟수 0~여러번★
		System.out.println(s.nextInt());
	     System.out.println(s.nextInt());
	     System.out.println(s.next());
	     System.out.println(s.next());
	     s.close();

	}

}
