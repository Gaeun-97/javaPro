package days03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author user
 *	@date-2025. 2. 5.오전 11:46:31
 * @subject
 * @content
 */
public class Ex05 {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		//키보드로 부터 이름을 입력받아서 출력.
		//암기해서 치기 자동완성 할 정도만 외워
		BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
		//입력 받아서 하는 부분.
		System.out.print(">이름 입력 ?");
		//출력인데.
		//Unhandled exception type IOException
		 String name = br.readLine();
		//이게 변수 저장하는 부분?
		 System.out.printf("이름 =%s\n",name);
		 //그리고 이걸 출력하는 거 같은데.
	}

}
