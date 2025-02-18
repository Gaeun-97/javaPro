/**
 * 
 */
package days12;

import java.util.Random;

/**
 * @author user
 *	@date-2025. 2. 18.오전 10:21:10
 * @subject 배열 섞기(카드 섞기, 화투 섞기..?)
 * @content
 */
public class Ex03 {


	public static void main(String[] args) {
		/* 각 타입의 기본형
		 * */
		int [] m = new int[10];
		for (int i = 0; i < m.length; i++) {
			
		} //for i
		
		shuffle(m);
		System.out.println();
		

	}

	/**[2]
	 *  public static void shuffle(int[] m) {
      for(int i=0; i<10; i++) {
         int[] randomPos = new Random().ints(0,10).limit(2).distinct().toArray();
         int tmp = m[randomPos[0]];
         m[randomPos[0]] = m[randomPos[1]];
         m[randomPos[1]] = tmp;
      }
	 * 
	 */
	/*[3]
	private static void shuffle(int[] m) {
		//무작위로 섞은뒤 출력?
		int idx1,idx2;
		Random rnd = new Random();
		for (int i = 0,temp; i < 10; i++) {
		idx1 = rnd.nextInt(m.length);
		idx2 = rnd.nextInt(m.length);
		if (idx1 == idx2) i--;
		else	System.out.printf("%d - %d \n", idx1,idx2);
		temp = m[idx1];
		m[idx1] = m[idx2];
		m[idx2] = temp;
		
		} //for i
		*/
		private static void shuffle(int[] m) {
			//무작위로 섞은뒤 출력?
			int idx1=0,idx2;
			Random rnd = new Random();
			for (int i = 0,temp; i < 10; i++) {
				idx1 = rnd.nextInt(m.length);
				idx2 = rnd.nextInt(m.length);
				System.out.printf("%d - %d \n", idx1,idx2);
				temp = m[idx1];
				m[idx1] = m[idx2];
				m[idx2] = temp;
				
			} //for i
			
		
		
		
	}

}
