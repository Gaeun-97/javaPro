/**
 * 
 */
package days10;

import java.util.Arrays;

/**
 * @author user
 *	@date-2025. 2. 14.오후 4:31:51
 * @subject
 * @content
 */
public class Ex04_04 {

	public static void main(String[] args) {

		// 배열 -> 더 큰 배열 복사
		int [] m = {1,2,3};
//		int  [] temp = new int [m.length+3];
		/*for (int i = 0; i < m.length; i++) {
			temp[i]=m[i];

		} //for i
		*/


		//[2]System.arraycopy()
		//	System.arraycopy(m, 0, temp, 0, m.length);

		//[3]Arrays.copyOf(m, m.length);

		int [] temp = Arrays.copyOf(m, m.length+3);
		
		System.out.println(Arrays.toString(m));
		System.out.println(Arrays.toString(temp));
	}

}
