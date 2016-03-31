import java.util.Scanner;

/**
 * Created by tanya on 3/27/2016.
 */
public class ParkingLot2 {
    public static void main(String args[]) {
        Scanner console = new Scanner( System.in );
        String[] dim = console.nextLine().split( " " );
        int rows = Integer.parseInt( dim[0] );
        int cols = Integer.parseInt( dim[1] );
        boolean[][] arr = new boolean[rows][cols];

        String input = console.nextLine();
        while (!input.equals( "stop" )) {
            int count = 1;

            int currCol = 0;
            int currRow = Integer.parseInt( input.split( " " )[0] );
            int x = Integer.parseInt( input.split( " " )[1] );
            int y = Integer.parseInt( input.split( " " )[2] );
            boolean isEmpty = false;
            arr[x][0]=true;
            for (int i = 1; i < cols; i++) {
                if (!arr[x][i]) {
                    isEmpty = true;
                    break;
                }

            }
            if (isEmpty) {
                if (currRow < x) {
                    count += Down( currRow, x );
                } else {
                    count += Up( currRow, x );
                }
                if (!arr[x][y]) {
                    for (int i = 0; i < y; i++) {
                        count++;
                    }
                    arr[x][y] = true;
                } else {
                    {
                            for (int k = 1; k <= y; k++) {
                                if (!arr[x][k]) {
                                    while(!arr[x][k]) {
                                        count++;
                                        k++;
                                    }
                                    arr[x][k-1]=true;
                                    break;
                                }
                                else  {
                                    count++;
                                    while(arr[x][k]){
                                        count++;
                                        k++;
                                    }
                                    arr[x][k]=true;
                                    break;
                                }
                            }
                        }

                    }
                System.out.println( count );
                input = console.nextLine();
                }


             else {
                System.out.printf( "Row %d full", x );
                System.out.println();
                input = console.nextLine();

            }
        }
    }

    private static int Down(int currRow, int x) {
        int count=0;
        for (int i = currRow; i < x; i++) {
            count++;
        }
        return count;
    }
    private static int Up(int currRow, int x) {
        int count=0;
        for (int i = currRow; i > x; i--) {
            count++;
        }
        return count;
    }
}
