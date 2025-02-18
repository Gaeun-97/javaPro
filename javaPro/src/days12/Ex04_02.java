/**
 * 
 */
package days12;

import java.util.Arrays;

/**
 * @author user
 *	@date-2025. 2. 18.오후 2:02:41
 * @subject
 * @content
 */
public class Ex04_02 {

	public static void main(String[] args) {
		/*
		 * [병합 정렬(merge sort)]
		 * ㄴ 1)이미 정렬되어져 있는 두 개의 배열을 합쳐서
		 * 		하나의 배열로 만드는 정렬 방식
		 * ㄴ 2)
		 * */
		int [] m = {1,3,4,6,10,14};
		int [] n = {2,4,7};
		
		//int [] mn = new int[m.length+n.length]; //두개를 병합
		
		int [] mn = mergeSort(m,n);
		System.out.println(Arrays.toString(mn));

	}

	/**
	 * @param m
	 * @param n
	 */
	private static int [] mergeSort(int[] m, int[] n) {
		int [] mn = new int[m.length+n.length];
		//int [] m = {1,3,4,6,10,14};  //1하고 2 비교해서 작은값 1 넣고, 2하고 3 비교해서 2넣고,3하고 4 비교해서 3넣고
		//int [] n = {2,4,7};	//4하고 6 비교해서 4넣고 6하고 7비교해서 6넣고 7하고 10 비교해서 7넣고 10하고 14....해서
		int i,j,k;
		i=j=k=0;
		/*if (m[i]>n[j]) {
			mn[k] = n[j];			
		}else {
			mn[k] = m[i];
		}*/
		
		while ( i < m.length && j < n.length ) {
	         mn[k++] = m[i] > n[j]? n[j++] : m[i++];         
	      } // while
	      
	      if (i == m.length) { // 남은 배열 n
	         System.arraycopy(n, j, mn, k, n.length-j);
	      } else {  // 남은 배열 m
	         System.arraycopy(m, i, mn, k, m.length-i);
	      } // if
	      
	      System.out.println( Arrays.toString(mn));
	      return mn;

	
		
	}

}
