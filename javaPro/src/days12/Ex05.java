package days12;

import java.util.Arrays;
import java.util.Random;
import java.util.function.IntSupplier;
import java.util.stream.IntStream;

/**
 * @author 
 * @date 2025. 2. 18. - 오후 2:35:10
 * @subject 배열 선언 * int 100    0~9 임의의 정수 채워넣고 
 * @content 0 11개
 *          1 3개
 *          2 20개
 *          :
 *          9 15개
 */
public class Ex05 {

	public static void main(String[] args) {
		/* [1]
      int [] m = new int[100];
      Random rnd = new Random();
      for (int i = 0; i < m.length; i++) {
         m[i] = rnd.nextInt(10);
      } // for i
		 */


		// [3]
		/*
      int [] m = new int[100];
      Random rnd = new Random();

      /*
      m = IntStream.generate(new IntSupplier() {         
         @Override
         public int getAsInt() {
            return rnd.nextInt(10);
         }
      }).limit(100).toArray();

      //                       -> 람다연산자를 사용한 수식 : 람다식
      m = IntStream.generate(()-> rnd.nextInt(10)).limit(100).toArray();
		 */

		// [2]
		int [] m =  new Random().ints(0,10).limit(100).toArray();
		System.out.println(Arrays.toString(m));

		int [] countArr = new int[10];
		for (int i = 0; i <m.length ; i++) {
			countArr[m[i]]++;


		} //for i
		System.out.println(Arrays.toString(countArr));
		
		//[2]
	} // main

} // class









