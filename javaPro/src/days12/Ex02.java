/**
 * 
 */
package days12;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * @author user
 *	@date-2025. 2. 18.오전 9:20:31
 * @subject 
 * @content
 */
public class Ex02 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int [] m = {3,5,2,4,1};
		System.out.println(m.length);
		System.out.println(Arrays.toString(m));
		//1. 6을 배열의 제일 뒤에 추가(append)
		//m[5] = 6;//배열의 크기가 부족해서 오류
		m = Arrays.copyOf(m, m.length+1);
		m[5] = 6;
		System.out.println(Arrays.toString(m));
		
		
		/*if(m[]==2){
		 * {3,5,100,2,4,1}
		 * m[2] = 100;을 하게되면 2가 사라지고 100이 들어가는거고
		 * 옆으로 밀려가게 넣는게 뭐가 있을까 수를 넣어서 자동으로 옆 순서로 하나씩 다시 정해지는게.
		 * 
		 * System.out.println(Arrays.append(100);
		 * 
		 * */
		
		//2. 2가 있는 위치를 찾아서 100을 삽입
		/*[1]
		 * int index = -1;//못찾았을 경우 -1을 기본으로 함
		for (int i = 0; i < m.length; i++) {
			if (m[i]==2) index = i;
			System.out.println("> index = "+index);
				
			} //if
		} //for i
		 */
		
		/* [2] 배열의 단점 -> 컬레션 클래스 사용(List) +indexOf() 메서드
		 * List<Integer> list = List.of(3,5,2,5,1,6);
		 * int index= list.indexOf(2);
		 * System.out.println(">index="+index);
		 * */
		
		/*[3]
		 * 
		 * 
		 * 
		 * */
		int index = Arrays.stream(m) //배열 -> stream 변환
				.boxed() //기본형 [int]-> 래퍼클래스  Integer 변환
				.collect(Collectors.toList())
				.indexOf(2);
		 System.out.println(">index="+index);
		 //[3, 5, 2, 4, 1, 6, 0]
		 /*m = Arrays.copyOf(m, m.length+1);
		 System.out.println(Arrays.toString(m));
		 for (int i = m.length - 2; i>=index; i--) {
			 m[i+2]= m[i];
			
		} //for i*/
		 
		 //[3, 5, 2, 4, 1, 6, 0]
		 /*
		 int [] temp = new int[m.length];
		 System.arraycopy(m, 0, temp, 0, index);
		 System.arraycopy(m, index, temp, index+1, m.length-index);
		 System.out.println(Arrays.toString(temp));
		 m = temp;
		 m[index] = 100;
		 System.out.println(Arrays.toString(m));*/
		 
		 //	100	삭제
		 //[3, 5, 100,2, 4, 1, 6]
		 //앞으로 한칸씩 땡기고 뒤를 삭제 Arraycopy()사용
		 int [] temp = new int[m.length];
		 index = 2;
		 temp = new int[m.length-1];
		 
		 System.arraycopy(m, index+1, temp, index,m.length-1- index);
		 System.arraycopy(m, index+1, temp, index,m.length-1- index);
		  m = temp;
		 
		 
	}			

}
