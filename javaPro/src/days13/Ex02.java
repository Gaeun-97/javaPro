/**
 * 
 */
package days13;

/**
 * @author user
 *	@date-2025. 2. 19.오전 10:37:19
 * @subject
 * @content	1차원 배열의 초기화
 */
public class Ex02 {

	public static void main(String[] args) {
		
		/*
		int [] m = new int[3];
		m[0] = 1;
		m[1] = 2;
		m[2] = 3;
		*/
		
		//1차원 배열 초기화
		//int [] m =new int[] {1,2,3};
		int [] m ={1,2,3};
		dispM(m);
		
		
	

	}

	/**
	 * @param m
	 */
	private static void dispM(int[] m) {
		for (int i = 0; i < m.length; i++) {
			System.out.printf("");
		} //for i
		
	}

}
