/**
 * 
 */
package days03;

/**
 * @author user @date-2025. 2. 5.오전 10:47:34
 * @subject
 * @content
 */
public class Ex03 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// [시험] 두 기억공간의 값을 바꾸는 작업 ★★★★★
		int x = 10, y = 20;
		System.out.printf(">x=%d, y=%d\n", x, y);

		
		/*
		 * y=x; x=y;
		 * y=x; x=x+y; 
		 */
		
			/*
			 * y=x; x=y+10; 처리순서 + 다른 값 지정 1. x값을 temp에 넣기 2. x에 y값 읽어오기 3. y에 temp값 읽기
			 */
		  
		  {
			  int temp = x;
			  x = y;
			  y = temp;
			  
		  }
		 
		System.out.printf(">x=%d, y=%d\n", x, y);

	}

}
