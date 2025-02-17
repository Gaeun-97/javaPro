/**
 * 
 */
package days08;

import java.util.Arrays;

/**
 * @author user
 *	@date-2025. 2. 12.오후 3:13:16
 * @subject
 * @content
 */
public class Ex07 {

	public static void main(String[] args) {
		int [] lotto = new int[6];
		
		fillLotto(lotto); //채워넣는 메소드
		dispLotto(lotto); //출력하는 메소드
		
		/*		중복/채워/출력
	       
	     
	      */
	}
	//문제
	// (int)( Math.random()*45)+1;
	private static void fillLotto(int[] lotto) {
		 int index = 0, n;
	     lotto[index++] =getRandomInteger(1,45);
	     while ( index <= 5 ) {
	         n =  getRandomInteger(1,45);
	               if(!isDuplicateLotto(lotto, n, index) ) lotto[index++] = n;// 배열, 찾을값,찾을 위치값
	            }
	}
//함수들 기억해두기
	private static boolean isDuplicateLotto(int[] lotto, int n, int index) {
	     boolean flag = false;
         for (int i = 0; i < index; i++) {
            if( lotto[i] == n ) {
               System.out.println("*");
               flag = true;
               break;
            }
         }
		return flag;
	}
//문제★
	public static int getRandomInteger(int min, int max) {
	
		return  (int)( Math.random()*(max-min+1))+min; //★
	}

	private static void dispLotto(int[] lotto) {
			System.out.print("1게임: ");
		for (int i = 0; i < lotto.length; i++) {
		
			System.out.printf("[%d]",lotto[i]);
		} //for i
		System.out.println();
		
	}

}
