This readme assumes that the user is running the program in Eclipse.


CREATING A FILE

To create a file that includes a randomly generated matrix, run 'generator.java' in NumberGenerator.
 - It will ask for a file name; type the name that you want the file to be, with '.txt' at the end.
 - It will ask for a matrix size; type one value. 
    - (e.g. typing 12 will result in a matrix that is 12x12).
 - The program will inform you when the file is created and matrix generated, then it will terminate.


MATRIX MULTIPLICATION

To see the newly created file, refresh the package explorer. The file will be in the NumberGenerator folder.
It must now be copied into the MatrixMult folder. 

Once a file is in the MatrixMult folder, run 'runner.java'.
 - It will ask for a file name. You must provide the name of a file that is in the MatrixMult folder.
    - You must include the '.txt' at the end of the file name.
 - It will ask for a matrix size; type one value. It will then extract a matrix that size 
   from the file provided.
    - (e.g. typing 12 will result in a matrix that is 12x12).
 - It will ask how many times you would like to run the program. enter an integer.
 - It asks you to choose a run type. Type 'b' for brute force, or 's' for strassen's.
    - if you choose 'b', it will promptly run brute force and output the runtimes.
    - if you choose 's', it will ask how many recursions you would like.
         - if you would like full recursions, type the value of the matrix size.
         - otherwise, type an integer between 1 and the matrix size.
       - it will then run Strassen's as commanded and output the runtimes.
 - The program will ask if you would like to run again with the current file and matrix size. 
    - 'y' will allow you to run it again.
    - 'n' will terminate the program.
