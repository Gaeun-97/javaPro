/**
 * 
 */
package days04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author user
 *	@date-2025. 2. 6.오전 9:20:29
 * @subject
 * @content
 */
public class Ex02 {
	public static void main(String[] args) throws IOException {
			/*
			 * [문제] 두 문자열을 비교
			 * */
		
			String n1="홍길동";
			String n2;
			System.out.println(3==5);
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.print("> 이름(n2) 입력 ? ");
			n2 = br.readLine();
			System.out.printf("> n2 = [%s]\n",n2);
			
			//두 문자열을 비교할때는 == 비교연산자를 사용하지 않는다.
			//두 문자열을 비교 ? String 클래스의  equals()메서드를 사용한다.
			//System.out.printf(n1==n2); //false
			System.out.println(n1.equals(n2)); //true
			System.out.println(n1.equals(n2)?"같다":"다르다"); //true
			
			
		
		
		
	}
}

