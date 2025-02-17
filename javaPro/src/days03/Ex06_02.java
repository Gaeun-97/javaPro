/**
 * 
 */
package days03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author user
 *	@date-2025. 2. 5.오후 3:09:10
 * @subject
 * @content
 */
public class Ex06_02 {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws NumberFormatException 
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		String name;
		byte kor,eng,mat;
		short tot;
		double avg; 
		
		BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print(">이름 입력 ?");
		
		 name = br.readLine();
		 //같은 타입일때만 가능(숫자->숫자)
		System.out.print(">국어 입력 ?");
		//Byte cannot be resolved to a variable
		kor = Byte.parseByte(br.readLine());
	
		System.out.print(">영어 입력 ?");
		eng = Byte.parseByte(br.readLine());
		
		System.out.print(">수학 입력 ?");
		mat = Byte.parseByte(br.readLine());
		
		
		tot=(short) (kor+eng+mat);
		avg=(double)tot/3;
		//
		
		
		 System.out.printf("이름=\"%s\", 국어=%d, 영어=%d, 수학=%d, 총점=%d, 평균=%5f\n", name,kor,eng,mat,tot,avg);

	}

}
