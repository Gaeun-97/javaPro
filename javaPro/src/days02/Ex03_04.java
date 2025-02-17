/**
 * 
 */
package days02;

/**
 * @author user
 *	@date-2025. 2. 4.오전 10:51:56
 * @subject
 * @content
 */
public class Ex03_04 {
	public static void main(String[] args) {
		
		String name ="홍길동";
		int age=25;
		double height = 180.78;
		
		
		//System.out.println("이름은 \""+name+"\"이고, 나이는 '"+age+"' 살이고, 키는"+height+"cm 이다.");
		System.out.printf(name, args);
		//String 	s
		//int	 t
		//double f
		//%conversion
		//printf랑 println 차이점
		System.out.printf("이름은 %S 이고, 나이는 %d살이고, 키는	%.2f cm 이다.");
	}

}
