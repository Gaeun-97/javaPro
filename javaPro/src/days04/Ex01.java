/**
 * 
 */
package days04;

/**
 * @author user
 *	@date-2025. 2. 6.오전 9:01:21
 * @subject
 * @content
 */
public class Ex01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//String을  int로 형변환하는 코딩을 하세요. 
		//빈문자열을 같이 더하면 int 값을 바꿀 수 있음
		System.out.println(15>>2);
		System.out.println(15>>>2);
		//방향이 3개면 무조건 빈칸 00
		System.out.println(15<<2);
		//왼쪽으로 밀때는 무조건 빈칸은 00
		
		/*
		 * String b =Integer.toBinaryString(15);
		 * 
		 * System.out.println(Integer.toBinaryString(15));
		 * System.out.printf("%08d",Integer.parseInt(b)); //0000을 더 추가
		 */		
		
		System.out.println(Integer.toOctalString(15));//8진수 문자열
		
		System.out.println(Integer.toHexString(15)); //16진수 문자열
	}
}