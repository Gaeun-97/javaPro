/**
 * 
 */
package days06;

/**
 * @author user
 *	@date-2025. 2. 10.오전 11:10:32
 * @subject
 * @content
 */
public class Ex03 {


	public static void main(String[] args) {
//		int sum = 0;
//		//[for] 1~10=55
//		for (int i = 0; i <= 10; i++) {
//			if (i%2 != 0) {
//				System.out.printf("%d+", i);
//				sum+=i;
//			} //if
		
//			int sum = 0;
//			//[for] 1~10=55
//			for (int i = 0; i <= 10; i++) {
//					if (i%2 == 0) continue;
//					//continue문을 만나면 다시 처음으로 돌아감
//					System.out.printf("%d+", i);
//					sum+=i;
//			}
		
		//[while] 1~10=55 1+3+5+7+9+=25 홀수의 합
		//+continue
		
			int sum = 0;
			int i = 1;
			while (i<=10) {
//				if (i%2!=0) {
//					System.out.printf("%d+", i);
//					sum+=i;
//				} //if
//				i++;
//			
				if (i%2==0) {
					i++;
					continue;
				}
				System.out.printf("%d+", i);
				sum+=i;
				i++;
			}//while
		System.out.printf("=%d",sum);

	}

}
