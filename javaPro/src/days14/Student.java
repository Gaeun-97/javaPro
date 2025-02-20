/**
 * 
 */
package days14;

/**
 * @author user
 *	@date-2025. 2. 20.오후 5:21:48
 * @subject
 * @content
 */
public class Student {
	public int no;
	
	public String name ;
	public int kor, eng, mat, tot, rank;
	public double avg;
	
	
	public String getInfo() {
		return String.format("[%d]\t%s\t%d\t%d\t%d\t%d\t%.2f\t%d\n"
	               , no
	               , name
	               , kor, eng, mat, tot
	               , avg, rank);
	}

}
