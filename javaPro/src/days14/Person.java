/**
 * 
 */
package days14;

//default(package) 패키지 내부에서만 가능하다
//public  패키지 내부/외부 어디서든 사용(참, 상) 가능하다.
public class Person {
	
	//필드
	
	public String name;
	public int age;
	
	//메소드
	public void work() {
		System.out.printf("%s이 일한다.",name);
	}
	
	public void run() {
		System.out.printf("%s이 달린다.",name);
		
	}

}
