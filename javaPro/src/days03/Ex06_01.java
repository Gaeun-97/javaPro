/**
 * 
 */
package days03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author user
 *	@date-2025. 2. 5.오후 2:11:21
 * @subject
 * @content 	//Type Convert(형 변환)
		// 1 ) 자동 형 변환
		// 2 ) 강제 형 변환
		 * 
		 * 같은 정수형으로 변환해도 형 변환
		 * int -> byte
		 * byte->long
 */
public class Ex06_01 {


	public static void main(String[] args) throws IOException {
		
		//[문제]
		// 이름, 국어, 영어, 수학 점수를 입력 받아서
		// 총점
		// 평균
		// [출력]
		// 이름="홍길동", 국어=90, 영어=89, 수학=77, 총점=256, 평균=85.33
		
		String name;
		byte kor,eng,mat;
		short tot = 0;
		double avg; //오차범위 줄이기 위해  double
		//그럼 여기서도 입력 받는 코드 부분이랑, 그 입력 받은 부분을 평균 내주는...
		
		//평균 내주는게
		//tot = kor+eng+mat; avg=tot/3
		
		//출력은 이름="홍길동", 국어=90, 영어=89, 수학=77, 총점=256, 평균=85.33
		//System.out.printf("이름=\"%s\", 국어=%, 영어=, 수학=, 총점=, 평균=",name,kor,eng,mat,tot);
	
		BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
	
		System.out.print(">이름 입력 ?");
		
		 name = br.readLine();
		 
		System.out.print(">국어 입력 ?");
		kor = Byte.parseByte(br.readLine());
	
		System.out.print(">영어 입력 ?");
		eng = Byte.parseByte(br.readLine());
		
		System.out.print(">수학 입력 ?");
		mat = Byte.parseByte(br.readLine());
		
		
		//tot=kor+eng+mat;
		
		
		// System.out.printf("이름=\"%s\", 국어=%d, 영어=%d, 수학=%d, 총점=%d, 평균=85.33\n", name,kor,eng,mat,tot);
		

	}

}
