import java.util.Scanner;

/**
 * Created by tanya on 3/23/2016.
 */
public class Durts {
    public static void  main (String args[]) {
        Scanner console = new Scanner(System.in);
        String [] input = console.nextLine().split(" ");
        int x1=Integer.parseInt(input[0]);
        int y1=Integer.parseInt(input[1]);
        int r=Integer.parseInt(console.nextLine());
        int number=Integer.parseInt(console.nextLine());
        String [] coords=console.nextLine().split("[ ]+");
        for (int i = 0; i < coords.length; i+=2) {
            int x = Integer.parseInt(coords[i]);
            int y = Integer.parseInt(coords[i+1]);
            if ((x - x1)*(x-x1) + (y - y1)*(y-y1) <= r*r) {
                System.out.println("yes");
            }
            else {
                System.out.println("no");
            }

        }
    }
}
