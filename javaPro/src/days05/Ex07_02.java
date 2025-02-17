/**
 * 
 */
package days05;

/**
 * @author user
 *	@date-2025. 2. 7.오후 3:06:41
 * @subject
 * @content
 */
public class Ex07_02 {

	public static void main(String[] args) {
		//자바에서 임의의 수를 발생시키는 코딩.
		// 1)Math.random() 메서드 
		//2)Random 클래스
		
		//Math 클래스 : 수학과 관련된 기능이 구현된 클래스
//		System.out.println(Math.abs(10)); //10
//		System.out.println(Math.abs(-10)); //10
		/*
		 * //0.0 <= double < 1.0 
		 * for (int i = 0; i < 10; i++) {
		 * System.out.println(Math.random()); //임의의 값을 발생시키는 함수 } //for i
		 * 
		 */
		
		//
		
		
		//국어 0~100
		//0.0 <=Math.random()<1.0
		//0.0*101 <=Math.random()<1.0*101
		//0.0 <=Math.random()<101.0
		//0 <=(int)(Math.random())<101
		
		
		/* [로또번호 중복 문제 있다.]
		 * int lottoNumber; for (int i = 1; i <= 6; i++) {
		 * lottoNumber=(int)(Math.random()*45)+1; System.out.printf("[%d]",lottoNumber);
		 * 
		 * } //for i System.out.println();
		 */
		
		
		// 3 ~ 19 사이의 정수값 출력
		//0.0<Math.random()<1.0
		//3-3 ~19-3
		//0 ~ 16
		//0.0*17<Math.random()*17<1.0*17
		//0.0<Math.random()*17<17.0
		//0<(int)(Math.random())*17<17
		//0<(int)(Math.random())*17<=16
		//0+3<(int)(Math.random())*17<=16+3
		//3<(int)(Math.random()*17)+3<=19
		
		//그니까 저 정수값 출력하는 부분에서도 수를 바꿔서 하는 방법이 있고.
		//저 코딩하는 부분에서 바꿔서 하는 방법도 있다는거네. 생각하는 범위를 넓혀야한다는 소리구만.
		
		 
		
		
		//
		
		
		
		
		
		
		

	}//main

}
