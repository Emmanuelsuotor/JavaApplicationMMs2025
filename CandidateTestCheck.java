import java.util.Scanner;

public class CandidateTestCheck{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter Full Name");
		String fullName = scan.nextLine();
		
		System.out.print("Enter English Score");
		int english = scan.nextInt();
		
		System.out.print("Enter Maths Score: ");
		int maths = scan.nextInt();
		
		System.out.print("Enter ICT Score: ");
		int ict = scan.nextInt();
		
		double average = (english + maths + ict)/3;
		
		if(english > 75 && average >= 80){
			
		}
	}
}