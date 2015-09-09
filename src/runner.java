import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * 
 * @author Emily Maust
 *
 */
public class runner 
{
	public static int[][] createMatrices(String fileName, int size) throws FileNotFoundException
	{
		File inputFile = new File(fileName);
		Scanner fileIn = new Scanner(inputFile);
		int matrixSize = size;
		int matrix[][] = new int[matrixSize][matrixSize];
		for (int row = 0; row<matrixSize; row++)
		{
			for (int col = 0; col<matrixSize; col++)
			{
				matrix[row][col] = Integer.parseInt(fileIn.next());
			}
		}
		return matrix;
	}

	public static void main(String[] args) throws FileNotFoundException
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("File name: ");
		String fileName = scan.nextLine();
		System.out.print("Matrix size: ");
		int matrixSize = Integer.parseInt(scan.nextLine());
		int[][] array = createMatrices(fileName, matrixSize);

		System.out.println("Matrix created!");
		boolean go = true;
		boolean run = true;
		while(go==true)
		{
			while(run==true)
			{
				System.out.print("How many times would you like to run the file? ");
				int runtime = Integer.parseInt(scan.nextLine());
				System.out.print("Would you like to run Brute Force or Strassen's? (b/s): ");
				String which = scan.nextLine();
				char brute = which.charAt(0);
				if (brute == 'b')
				{
					for (int i = 0; i < runtime; i++)
					{
						bruteForce.brute(matrixSize, array, array);
						bruteForce.printTime();
					}
					run=false;
				}
				else if (brute == 's')
				{
					System.out.println("How many recursions would you like?");
					int recursions = Integer.parseInt(scan.nextLine());
					callStrassens.recursive(matrixSize, array, runtime, recursions);
					run=false;
				}
				else
				{
					System.out.print("You must answer with (b) or (s).");
					run=false;
				}
				if (run==false)
				{
					System.out.println("Run again? (y/n)");
					String yesno = scan.nextLine();
					char again = yesno.charAt(0);
					if (again == 'y')
					{
						run=true;
					}
					else if (again == 'n')
					{
						System.out.println("Goodbye.");
						go = false;
					}
					else
					{
						System.err.println("Invalid answer");
					}
				}
			}
		}
	}
}
