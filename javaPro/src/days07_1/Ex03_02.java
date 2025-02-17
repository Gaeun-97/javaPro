/**
 * 
 */
package days07_1;

/**
 * @author user
 *	@date-2025. 2. 11.오전 11:33:35
 * @subject
 * @content
 */
public class Ex03_02 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String data = "홍길동 , 	이창익, 		서영학 , 	정창기"; 
		String regex = "\\s*,\\s*";//regex : 정규표현식을 쓸 수 있는 문자열
		String [] names = data.split(regex);
		
		for (String name : names) {
//			System.out.printf("[%s]\n",name.trim());
			System.out.printf("[%s]\n",name);
			//trim() 앞뒤 공백 제거
			
		}
	}

}
