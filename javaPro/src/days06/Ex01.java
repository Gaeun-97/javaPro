/**
 * 
 */
package days06;

import java.util.Arrays;

/**
 * @author user
 *	@date-2025. 2. 10.오전 9:32:11
 * @subject
 * @content
 */
public class Ex01 {

	public static void main(String[] args) {
//		for (int i = 1; i <=6 ; i++) {
//			int n=(int)(Math.random()*45)+1;
//			System.out.println(n);
//		} //for i 
		
		//[풀이] 중복 제거 후 로또 번호 6개 출력
		// 내일 문제로 나옴.
//		int lotto1, lotto2 , lotto3 , lotto4 , lotto5 , lotto6;
//		int n;
//		n = (int)(Math.random()*45)+1;
//		lotto1 = n;
//		 n =  (int)( Math.random()*45)+1;
//	      if( lotto1 == n ) {
//	         n =  (int)( Math.random()*45)+1;
//	         if (lotto1 == n) {
//	            n =  (int)( Math.random()*45)+1;
//	            if (lotto1 == n) {
//	               n =  (int)( Math.random()*45)+1;
//	               if (lotto1 == n) {
//	                  n =  (int)( Math.random()*45)+1;
//	                  if (lotto1 == n) {
//	                     
//	                  } else {
//	                     lotto2 = n;
//	                  } // if
//	               } else {
//	                  lotto2 = n;
//	               } // if
//	            } else {
//	               lotto2 = n;
//	            } // if
//	         } else {
//	            lotto2 = n;
//	         } // if
//	      }else {
//	         lotto2 = n;
//	      }
//
		//[문제] ★
			int index=0, n;
			int [] lotto = new int[6];
			lotto[index++] = (int)(Math.random()*45)+1;
			
			while (index<=5) {
				n = (int)(Math.random()*45)+1;
				//중복o					//중복x
				//그 이전에 발생한 로또 번호와 n 값과 모두 체크해서
				//중복이 되지 않으면
				boolean flag = false;
				
				for (int i = 0; i < index; i++) {
					if (lotto[i]==n) {
						System.out.println("*");
						flag=true;
						break;
						
					} //if
					
				} //for i
				if(!flag);lotto[index++] = n;	
			}
		
			
			System.out.println(Arrays.toString(lotto));

	}

}
