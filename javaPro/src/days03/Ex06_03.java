/**
 * 
 */
package days03;

/**
 * @author user
 *	@date-2025. 2. 5.오후 2:44:20
 * @subject
 * @content /*
		 * [형 변환]
		 * 1. 자동 형변환
		 * 자동 형변환이 가능한 타입들:
				byte → short → int → long → float → double
				char → int → long → float → double
				int = 100+3D; <- double 값으로 나옴
		 * 1) 작은 자료형이 큰 형에 들어갈때는 자동..?
		 * 2)
		 * 2. 강제 형변환
		 * 
		 * */

public class Ex06_03 {


	public static void main(String[] args) {
		int i = 100;
		//long int 자동형변환
		long l = i;
		
		//+덧셈연산자, 문자열 연결 연산자
		//(3+5)*2 ()최우선 연결자
		
		//강제 형변환
		//() CAST 연산자
		int i2= (int)0L;
		//강제로 형변환 시키기 위해서는 ()안에 원하는 자료형을 넣으면 강제 형변환이 됨.

	}

}
