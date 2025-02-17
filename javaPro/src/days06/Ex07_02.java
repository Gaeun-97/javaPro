/**
 * 
 */
package days06;

import java.util.Scanner;

/**
 * @author user
 *	@date-2025. 2. 10.오후 3:22:25
 * @subject
 * @content
 */
public class Ex07_02 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//과제 [순서도 1~100 홀수의 합]
		// for 순서도
		//while 순서도
		
		//ASCII + for 문 출력.
		// 256가지의 문자를 나타냄
		//0~31 제어문자  '\n', '\t' 등등
		//32~127 일반 문자( 대문자 65~90 소문자97~122 숫자48~57)
		//128~
		//[문제] 한 라인에 10개의 ASCII 문자를 출력
		for (int i = 0, lineNumber=1; i < 256; i++) {
			
			//라인에 10개 문자 출력
			// ASCII 문자 
			//윈도우 개행 : Carriage Return(CR) +Line Feed(LF)
			//													'\r' '13										'\n'10
			//
			//if(i%10==0)System.out.printf("%d : ", i/10+1);
			Scanner scanner = new Scanner(System.in);
				if(i%10==0)System.out.printf("%d : ", lineNumber);
				System.out.printf("[%c]",(char)i);
				if (i%10==9) {
					System.out.println();//개행코드
					if(lineNumber%5==1) {
						//if(lineNumber++ %5==0) {
						System.out.println("\t계속 하려면 엔터 입력 ");
						scanner.nextLine();
						
					}
					//lineNumber++;
				}
					
				
				
			
			
		} //for i
		
		//마지막 라인 : 6 [][][][][][]
		//개행 코딩

	}

}
