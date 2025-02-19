/**
 * 
 */
package days13;

import java.util.Scanner;

/**
 * @author user
 *	@date-2025. 2. 19.오후 12:14:43
 * @subject	검색(search)
 * @content		ㄴ 항목의 집합중에 특정 항목을 찾아내는 것.
 * 				1) 순차 검색(Sequence Search)
 * 				2) 이진 검색(Binary Search)
 */
public class Ex05 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//	0~20 정수
		int [] m = { 0, 2, 12, 16, 7, 9, 2, 9, 0, 13, 7, 13, 3, 14, 10
	            , 15, 11, 6, 19, 5, 2, 0, 16, 18, 15, 18, 0, 9, 13, 16 };
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("> 배열에서 찾을 정수 입력? ");
		int n = scanner.nextInt();
		
		
		//만약 찾는 값이 배열 속에 없다면 -1 반환
		int index = sequenceSearch(m,n);
		//index 부분이 2차원 배열이 되어야 하는거..아닌가?
		
		if (index != -1) {
			System.out.printf("찾는 정수 %d는 %d 위치에 있다.",n,index);
		} else {
			System.out.println("찾는 정수 없다.");

		}

	}
	private static int sequenceSearch(int[] m, int n) {
		int index = -1;
		for (int i = 0; i < m.length; i++) {
			if (m[i] == n)return i;
			index = i;
			System.out.printf("찾는 정수 %d는 %d 위치에 있다.\n",n,index);
		} //for i
		return index;
		//여기도 건드려야하고...?
		
	}

	/*
	private static int sequenceSearch(int[] m, int n) {
		int index = -1;
		for (int i = 0; i < m.length; i++) {
			if (m[i] == n)return i;
		//여기도 2차원 배열로 건드리고..?
			
			
		} //for i
		return index;
		//여기도 건드려야하고...?
		
	}*/

}
