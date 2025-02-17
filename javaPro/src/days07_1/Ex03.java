/**
 * 
 */
package days07_1;

import java.util.Arrays;

/**
 * @author user
 *	@date-2025. 2. 11.오전 11:11:49
 * @subject
 * @content
 */
public class Ex03 {

	
	public static void main(String[] args) {
		String data = "홍길동, 이창익, 서영학, 정창기"; 
		String regex = ",";
		String [] names = data.split(regex);
		
		System.out.println(Arrays.toString(names));
		
		//[for문]
		//배열명.length=>배열크기
		int size = names.length;
		for (int i = 0; i < size; i++) {
			System.out.printf("names[%d]=\"%s\"\n",i,names[i]);
		} //for i
		
		//[foreach문] == 확장 for 문
//		for ( : 배열 또는 컬렉션 클래스) {
//			
//		}
		
		for (String name  : names) {
			System.out.println(name);
		}//[foreach문] == 확장 for 문
		
		
		
		//String 메서드
		// (문제) 기능 나열하고 설명
		//1. charAt()
		//2.equals()/equalsIgnoreCase()
		//3. length()
		//4. valueOf()
		//5.toUpperCase()/toLowerCase()
		//6.format()s
		//7.toCharArray
		//8."-".repeat(50)
		//9.	.trim()
		//data.split(정규표현식) //쪼개다 분리하다
	

	}//main

}
