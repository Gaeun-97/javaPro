/**
 * 
 */
package days06;

/**
 * @author user
 *	@date-2025. 2. 10.오후 2:46:42
 * @subject
 * @content
 */
public class Ex07 {

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
		for (int i = 0; i < 256; i++) {
			System.out.printf("[%d('%c')]\n",i,(char)i);
		} //for i
		

	}

}
