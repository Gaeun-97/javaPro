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
/* 잘 기억해두기
 *  heap                        stack
 *                             
 *                              main(){
 *                                [10] [20]
 *                                 x    y      지역변수
 *  m[0] m[1]                             
 *  [10][20]                          [ 0x100 ] 
 *  0x100                              m  배열선언
 *                              }
 *                              
 *                              swap(int [] m){
 *                                 [0x100]
 *                                 m
 *                              }
 * */ 

public class Ex10_02 {
	public static void main(String[] args) {
		int x = 10, y = 20;
		int [] m = { x, y};
		System.out.printf(">x=%d, y=%d\n", m[0], m[1]);
		swap(m);

		System.out.printf(">x=%d, y=%d\n", m[0], m[1]);

	}

	private static void swap(int[] m) {
		System.out.printf(">x=%d, y=%d\n", m[0], m[1]);
		int temp = m[0];
		m[0] = m[1];
		m[1] = temp;
		System.out.printf(">x=%d, y=%d\n",m[0], m[1]);
		
	}
	private static void swap(int x, int y) {
		System.out.printf(">x=%d, y=%d\n", x,y);
		int temp = x;
		x = y;
		y = temp;
		System.out.printf(">x=%d, y=%d\n", x,y);
	}

	//선언
	

}
