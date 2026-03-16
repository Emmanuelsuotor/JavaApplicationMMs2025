public class Multi_Dimensional_Array{
	public static void main(String[] args){
		
		int[][] numbers = {{9,10,4,6,2},{4,0,5,2,1},{12,9,3,8,6}};
		
		for(int row = 0; row < 3; row++){
			for(int column =0; column < 5; column++){
				System.out.printf("%d%n",numbers[row][column]);
			}
		}
			System.out.println("Using enhanced for loop");
		for(int[] row : numbers){
			for(int column : row){
				System.out.printf("%d%n",column);
			}
		}
	}
}