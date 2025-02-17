/**
 * 
 */
package days02;

/**
 * @author user
 *	@date-2025. 2. 4.오후 2:49:39
 * @subject
 * @content
 */
public class Ex05_03 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		double avg = 78.96844;
		System.out.printf("평균 = %f\n", avg);
		System.out.printf("평균 = %e\n", avg);
		System.out.printf("평균 = 10.2f\n", avg);
		System.out.printf("평균 = []\n", avg);
		
			//자동 반올림
		
		
		
		// TODO Auto-generated method stub
		//%[argument_index$][flags][width]conversion
		String name= "admin";
		int age =20;
		
		System.out.printf("[%s]\n",name);
		System.out.printf("[%10s]\n",name); //10칸 우
		System.out.printf("[%-10s]\n",name);		//10칸 좌
		System.out.printf("[%04d]\n", age);
		System.out.printf("%d", age);
		System.out.printf("%d", age);
		
		int money = 12573000;
		//					12,573,000 출력
		System.out.printf("[%,d]\n", money);
		System.out.printf("[%(d]\n", 30);
		System.out.printf("[%,d]\n", -30);
		
		//System.out.println("-",repeat(50));
		//10
		System.out.printf("[%d]\n", 10);
		//
		System.out.printf("[%o]\n", 10);
		
		System.out.printf("[%1$#x][%$#", 10);
		
		

	}

}
