/**
 * 
 */
package days13;

/**
 * @author user
 *	@date-2025. 2. 19.오전 11:12:48
 * @subject 가변 배열...
 * @content
 */
public class Ex03 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 1반에 30명 학생 성적 처리
		int [][] m = new int [3][];
		m[0] = new int [25];
		m[1] = new int [28];
		m[2] = new int [20];
		
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
		} //for i 
		
	}

}
