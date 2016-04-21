import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by tanya on 4/12/2016.
 */
public class RubikMatrix {
    public static void main(String args[]){
        Scanner console=new Scanner(System.in);
        String [] dimensions=console.nextLine().split("\\s+");
        int rows=Integer.parseInt(dimensions[0]);
        int cols=Integer.parseInt(dimensions[1]);
        int [][] matrix=new int[rows][cols];
        int filter=1;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j]=filter;
                filter++;
            }
        }
        int number=Integer.parseInt(console.nextLine());
        for (int i = 0; i < number; i++) {
            String [] command=console.nextLine().split("\\s+");
            int numToShift=Integer.parseInt(command[0]);
            String direction=command[1];
            int turns=Integer.parseInt(command[2]);
            if (direction.equals("up")){
                shiftUp(rows,cols,matrix,numToShift,turns);
            }
            else if (direction.equals("down")){
                shiftDown(rows,cols,matrix,numToShift,turns);
            }
            else if (direction.equals("left")){
                shiftLeft(rows,cols,matrix,numToShift,turns);
            }
            else {
                shiftRight(rows,cols,matrix,numToShift,turns);
            }
        }

      printMatrix(rows,cols,matrix);
        arrangeMatrix(rows,cols,matrix);
    }
    private static void arrangeMatrix( int rows, int cols,int[][] matrix) {
        int expected = 1;
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                if (matrix[row][col] != expected) {
                    for (int x = 0; x < rows; x++) {
                        for (int y = 0; y < cols; y++) {
                            if (matrix[x][y] == expected) {
                                System.out.printf( "Swap (%d, %d) with (%d, %d)\n", row, col, x, y );
                                int temp = matrix[x][y];
                                matrix[x][y] = matrix[row][col];
                                matrix[row][col] = temp;
                            }
                        }
                    }
                } else {
                    System.out.println( "No swap required" );
                }
                expected++;
            }
        }
    }

private static void shiftRight(int rows, int cols, int[][] matrix, int numToShift, int turns) {
        turns%=cols;
        for (int i = 0; i <turns ; i++) {
            int temp=matrix[numToShift][cols-1];
        for (int j = cols-2; j >=0; j--) {
        matrix[numToShift][j+1]=matrix[numToShift][j];
        }
            matrix[numToShift][0]=temp;
        }
    }

        private static void shiftLeft(int rows, int cols, int[][] matrix, int numToShift, int turns) {
            turns%=cols;
            for (int i = 0; i < turns; i++) {
                int temp=matrix[numToShift][0];
                for (int j = 1; j < cols; j++) {
                    matrix[numToShift][j-1]=matrix[numToShift][j];
                }
                matrix[numToShift][cols-1]=temp;
            }
        }


    private static void shiftDown(int rows, int cols, int[][] matrix, int numToShift, int turns) {
        turns%=rows;
        for (int i = 0; i < turns; i++) {
            int temp=matrix[rows-1][numToShift];
            for (int j = rows-2; j >=0 ; j--) {
                matrix[j+1][numToShift]=matrix[j][numToShift];
            }
            matrix[0][numToShift]=temp;
        }
    }

    private static void shiftUp(int rows, int cols, int[][] matrix, int numToShift, int turns) {
            turns%=rows;
        for (int i = 0; i < turns; i++) {
            int temp=matrix[0][numToShift];//0 element
            for (int j = 1; j < rows; j++) {
            matrix[j-1][numToShift]=matrix[j][numToShift];
            }
            matrix[rows-1][numToShift]=temp;
        }
    }

    private static void printMatrix(int rows,int cols,int[][]matrix) {
        for (int i = 0; i <rows; i++) {
            System.out.println( Arrays.toString(matrix[i]));
        }
    }
}
