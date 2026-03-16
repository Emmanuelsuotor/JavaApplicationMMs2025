import java.util.Scanner;

public class One_Dimensional_Array{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		int[] marks = new int[10];
		int counter = 1;
		
		for(int i = 0; i < 10; i++){
			System.out.printf("Enter element%d: ",counter);
			
			marks[i] = scan.nextInt();
			
			counter++;
		}
		System.out.println("The element of the array are: ");
		for (int i = 0; i < 10; i++){
			if(marks[i] % 2 == 0){
				System.out.printf("%d number is an even number%n",marks[i]);
			}
			else{
				System.out.printf("%d is an odd number%n",marks[i]);
			}
		}
	}
}