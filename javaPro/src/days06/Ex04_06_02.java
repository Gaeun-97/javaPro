/**
 * 
 */
package days06;

import java.util.OptionalInt;
import java.util.stream.IntStream;

/**
 * @author user
 *	@date-2025. 2. 10.오후 2:37:29
 * @subject
 * @content
 */
public class Ex04_06_02 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int [] m = {10, 31, 98, 38, 68, 91, 95, 76, 27, 29};
		
		OptionalInt max = IntStream.of(m).max();
		
		if (max.isPresent()) {
			System.out.println(max.getAsInt());
			
			
		} //if
		
		//[암기] 람다식과 스트링 [문제]★
		//if (max.) {
			
		} //if
	}


