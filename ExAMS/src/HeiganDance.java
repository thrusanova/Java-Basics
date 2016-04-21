import java.util.Scanner;

/**
 * Created by tanya on 4/9/2016.
 */
public class HeiganDance {
    public static void main(String args[]) {
        Scanner console = new Scanner( System.in );
        double HeiganDamage = Double.parseDouble( console.nextLine() );
        boolean[][] lab = new boolean[15][15];
        int currRow = 7;
        int curCol = 7;
        int playerLifes = 18500;
        double heiganLifes = 3000000d;
        while (true) {
            String[] input = console.nextLine().split( " " );
            String command = input[0];
            int hitRow = Integer.parseInt( input[1] );
            int hitCol = Integer.parseInt( input[2] );

            if (command.equals( "Cloud" )) {
                if (hitRow == currRow && hitCol == curCol) {
                    lab[currRow][curCol] = true;
                    getDamageArea( currRow,curCol,lab );
                    playerLifes -= 3500;
                    if (!lab[currRow - 1][curCol] && !cellOutsideLab( currRow - 1, curCol, lab )) {
                        currRow--;
                    } else if (!lab[currRow][curCol + 1] && !cellOutsideLab( currRow, curCol + 1, lab )) {
                        curCol++;
                    } else if (!lab[currRow + 1][curCol] && !cellOutsideLab( currRow + 1, curCol, lab )) {
                        lab[currRow + 1][curCol] = true;
                    } else if (!lab[currRow][curCol - 1] && !cellOutsideLab( currRow, curCol - 1, lab )) {
                        curCol--;
                    }
                    playerLifes -= 3500;
                    getFalse( hitRow,hitCol,lab );
                } else {
                    lab[hitRow][hitCol] = true;
                    getDamageArea( hitRow,hitCol,lab );
                    if(lab[currRow][curCol]){
                        if (!lab[currRow - 1][curCol] && !cellOutsideLab( currRow - 1, curCol, lab )) {
                            currRow--;
                        } else if (!lab[currRow][curCol + 1] && !cellOutsideLab( currRow, curCol + 1, lab )) {
                            curCol++;
                        } else if (!lab[currRow + 1][curCol] && !cellOutsideLab( currRow + 1, curCol, lab )) {
                            lab[currRow + 1][curCol] = true;
                        } else if (!lab[currRow][curCol - 1] && !cellOutsideLab( currRow, curCol - 1, lab )) {
                            curCol--;
                        }
                    }
                    getFalse( hitRow,hitCol,lab );
                }

            } else {
                if (hitRow == currRow && hitCol == curCol) {
                    lab[currRow][curCol] = true;
                    playerLifes -= 6000;
                    getDamageArea( currRow,curCol,lab );
                    if (!lab[currRow - 1][curCol] && !cellOutsideLab( currRow - 1, curCol, lab )) {
                        currRow--;
                    } else if (!lab[currRow][curCol + 1] && !cellOutsideLab( currRow, curCol + 1, lab )) {
                        curCol++;
                    } else if (!lab[currRow + 1][curCol] && !cellOutsideLab( currRow + 1, curCol, lab )) {
                        currRow++;
                    } else if (!lab[currRow][curCol - 1] && !cellOutsideLab( currRow, curCol - 1, lab )) {
                        curCol--;
                    }
                    getFalse( hitRow,hitCol,lab );
                }
                else {

                    lab[hitRow][hitCol] = true;
                    getDamageArea( hitRow,hitCol,lab );
                    if(lab[currRow][curCol]){
                        if (!lab[currRow - 1][curCol] && !cellOutsideLab( currRow - 1, curCol, lab )) {
                            currRow--;
                        } else if (!lab[currRow][curCol + 1] && !cellOutsideLab( currRow, curCol + 1, lab )) {
                            curCol++;
                        } else if (!lab[currRow + 1][curCol] && !cellOutsideLab( currRow + 1, curCol, lab )) {
                           currRow++;
                        } else if (!lab[currRow][curCol - 1] && !cellOutsideLab( currRow, curCol - 1, lab )) {
                            curCol--;
                        }
                    }
                    getFalse( hitRow,hitCol,lab );
                }

            }
            heiganLifes -= HeiganDamage;
            if (playerLifes <= 0) {
                System.out.printf( "Heigan: %.2f%n", heiganLifes );
                if (command.equals( "Eruption" )) {
                    System.out.printf( "Player: Killed by %s%n", command );
                }else {
                    System.out.println( "Player: Killed by Plague Cloud" );
                }
                System.out.printf( "Final position: %d, %d", currRow, curCol );
                break;
            } else if (heiganLifes <= 0) {
                System.out.println( "Heigan: Defeated!" );
                System.out.printf( "Player: %d%n", playerLifes );
                System.out.printf( "Final position: %d, %d", currRow, curCol );
                break;

            }
        }


    }

    private static boolean cellOutsideLab(int currRow, int curCol, boolean[][] lab) {
        if (currRow < 0 || currRow >= lab.length) {
            return true;
        }
        if (curCol < 0 || curCol >= lab[currRow].length) {
            return true;
        }
        return false;
    }

    private static boolean getDamageArea(int row, int col,boolean lab[][]) {
    if(lab[row][col]=true && cellOutsideLab(row,col,lab)){
        lab[row][col-1]=true;
        lab[row][col+1]=true;
        lab[row+1][col+1]=true;
        lab[row+1][col-1]=true;
        lab[row+1][col]=true;
        lab[row-1][col-1]=true;
        lab[row-1][col]=true;
        lab[row-1][col+1]=true;
    }
        return lab[row][col];
    }
    private static boolean getFalse( int row, int col,boolean lab[][]) {
        if (cellOutsideLab(row,col,lab)) {
            lab[row][col] = false;
            lab[row][col - 1] = false;
            lab[row][col + 1] = false;
            lab[row + 1][col + 1] = false;
            lab[row + 1][col - 1] = false;
            lab[row + 1][col] = false;
            lab[row - 1][col - 1] = false;
            lab[row - 1][col] = false;
            lab[row - 1][col + 1] = false;
        }
        return false;
    }
}

