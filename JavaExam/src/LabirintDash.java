import java.util.Scanner;

/**
 * Created by tanya on 3/26/2016.
 */
public class LabirintDash {

    public static void main(String args[]) {
        Scanner console = new Scanner( System.in );
        int rows = Integer.parseInt( console.nextLine() );
        char[][] lab = new char[rows][];
        for (int i = 0; i < rows; i++) {
            lab[i] = console.nextLine().toCharArray();
        }
        char[] movies = console.nextLine().toCharArray();

        int currRow = 0;
        int curCol = 0;
        int count = 0;
        int lifes = 3;
        for (char movie : movies) {
            int initialRow = currRow;
            int initialCol = curCol;
            switch (movie) {
                case '<':
                    curCol--;
                    break;
                case '>':
                    curCol++;
                    break;
                case 'v':
                    currRow++;
                    break;
                case '^':
                    currRow--;
                    break;
            }

            if (cellOutsideLab( currRow, curCol, lab )) {
                count++;
                System.out.println( "Fell off a cliff! Game Over!" );
                break;
            } else if (extraLife( currRow, curCol, lab )) {
                count++;
                lifes++;
                lab[currRow][curCol]='.';
                System.out.printf( "Awesome! Lives left: %d%n", lifes );
            } else if (loseLife( currRow, curCol, lab )) {
                count++;
                lifes--;
                System.out.printf( "Ouch! That hurt! Lives left: %d%n", lifes );
                if (lifes == 0) {
                    System.out.println( "No lives left! Game Over!" );
                    break;
                }
            } else if (isWall(currRow, curCol, lab )) {
                  currRow=initialRow;
                  curCol=initialCol;
                System.out.println("Bumped a wall.");
            }
            else{
                count++;
                System.out.println("Made a move!");
            }


        }
        System.out.printf("Total moves made: %d%n",count);
        System.out.println();
    }

    private static boolean isWall(int currRow, int curCol, char[][] lab) {
        return lab[currRow][curCol]=='|' || lab[currRow][curCol]=='_';
    }

    private static boolean loseLife(int currRow, int curCol, char[][] lab) {
        return  lab[currRow][curCol]=='*' || lab[currRow][curCol]=='#' ||lab[currRow][curCol]=='@';
    }

    private static boolean extraLife(int currRow, int curCol, char[][] lab) {
      return   lab[currRow][curCol]=='$';
    }

    private static boolean cellOutsideLab(int currRow, int curCol, char[][] lab) {
        if (currRow < 0 || currRow >= lab.length){
           return true;
        }
        if  (curCol < 0 || curCol >= lab[currRow].length){
            return true;
        }
        return lab[currRow][curCol] == ' ';
    }


}
