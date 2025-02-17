/**
 * 
 */
package days03;

/**
 * @author user
 *	@date-2025. 2. 5.오후 4:06:34
 * @subject
 * @content
 */
public class Ex07_04 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		/*
		 * 1. 일반 논리 연산자
		 * 	1) ! NOT연산자  부정 연산자
		 * 	2) &&  일반 논리 AND 연산자 ( 논리곱 )
		 * 		true && true => true
		 * 		true && false => false
		 * 		false && true => false
		 * 		false && false => false
		 * 	3) || 일반 논리 OR 연산자 ( 논리합 )
		 * 		true || true => true
		 * 		false || true => true
		 * 		true || false=> true
		 * 		false || false => false
		 * 
		 * 	연산자 우선 순위 : ! > &&
		 * 		
		 * 
		 * 2. 비트 논리 연산자
		 * 	1) ~	 	비트 부정 연산자 또는 틸트 연산자
		 * 	2) &	 	비트 논리  AND 연산자
		 * 	3) |		비트 논리 OR 연산자
		 * 	4) ^		e[X]clusive OR 연산자, XOR 연산자
		 * 										배타적인
		 * 
		 * 논리 연산자의 우선순위 만큼은 기억하기
		 * 	~ 		> 		& 		>		^		> 		 |		>	      &&		 >		||
		 * 
		 * */
		System.out.println(10&3); //2
		//		0000  1010
		//&		0000	0011
		//
		//System.out.println(10);
		//System.out.println(~10);
		//								0000 1010
		//								1111 0101
		//												1
		//								1111 0100
		//								0000 1011	
		//							=- 11
		System.out.println(!true);
		System.out.println(!false);
		
		//System.out.println(3>5 && 5>7);
		/*
		 * 앞에꺼가 false 나오면 더 이상 계산하지 않음
		 * false && 효율적 연산 (short circuit evaluation)
		 */
		System.out.println(!(5 > 3));//!은 비교연산자보다 먼저 계산됨,  true/false값 앞에만 사용 가능(boolean)
		//System.out.println(13>5||5<7);
		
		

	}

}
