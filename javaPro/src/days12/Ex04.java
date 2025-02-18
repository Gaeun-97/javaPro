/**
 * 
 */
package days12;

import java.util.Arrays;

/**
 * @author user
 *	@date-2025. 2. 18.오전 10:42:45
 * @subject
 * @content
 */
public class Ex04 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * [정렬 (sort)]
		 *-특정 기준에 맞게 데이터를 열거하는 알고리즘
		 *-오름차순 정렬 ASC(Ascending Sort)
		 *-내림차순 정렬 Desc
		 * */

		//a>b 자리바꿈
		int [] m = {3,5,2,4,1};

		System.out.println(Arrays.toString(m));
		//bubbleSort(m);
		//selectionSort(m);
		//selectionSort2(m);
		insertionSort(m);
		System.out.println(Arrays.toString(m));

	}//main
	/*      0 1 2 3 4  index
	 *       3 5 2 4 1  value
	 * 
	 * (0,1) (1,2) (2,3) (3,4)   1회전  0    4
	 * (0,1) (1,2) (2,3)         2회전  1    3
	 * (0,1) (1,2)               3회전  2    2
	 * (0,1)                     4회전  3    1
	 */

	
	private static void insertionSort(int[] m) {
		/*
		 * 	 ↓		
//		 * 
//		 * 0 1 2 3 4  index;
//		 * 1 2 3 4 5 value;
		 * 두번째 위치부터 시작해서 왼쪽의 값들과 비교해서 삽입될 위치를 지정한 후, 
		 * 두 번째 위치! 
				
		 * 뒤로 값을 밀고 삽입될 위치에 값을 삽입해서 정렬하는 방법. m.length+1
		 * 
		 * 작은 값을 찾는 검색 과정이 필요없다.
		 * */
		
		
		
		
		int key;
		

		for (int i = 1; i < m.length; i++) {
			System.out.printf("%d - ",i);
			key = m[i];
			for (int j = i-1; j >=0 && m[j]>key; j--) {
				if(m[j]<= key)break;
				m[j+1] = m[j];
			
			} //for j
			m[++i] = key;
			System.out.println(Arrays.toString(m));
			} //for i
		
		}//class





//	private static void selectionSort2(int[] m) {
//		/*
//		 * ↓		minIndex
//		 * 
//		 * 0 1 2 3 4  index;
//		 * 1 2 3 4 5 value;
//		 *
//		 * */
//		for (int i = 0,minIndex; i < m.length-1; i++) {
//			minIndex = i;
//			for (int j = i+1; j < m.length; j++) {
//				if (m[minIndex]>m[j]) {
//				minIndex = j;
//				
//				} //if
//				 if (i != minIndex) {
//			            int temp = m[i];
//			            m[i] = m[minIndex];
//			            m[minIndex] = temp;
//			} //for j
//			
//		} //for i
//		
//		
//		
//		}
//}


/**
 * 3 5 2 4 1 
 * 01 02 03 04
 * 12 13 14
 * 23 24 
 * 34
 */
/*
	private static void selectionSort(int[] m) {
	for (int i = 0; i < 4; i++) {
		for (int j = i+1; j <= 4; j++) {
			System.out.printf("%d-d",i,j);
			if (m[i] > m[j]) {
				System.out.print(" *** ");
				int temp = m[i];
				m[i] =m[j];
				m[j] = temp;

			} 
			System.out.println(Arrays.toString(m));
        } // for j
        System.out.println();
     } // for i
			} //if

 */



 /*      0 1 2 3 4  index
       *       3 5 2 4 1  value
       * 
       * (0,1) (1,2) (2,3) (3,4)   1회전  0    4
       * (0,1) (1,2) (2,3)         2회전  1    3
       * (0,1) (1,2)               3회전  2    2
       * (0,1)                     4회전  3    1
  
	private static void bubbleSort(int[] m) {
		for (int i = 0; i <4; i++) {
			for (int j = 0; j <4-i; j++) {
				System.out.printf("(%d,%d)",j,j+1);
				if (m[j] > m[j+1]) {
					System.out.print(" *** ");
					int temp = m[j];
					m[j] =m[j+1];
					m[j+1] = temp;

				} //if
				 System.out.println(Arrays.toString(m));

			} //for j
		} //for i

 */


}//class


