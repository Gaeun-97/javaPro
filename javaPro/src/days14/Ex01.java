/**
 * 
 */
package days14;

/**
 * @author user
 *	@date-2025. 2. 20.오전 9:01:30
 * @subject
 * @content
 */
public class Ex01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int [][] m = new int[5][5];

		welk(m);


		//fillM01(m);
		//fillM02(m);
		//fillM03(m); 
		fillM04(m); 



		dispM(m);

	}

	/**
	 * @param m
	 */
	private static void welk(int[][] m) {

		//행 고정 열 증가 +1/열감소 -1 for문 (수행횟수)
		int n = 5;//수행횟수
		int row = 0, col = -1;
		int v = 1;
		int sw =1;
		while(true) {
			for (int i = 0; i < n; i++) {
				col+=sw;
				System.out.printf("가로 %d,%d\n", row,col );
				m[row][col]=v++;


			} //for i
			if( n == 0 ) break;
			n--;//수행횟수 1감소
			//열고정 행증가/ 행 감소 for문

			for (int i = 0; i < n; i++) {
				row+=sw;
				m[row][col]=v++;


			} //for i
			sw = -sw;
		}

	}

	/**
	 * @param m
	 */
	private static void fillM04(int[][] m) {
		/*
	       0열 1열 2열 3열 4열
	   0행 [ 5][10][15][20][25]
	   1행 [ 4][ 9][14][19][24]
	   2행 [ 3][ 8][13][18][23]
	   3행 [ 2][ 7][12][17][22]
	   4행 [ 1][ 6][11][16][21]
		 */
		/*
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				m[i][j]=5-i+j*5;
			} //for j
		} //for i*/
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				m[4-j][i]=5*i+j+1;
			} //for j
		} //for i


	}

	private static void fillM03(int[][] m) {
		/*
		 * [ 0열][ 1열][ 2열][ 3열][ 4열]
			[0행][ 1][ 2][ 3][ 4][ 5]
			[1행][10][ 9][ 8][ 7][ 6]
			[2행][11][12][13][14][15]
			[3행][20][19][18][17][16]
			[4행][21][22][23][24][25]

		 * */
		// [1] 값 
		/*
	      for (int i = 0; i < m.length; i++) {           // 행크기          
	         for (int j = 0; j < m[i].length; j++) {    // 열크기 
	            m[i][j] = i%2==0 ?5*i+j+1:5*(i+1)-j; 
	         } // for j
	      } // for i
		 */

		// [2] 방(요소)
		for (int i = 0; i < m.length; i++) {           // 행크기          
			for (int j = 0; j < m[i].length; j++) {    // 열크기 
				m[i][i%2==0?j:4-j] =  5*i+j+1; 
			} // for j
		} // for i
	}







	private static void fillM02(int[][] m) {
		/*
		 * i=0 j=01234
		 * i=1 j=01234
		 * i=2 j=01234
		 * i=3 j=01234
		 * i=4 j=01234
		 * 
		 * [ 0열][ 1열][ 2열][ 3열][ 4열]
			[0행][25][24][23][22][21]
			[1행][20][19][18][17][16]
			[2행][15][14][13][12][11]
			[3행][10][ 9][ 8][ 7][ 6]
			[4행][ 5][ 4][ 3][ 2][ 1]

		 */
		/* [1]
		      for (int i = 0, v = 25; i < m.length; i++) {           // 행크기          
		         for (int j = 0; j < m[i].length; j++, v--) {    // 열크기
		            // m[i][j]=v;
		            m[i][j] = (m.length*m[i].length) - ( m[i].length*i + j );
		         } // for j
		      } // for i
		 */

		// [2]
		/* 0 0  4 4
		 * 0 1  4 3
		 * 0 2  4 2
		 * 0 3  4 1
		 * 0 4  4 0
		 * 
		 * 1 0  3 4
		 * 1 1  3 3
		 * 1 2  3 2
		 * 1 3  3 1
		 * 1 4  3 0 
		 * */ 
		for (int i = 0; i < m.length; i++) {           // 행크기          
			for (int j = 0; j < m[i].length; j++) {    // 열크기
				m[4-i][4-j] = 5*i+j+1;
			} // for j
		} // for i
	}
	private static void fillM01(int[][] m) {
		/*for (int i = 0,v=1; i < m.length; i++) {

			for (int j = 0; j < m[i].length; j++,v++) {
			m[i][j] = v;
			} //for j

		} //for i*/
		for (int i = 0,v=1; i < m.length; i++) {

			for (int j = 0; j < m[i].length; j++,v++) {
				m[i][j]=5*i+j+1;
			} //for j

		} //for i

	}

	/**
	 * @param m
	 */
	private static void dispM(int[][] m) {
		System.out.println("[ 0열][ 1열][ 2열][ 3열][ 4열]");
		for (int i = 0; i < m.length; i++) {
			System.out.printf("[%d행]", i);
			for (int j = 0; j < m[i].length; j++) {
				System.out.printf("[%2d]",m[i][j]);
			} //for j
			System.out.println();
		} //for i


	}

}
