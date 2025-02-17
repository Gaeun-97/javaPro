/**
 * 
 */
package days08;

/**
 * @author user
 *	@date-2025. 2. 12.오후 12:09:19
 * @subject
 * @content
 */
public class Ex04_02 {
	public static void main(String[] args) {
		//System.out.println("-------------------"); //50줄 코딩 (가정)
			drawLine(50, "*");//메소드 호출
		System.out.println("	부서명	:	사원명	");
		//System.out.println("-------------------"); //50줄 코딩 (가정)
		drawLine(10);
		System.out.println("	부서명	:	사원명	");
		System.out.println("	부서명	:	사원명	");
		System.out.println("	부서명	:	사원명	");
		System.out.println("	부서명	:	사원명	");
		//System.out.println("-------------------"); //50줄 코딩 (가정)
		drawLine();
		

	}//main
	
	//메소드 오버로딩
	//메소드 선언
	//중복 함수 조건? 매개변수 타입 달라야하고, 갯수도 달라야 한다.
	//1)기능(일)	 : 라인(선)을 긋는 메소드 예)drawLine
	//2)매개변수 : X
	//3)리턴값 	 : void
	//호출해야지 일함.
	public static void drawLine() {
		System.out.println("-------------------"); //50줄 코딩 (가정)
	}
//	public static int drawLine() {
//		System.out.println("-------------------"); //50줄 코딩 (가정)
//		return 0;
//	}//리턴자료형은 중복함수 조건에 해당되지 않음
	public static void drawLine(int length) {
		for (int i = 1; i < length; i++) {
			System.out.print("=");
			
		} //for i
	}
		public static void drawLine(int length,String style) {
			for (int i = 1; i < length; i++) {
				System.out.print(style);
				
			} //for i
		System.out.println("-------------------"); //50줄 코딩 (가정)
	}//메소드 오버로딩(동일한 메소드 명으로 중복 선언)(중복함수)
		
		//패키지명
		//com.util.Graphic2D.java
	
}//class
