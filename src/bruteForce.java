/**
 * 
 * @author Emily Maust
 * 'print' statements have been commented out
 * because they were used for checking calculations;
 * calculations have been confirmed correct, so all we want
 * to print is the timestamp.
 *
 */
public class bruteForce
{
	private static double totalSecs = 0;
	public static int[][] brute(int size, int[][] array1, int[][] array2) 
	{
		int[][] complete = new int[size][size];
			int[][] matrixA = new int[size][size];
			int[][] matrixB = new int[size][size];
			for(int i=0; i<size; i++)
			{
				for(int j=0; j<size; j++) //copy the contents of array into the others
				{
					matrixA[i][j]=array1[i][j];
					matrixB[i][j]=array2[i][j];
				}
			}
			int temp = 0;
			long startTime = System.currentTimeMillis(); //start recording time
//			System.out.println("Brute: ");
			for (int a = 0; a<size; a++)
			{
				for (int b = 0; b<size; b++)
				{
					for (int c = 0; c<size; c++)
					{
						temp += matrixA[a][c]*matrixB[c][b];
					}
					complete[a][b] = temp;
//					System.out.print(complete[a][b] + " ");
					temp = 0;
				}
//				System.out.println();
			}
			long stopTime = System.currentTimeMillis();
			double elapsedTime = (double)(stopTime - startTime); //calculate time
			totalSecs = elapsedTime;
			
		return complete;
	}
	
	public static void printTime()
	{
		System.out.print("");
		System.out.println(totalSecs);
	}
}