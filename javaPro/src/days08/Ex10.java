/**
 * 
 */
package days08;

/**
 * @author user
 *	@date-2025. 2. 12.오후 4:45:30
 * @subject 두 기억공간의 값을 바꾸기
 * @content 1)Call by Name  매개변수 없이 함수이름만 호출
 						2)Call by Value 실제 값을 넘김
 						3)Call by Reference	매개변수를 참조타입으로 넘김
								클래스/ 배열/ 인터페이스 중 사용	
 */
public class Ex10 {
	public static void main(String[] args) {
		int x = 10, y = 20;
		System.out.printf(">x=%d, y=%d\n", x, y);
		swap(x,y);
		/*		swap 메서드 선언 + 호출
		{
			int temp = x;
			x = y;
			y = temp;

		}
		*/

		System.out.printf(">x=%d, y=%d\n", x, y);

	}
	private static void swap(int x, int y) {
		int temp = x;
		x = y;
		y = temp;
		
	}

	//선언
	

}
