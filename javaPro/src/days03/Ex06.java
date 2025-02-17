/**
 * 
 */
package days03;

/**
 * @author user
 *	@date-2025. 2. 5.오후 2:01:19
 * @subject
 * @content
 */
public class Ex06 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 래퍼(wrapper)클래스 - 기본형  int - > 기능이 구현된 클래스(물건, 부품, 객체, 개체)
		System.out.println(Integer.MAX_VALUE);
		String strkor = "90";
		//문자열을 변환해줘서 정수로 만들어야하는거...잖아?
		//int kor = Integer.parseInt(strkor);
		//byte -> Byte
		//byte kor= Byte.parseByte(strkor);
				
		//double -> Double
		double kor = Double.parseDouble(strkor);
		
		
		
	}

}
