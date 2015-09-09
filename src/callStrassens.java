/**
 * 
 * @author Emily Maust
 *
 */
public class callStrassens 
{
	public static void recursive(int size, int[][] array, int runtime, int recursions) 
	{
		for (int x = 0; x<runtime; x++)
		{
			int[][] matrixA = new int[size][size];
			int[][] matrixB = new int[size][size];
			for(int i=0; i<size; i++) //copy the contents of array into the others
			{
				for(int j=0; j<size; j++)
				{
					matrixA[i][j]=array[i][j];
					matrixB[i][j]=array[i][j];
				}
			}

			long startTime = System.currentTimeMillis();

			strassens complete = new strassens(recursions, runtime, matrixA);
			int[][] completed = complete.strassen(matrixA, matrixB, 0);
//			strassens.printArray(completed);

			long stopTime = System.currentTimeMillis();
			double elapsedTime = (double)(stopTime - startTime); //calculate time
			System.out.println(elapsedTime);
		}
	}
}
