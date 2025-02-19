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
 * 
 * 				문제) 찾고자 하는 수 9 를 모두 찾아서 출력
 * 					찾고자 하는 정수의 모든 위치값을 출력
 */
public class Ex05_02 {

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
		if (index != -1) {
			System.out.printf("찾는 정수 %d는 %d 위치에 있다.",n,index);
		} else {
			System.out.println("찾는 정수 없다.");

		}

	}

	/**
	 * @param m
	 * @param n
	 */
	private static int sequenceSearch(int[] m, int n) {
		int index = -1;
		for (int i = 0; i < m.length; i++) {
			
			if (m[i] == n) return i;
			
		} //for i
		return index;
	}

}
