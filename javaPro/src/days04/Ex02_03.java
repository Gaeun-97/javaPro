/**
 * 
 */
package days04;

/**
 * @author user
 *	@date-2025. 2. 6.오전 11:17:21
 * @subject [문제] 연산자
 * @content	(String[] args) -> 인덱스(index) 연산자
 */
public class Ex02_03 {

	/**
	 * @param args
	 */
	public static void main(String[] args) { //String 배열 args
			//한 학생의 국어점수를 저장할 변수를 선언,
			int kor = 0;
			
			//100명 학생의 국어점수를 저장할 변수를 선언
			
			//배열(Array) : 동일한 자료형을 메모리상에 연속적으로 놓이게 한 것(정의)
			// 	ㄴ참조형(Reference Type)
			//배열 선언 및 생성하는 형식
			//			자료형 [] 배열명;
			// new자료형 [배열크기];
			//배열 크기
			//배열명.length
			
			int [] kors; //int 배열 kors
			kors = new int[100];
			int size= kors.length;
			System.out.println(size);
			
			kors[0]=90;	
			kors[1]=67;
			
			System.out.println(kors[0]);
			System.out.println(kors[1]);
			
			/*
			 * 	heap
			 * 	배열크기에서 1을 -면 윗첨자값이 나옴
			 * 	
			 * 	[4바이트][4바이트][4바이트]......[4바이트]
			 * 	0x100번지
			 * 	시작주소
			 * 														stack
			 * 														[주소값]
			 * 														kors 변수, 참조변수,배열명
			 * 
			 * */
			
			
	}

}
