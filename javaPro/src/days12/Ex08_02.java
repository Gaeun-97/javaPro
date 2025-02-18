/**
 * 
 */
package days12;

/**
 * @author user
 *	@date-2025. 2. 18.오후 5:26:33
 * @subject
 * @content
 */
public class Ex08_02 {
	
	
	public static void main(String[] args) {
		int [][][] m = new int [2][3][4];
		System.out.println(m.length);
		
		System.out.println(m[0].length);
		System.out.println(m[1].length);
		
		System.out.println(m[0][0].length);
		
		dispM(m);
		
		

		 /*        m[0]      m[1]
	       *       [0x200주소][주소]                  [0x100주소]
	       *       0x100                     m
	       *       
	       *         m[0][0]
	       *       [0x300주소][주소][주소]
	       *       0x200
	       *       
	       *       [4바이트][4바이트][4바이트][4바이트]
	       *       0x300
	       *       
	       *       178페이지 참고
	       * */
		

	}

	/**
	 * @param m
	 */
	private static void dispM(int[][][] m) {
		for (int i = 0; i < m.length; i++) {//면크기
			System.out.printf("[%d]면\n",i);
			for (int j = 0; j < m[i].length; j++) {//각 면의 향 크기
				for (int k = 0; k < m[i][j].length; k++) {
					System.out.printf("m[%d][%d][%d]=%d",i,j,k,m[i][j][k]);
				
				} //for i
				System.out.println();
			} //for j
			System.out.println();
		} //for k
		
	}

}
