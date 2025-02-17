/**
 * 
 */
package days04;

/**
 * @author user
 *	@date-2025. 2. 6.오후 12:07:08
 * @subject
 * @content
 */
public class Ex03_02 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//학생의 이름을 여러명 저장 -> 배열 선언
		//The local variable names may not have been initialized
		//java.lang.NullPointerException
		
		String [] names = null;//배열선언 //지역변수, 참조변수, 배열명
		names = new String[10];
		names[0] = "홍길동";
		names[1] = "가은";
		
		System.out.println(names[0]);
		// java.lang.ArrayIndexOutOfBoundsException 첨자값 범위가 벗어남 0~9까지 밖에없는데 10 꺼내오라고 해서 오류남
		System.out.println(names[10]);

	}

}
