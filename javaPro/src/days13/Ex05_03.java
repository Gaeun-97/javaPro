/**
 * 
 */
package days13;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author user
 *	@date-2025. 2. 19.오후 2:23:13
 * @subject
 * @content
 */
public class Ex05_03 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		  // 30개      0~20 정수
	      int [] m = { 0, 2, 12, 16, 7, 9, 2, 9, 0, 13, 7, 13, 3, 14, 10
	            , 15, 11, 6, 19, 5, 2, 0, 16, 18, 15, 18, 0, 9, 13, 16 };
	      
	      Scanner scanner = new Scanner(System.in);
	      System.out.print("> 배열에서 찾을 정수 입력 ? ");
	      int n = scanner.nextInt(); // 12
	       
	      int [] indexArr = sequenceSearch(m, n);
	      
	      System.out.println( Arrays.toString(indexArr) ); 

	   } // main
	   
	   // [4] *** 
	   private static int[] sequenceSearch(int[] m, int n) {
	      int [] temp = null; // 30   
	      int index = 0; 
	      for (int i = 0; i < m.length; i++) {
	         if( m[i] == n ) {
	        	 temp = (temp == null)? new int[1]:Arrays.copyOf(temp,temp.length+1);
	        	 temp[temp.length-1] = i;

	         }
	      } // for i 
	      
	      return  temp;
	   }
	   
	    


	}


