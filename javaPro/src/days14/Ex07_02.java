/**
 * 
 */
package days14;

/**
 * @author user
 *	@date-2025. 2. 20.오후 3:23:17
 * @subject
 * @content
 */
public class Ex07_02 {
	public static void main(String[] args) {
		int x = 10, y = 20;
		
		Point p1 = new Point();
		p1.x = 10;
		p1.y = 20;
		
		System.out.printf(">x=%d, y=%d\n", p1.x, p1.y);
		swap(p1);

		System.out.printf(">x=%d, y=%d\n", p1.x, p1.y);

	}

	private static void swap(Point p) {
		System.out.printf(">x=%d, y=%d\n", p.x, p.y);
		int temp = p.x;
		p.x= p.y;
		p.y= temp;
		System.out.printf(">x=%d, y=%d\n",p.x, p.y);
		
	}
	private static void swap(int x, int y) {
		System.out.printf(">x=%d, y=%d\n", x,y);
		int temp = x;
		x = y;
		y = temp;
		System.out.printf(">x=%d, y=%d\n", x,y);
	}

	//선언
	

	
}//class

class Point{
	//필드
	int x;
	int y;
	
}
