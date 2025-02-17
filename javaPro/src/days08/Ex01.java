/**
 * 
 */
package days08;

import java.io.IOException;
import java.util.Scanner;

/**
 * @author user
 *	@date-2025. 2. 12.오전 9:02:18
 * @subject
 * @content
 */
public class Ex01 {
	public static void main(String[] args)  {
			//[정보처리기사 실기]
			//1+2+4+7+11+16+22+29+...??=???
			//i<=100 반복횟수 모를때는  while문 사용
		int sum =0;
		int term = 1; // 1+ 부터니까
		int inc = 1;
		while (term<=100) {
			sum+=term;
			System.out.printf("%d+",term);
			term += inc++;//term값에다가 1씩 증가 시켜야하니까
		}
		System.out.printf("=%d",sum);
		
		
//		//(1*1)+(1*2)+(1*4)+()+()+()+()+()+()+
//		int i= 1,sum=0;
//		while (i<=100) {
//			System.out.printf("(%d*%d)+", i,i*2);
//			
//			sum += i;
//			i++;
//		}
//		System.out.printf("=%d",sum);

			} //main
	}//class


