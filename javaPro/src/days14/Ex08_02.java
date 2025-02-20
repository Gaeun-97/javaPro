/**
 * 
 */
package days14;

/**
 * @author user
 *	@date-2025. 2. 20.오후 3:31:29
 * @subject	클래스(객체) 배열
 * @content		ㄴ
 */
public class Ex08_02 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//클래스(객체) 배열 선언 ★★★★★★★
		//[배열 선언 형식]
		//자료형 [] 배열명 = new 자료형[배열크기]
		Person [] pArr = new Person[5];
		
		for (int i = 0; i < pArr.length; i++) {
			pArr[i] = new Person();
			
		} //for i

		
		//5명의 사람 Person
		//java.lang.NullPointerException
		pArr[0].name = "구구";
		
		pArr[1].name = "가가";
		
		pArr[2].name = "구가";
		
		pArr[3].name = "가가구";
		
		pArr[4].name = "구가구가";
		
		for (int i = 0; i < pArr.length; i++) {
			pArr[i].work();
			
		} //for i

	}

}
