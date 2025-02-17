/**
 * 
 */
package days07_1;

import java.util.Scanner;

/**
 * @author user @date-2025. 2. 11.오전 10:16:03
 * @subject
 * @content
 */
public class Ex01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * boolean sw= false; double sum=0; //보이는 부분에서는 int를 사용해도 되지만, 나타내는건 실수기 때문에
		 * 
		 * //분자 부분 for (int i = 1; i <= 8; i++) { System.out.printf("%d/%d",i,i+1);
		 * 
		 * 
		 * } for (int i = 1; i <= 8; i++) { double term=(double)i/(i+1); sum+=sw?
		 * term:-term; System.out.printf((sw?"+":"-")+"%d/%d",i,i+1); sw = !sw; }
		 * System.out.printf("\b=%f\n",sum);
		 */
//	    	  for (int i = 1; i <= 8; i++) {
//	    		  System.out.printf((sw?"+":"-")+"%d/%d",i,i+1);
//	    		  sw = !sw;
//	    	  }
//	    	  System.out.printf("\b=%f\n",sum);
		// switch부분으로 하려는게
		/*-1/2+2/3-3/4+..+6/7-7/8+8/9=??? 
		 * 출력하는 코딩을 하세요. ( 반복문 사용 )*/
		// 분자 분모 +되는 거랑 -되는거

		// [문제] 1-2+3-4+5-6+7-8+9-10=-5
		// i 짝수 %d+ sum -= i
		// i 홀수 %d- sum += i
//	      int sum = 0;
//	      for (int i = 1; i <= 10; i++) {
		/*
		 * [1] System.out.printf( i%2==0?"%d+": "%d-", i); sum += i%2==0? -i: i;
		 */
		// [2]
		/*
		 * if (i%2==0) { System.out.printf("%d+", i); sum -= i; } else {
		 * System.out.printf("%d-", i); sum += i; } // if
		 */
		
		Scanner scanner = new Scanner(System.in);
		char one = 0;
		System.out.print("> 한 문자 입력?");
		scanner.next().charAt(0);
		if ('A'<= one && one <='Z') {
		System.out.println("대문자");
	}
}//main

}
