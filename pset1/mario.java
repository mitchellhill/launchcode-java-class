package itsamario;
import java.util.Scanner;

public class mario {

	public static void main(String[] args) {
		
		int height;
		int steps;
		int spaces = 0;
		int hash = 0;		
		
		do{
			System.out.println("Please provide the desired height of the half pyramid between 1 and 23: ");
			Scanner input = new Scanner(System.in);
			
			height = input.nextInt();
		}
		while (height<1 || height>23);
		
		for (steps = 1; steps <= height; steps++){
			for (spaces = 1; spaces <= height - steps; spaces++)
				System.out.print(" ");
			for (hash = 1; hash <= steps; hash++)
				System.out.print("#");
			
			System.out.println("");
		}
		
	}

}