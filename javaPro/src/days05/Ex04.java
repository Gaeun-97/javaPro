/**
 * 
 */
package days05;

/**
 * @author user
 *	@date-2025. 2. 7.오전 11:08:18
 * @subject 	조건 반복문  while 문
 * @content
 */
public class Ex04 {


	public static void main(String[] args) {
		//[for문] 1~10=55
		//int sum=0;
//		for (int i = 0; i <= 10; i++) {
//			System.out.printf("%d+",i);
//				sum+=i;
//			
//		} //for i
		
//int i;
		//		[while문] 
//				ㄴ조건반복문 : 조건이 참일동안 {}( while문) 블럭을 실행하는 반복문
//		while (condition) {
//			//조건 해당 안하면 넘어감
//		} //while
//		do {
//			//한번은 꼭 실행하고 넘어감
//		} while (condition);
//		
			int i=1;
			int sum = 0;
//		while (i++<=3) {
			while (++i<=10) {//
			
			System.out.printf("%d+",i);
			sum +=i; //2+3=5
			//i++;
			//++i;
			
		}
		System.out.printf("=%d\n",sum);

	}

}
