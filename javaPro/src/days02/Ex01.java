package days02;


/**
 * @author user
 *	@date-2025. 2. 4.오전 8:58:36
 * @subject 상수 기억공간
 * @content
 */
public class Ex01 {//영역(범위) 연산자
			//CTRL+SHIFT+L 모든 함수가 나타남
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Description	Resource	Path	Location	Type
		// The local variable name may not have been initialized	
		// = 값을 초기화한적이 없다. ';' = 연산자
		// 변수를 선언하기만 하고 값을 넣어주지 않아 뭔가를 할 수 없는 상태여서 그런것
		// 해결방안은 그러면 초기값을 미리 설정해줘야 오류가 나지 않는다는 것. 		
		//
			String name = null ;
			name = "길동";
			name = "구구";
			
			System.out.println(name);

	}

}
