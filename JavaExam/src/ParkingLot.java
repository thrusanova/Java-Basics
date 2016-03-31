import java.util.Scanner;

/**
 * Created by tanya on 3/27/2016.
 */
public class ParkingLot {
    public static void main(String args[]) {
        Scanner console = new Scanner( System.in );
        String strdim = console.nextLine();
        String[] dim = strdim.split( " " );
        int rows = Integer.parseInt( dim[0] );
        int cols = Integer.parseInt( dim[1] );
        int[][] arr = new int[rows][cols];
        String input = console.nextLine();
        while (!input.equals( "stop" )) {
            int count = 1;

            int startPos = Integer.parseInt( input.split( " " )[0] );
            int x = Integer.parseInt( input.split( " " )[1] );
            int y = Integer.parseInt( input.split( " " )[2] );

            boolean flEmpty = false;
            for (int i = 1; i < cols; i++) {
                if (arr[x][i] ==0){
                    flEmpty = true;
                    break;
                }

            }
            if (flEmpty == true) {
                if (startPos < x) {
                    count += Down( startPos, x );
                } else {
                    count += Up( startPos, x );
                }

                if (arr[x][y] == 0) {
                    for (int i = 0; i < y; i++) {
                        count++;
                    }
                } else {
                    int newy = y;
                    boolean flag = false;
                    for (int i = 1; i < y; i++) {
                        int z = 1;
                        if (flag == true) break;
                        for (int j = 1; j <= 2; j++) {
                            z = z * -1;
                            newy = y + z * i;
                            if (arr[x][newy] == 0) {
                                y = newy;
                                flag = true;
                                {
                                    for (int s = 0; s < y; s++) {
                                        count++;
                                    }
                                }
                                break;
                            }
                        }
                    }
                }
                arr[x][y] = 1;

                System.out.println( count );
                input = console.nextLine();
            }else
            {
                System.out.printf("Row %d full",x);
                System.out.println(  );
                input = console.nextLine();

            }
        }

    }

    public static int Down(int curRow, int lastRow) {
        int count = 0;
        for (int i = curRow; i < lastRow; i++) {
            count++;
        }
        return count;
    }

    public static int Up(int curRow, int lastRow) {
        int count = 0;
        for (int i = curRow; i < lastRow; i--) {
            count++;
        }
        return count;
    }

}
