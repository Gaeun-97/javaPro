/**
 * 
 */
package days13;

import java.util.Arrays;

/**
 * @author user
 *	@date-2025. 2. 19.오후 4:06:04
 * @subject
 * @content
 */
public class Ex08_02 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//      4행 3열  2차원 배열 m
      int [][] m = {
                     {1,2,3},
                     {4,5,6},
                     {7,8,9},
                     {10,11,12}
               };

      // 1차원 배열 n
      //m.length = 4
      //m[0].length = 3
      int [] n = new int[m.length * m[0].length];
      
      
      // 2차원 배열 m 을  1차원 배열 n으로 변환시켜서 배열 n을 출력.
      int cloLength = m[0].length;
      for (int i = 0; i < m.length; i++) {
    	  for (int j = 0; j < m[i].length; j++) {
			n[i*m[0].length]= m[i][j];
			} //for j
      }
    	
		

      for (int i = 0; i < n.length; i++) {
			
			
      

	}

	}
}
