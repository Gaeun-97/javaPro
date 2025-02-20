/**
 * 
 */
package days14;

/**
 * @author user
 *	@date-2025. 2. 20.오전 11:50:08
 * @subject
 * @content
 */
//신형 자동차 클래스 선언
public class Car {
	
	//필드(field)
	String name;	//자동차 이름
	int speed;		//속도
	int wheelCount;	//바퀴수
	
	//메서드(method)

	public void dispCarInfo() {
		System.out.printf("> 차명 : %s, 속도 : %d\n",name, speed);
	}
	

}
