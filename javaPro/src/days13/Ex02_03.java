/**
 * 
 */
package days13;

/**
 * @author user
 *	@date-2025. 2. 19.오전 10:38:31
 * @subject
 * @content	3차원 배열의 초기화
 */
public class Ex02_03 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//int [][][] m = new int[2][3][4];
		
		
		int [][][] m = {
				{
					{1,2,3,4},
					{5,6,7,8},
					{9,10,11,12}},
				{
					{1,2,3,4},
					{5,6,7,8},
					{9,10,11,12}}
		};
		dispM(m);

	}

	/**
	 * 면 / 행 / 열
	 * 
	 */
	private static void dispM(int[][][] m) {
		for (int i = 0; i < m.length; i++) {
			System.out.printf("[%d]면\n",i);
			for (int j = 0; j < m[i].length; j++) {
				for (int k = 0; k < m[i][j].length; k++) {
					System.out.printf("m[%d][%d][%d]=%d",i,j,m[i][j]);
					
					
				} //for k
			} //for j
		} //for i
		
	}

}
