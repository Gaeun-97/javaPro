/**
 * 
 */
package days14;

/**
 * @author user
 *	@date-2025. 2. 20.오전 9:23:08
 * @subject
 * @content
 */
public class Ex01_02 {
	public static void main(String[] args) throws InterruptedException {

		int [][] m = new int[5][5];

		//welk(m);
		magicSquare(m);

		//fillM01(m);
		//fillM02(m);
		//fillM03(m); 
		//fillM04(m); 



		dispM(m);

	}

	/**
	 * @param m
	 * @throws InterruptedException 
	 */
	private static void magicSquare(int[][] m) throws InterruptedException {
		//열 증가 행 감소
		//1 숫자의 위치
		int v = 1;
		int row, col;
		int nextRow, nextCol;
		row = 0;
		col = m[0].length/2;
		m[row][col]=1;
		
		while (v<=m.length*m[0].length) {
			Thread.sleep(1000);
			dispM(m);
			
			//열 증가 행 감소
			nextCol = col + 1 ;
			nextRow = row - 1;
			
			//헹 벗어난 경우 row=0 감소 row =-1
			if (nextRow == -1)nextRow = m.length-1;
			//열 벗어난 경우
			if (nextRow == m[0].length)nextCol = 0;
			//그 다음 위치에 값이 있는 경우
			if(m[nextRow][nextCol] !=0) {
				nextRow = row + 1;
				nextCol =col;
			}//if
			
			
			row = nextRow;
			col = nextCol;
			m[row][col] = v++;
			
			
		}//while
		


	}

	/**
	 * @param m
	 */
	private static void welk(int[][] m) {

		//행 고정 열 증가 +1/열감소 -1 for문 (수행횟수)
		int n = 5;//수행횟수
		int row = 0, col = 0;
		int v = 1;
		int sw =1;
		while(true) {
			for (int i = 0; i < n; i++) {
				col+=sw;
				m[row][col]=v++;


			} //for i

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

	}//main

}
