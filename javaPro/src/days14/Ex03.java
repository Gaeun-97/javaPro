/**
 * 
 */
package days14;

/**
 * @author user
 *	@date-2025. 2. 20.오후 12:05:57
 * @subject
 * @content
 */
public class Ex03 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// s = new System(); //접근지정자가  the constructor System() is not visible
		//  m :  지역변수, 참조변수, 배열명
		int [] m;
		//변수 선언 형식
		//자료형 변수명[=초기값];
		//myCar : 변수, 참조변수
		Car myCar;
		myCar = new Car();
		//클래스? 객체의 설계도			Car
		//객체 ? 클래스로 선언된 참조변수	myCar
		//인스턴스 ? new 연산자 클래스의 객체가 실제 힙 영역에 생성된 것
		//문제]  클래스 || 객체 || 인스턴스화 하는 코딩 작성
		 myCar.name= "k9";
		 myCar.dispCarInfo();
		 
		 // = new Car() 인스턴스화 되어있지 않기때문에

	}//main

}//class
