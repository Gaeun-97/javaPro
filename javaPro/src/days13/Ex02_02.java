/**
 * 
 */
package days13;

import java.util.Iterator;

/**
 * @author user
 *	@date-2025. 2. 19.오전 10:38:31
 * @subject
 * @content 2차원 배열의 초기화
 */
public class Ex02_02 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		/*int [][] m = new int [2][4];
		m[0][0] = 1;m[0][1] = 2;m[0][2] = 3;
		m[1][0] = 4;m[1][1] = 5;m[1][2] = 6;*/
	

		
		/*int [][] m = new int [][] {
			{1,2,3,4},
			{5,6,7,8}
		};*/
		int [][] m =  {
			{1,2,3,4},
			{5,6,7,8}};
		dispM(m);
		
		}

	/**
	 * @param m
	 */
	private static void dispM(int[][] m) {
		for (int i = 0; i < m.length; i++) {//행크기
			for (int j = 0; j < m[i].length; j++) {//열크기
				System.out.printf("m[%d][%d]=[%d]",i,j,m[i][j]);
			} //for j
		} //for ior 
		
	}

}
