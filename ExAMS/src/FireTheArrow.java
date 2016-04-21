import java.util.Scanner;

/**
 * Created by tanya on 4/18/2016.
 */
public class FireTheArrow {
    public static void main(String args[]) {
        Scanner console = new Scanner( System.in );
        int rows = Integer.parseInt(console.nextLine());
        char [][] matrix=new char[rows][];
        for (int i = 0; i < rows; i++) {
          matrix[i]=console.nextLine().toCharArray();
        }
        boolean hasMoved=true;
        while (hasMoved){
            hasMoved=false;
            for (int row = 0; row < matrix.length; row++) {
                for (int col = 0; col < matrix[row].length; col++) {
                    int currRow=row;
                    int currCol=col;
                    char ch=matrix[currRow][currCol];
                    if(ch!='o'){
                        int dirRow=0;
                        int dirCol=0;
                        int nextRow=0;
                        int nextCol=0;
                        switch (ch){
                            case 'v':dirRow=+1;break;
                            case '^':dirRow=-1;break;
                            case '>':dirCol=+1;break;
                            case '<':dirCol=-1;break;
                        }
                        nextRow=currRow+dirRow;
                        nextCol=currCol+dirCol;
                        if(nextRow>=0 && nextRow < matrix.length &&
                                nextCol>=0 && nextCol<matrix[currRow].length
                                && matrix[nextRow][nextCol]=='o'){
                            matrix[nextRow][nextCol]=ch;
                            matrix[currRow][currCol]='o';
                            hasMoved=true;
                        }
                    }
                }
            }
        }
        for (int i = 0; i <matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }
}
