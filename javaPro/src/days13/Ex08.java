/**
 * 
 */
package days13;

import java.util.Arrays;

/**
 * @author user
 *	@date-2025. 2. 19.오후 3:32:19
 * @subject
 * @content
 */
public class Ex08 {

	public static void main(String[] args) {
		
		//1차원 배열
		int [] m = {1,2,3,4,5,6,7,8};
		
		
		//2차원 배열
		
		//1차원 배열 -> 2차원 배열
		int [][] n = new int[2][4];
		
		int comLenght = n[0].length;
		for (int i = 0; i < m.length; i++) {//
			n[i/comLenght][i%comLenght] = m[i];
		} //for i
		
		
		//코딩
		//Arrays.toString(null);//2차원 배열 n 출력
		System.out.println(Arrays.toString(n[0]));
		System.out.println(Arrays.toString(n[1]));

//		for (int i = 0; i < n.length; i++) {
//			System.out.println(Arrays.toString(n[]));
//			
//		} //for i
		

	}//main

}//class
