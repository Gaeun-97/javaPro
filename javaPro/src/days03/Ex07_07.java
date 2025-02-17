/**
 * 
 */
package days03;

/**
 * @author user
 *	@date-2025. 2. 5.오후 5:06:38
 * @subject
 * @content
 */
public class Ex07_07 {
	
		
	

	public static void main(String[] args) {
//		System.out.println(+3);
//		System.out.println(-3);
		
			//instanceof 연산자 : 클래스 수업 x
			
			//[증감 연산자  ++ --]
			//[문제] 어떤 기억공간의 값을 1증가 시키는 코딩을 하세요..
		//[문제] 어떤 기억공간의 값을 1감소 시키는 코딩을 하세요..
		int x =10;
			//	x	=	11;
			//	1	)	x	=	x	+	1;								x = x-1;
			//	2	)	x 	+=	1;									x -=1; 후위형:증가되기전에 먼저 대입됨
			// x++;  x--; 이건 1증가 1감소만 됨.
			//++x; --x;  단독으로 증감연산자를 사용할때는 전위형이든 후위형이든 상관없다  전위형
			//하지만 대입 연산자와 같이 쓸때는 오류남
		System.out.println(x);
		//int y =x++;
		int y = x++;
		System.out.printf("> x=%d, y=%d\n", x , y);
		//내일은 제어문....
	}

}
