/**
 * 
 */
package days05;

/**
 * @author user
 *	@date-2025. 2. 7.오전 10:43:30
 * @subject
 * @content
 */
public class Ex03 {

	
	public static void main(String[] args) {
		
		String name = "홍길동";
		int sum=0;
		for (int i = 0; i <= 10; i++) {
			System.out.printf("%d+",i);
			sum +=i; //sum =sum+i;
		}
		System.out.printf("=%d",sum);
		//[문제] 1+2+3+....+9+10=55(for문)
		/*
		 * for (i = 0; i <= 10; i++) { System.out.println(i);
		 * 
		 * } //for i
		 */		
//		System.out.println(">>빠져나올때의  i = "+i);
		
	}

}
