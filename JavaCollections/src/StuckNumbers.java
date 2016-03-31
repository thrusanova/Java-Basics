import java.util.Scanner;

/**
 * Created by tanya on 3/19/2016.
 */
public class StuckNumbers {
    public static void main(String args[]) {
        Scanner console = new Scanner(System.in);
        int number = Integer.parseInt(console.nextLine());
        String[] input = console.nextLine().split(" ");
        int[] array = new int[number];
        for (int i = 0; i < input.length; i++) {
            array[i] = Integer.parseInt(input[i]);

        }
        int count=0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                for (int k = 0; k < array.length; k++) {
                    for (int l = 0; l < array.length; l++) {
                        int a = array[i];
                        int b = array[j];
                        int c = array[k];
                        int d = array[l];
                        if (a != b && a != c && a != d && b != c && b != d && c != d) {
                            String str1 = "" + a + b;
                            String str2 = "" + c + d;
                            if (str1.equals(str2)) {
                                count++;
                                System.out.printf("%s|%s==%s|%s%n", a, b, c, d);
                            }

                        }

                    }

                }
            }
        }
        if (count==0){
            System.out.println("No");
        }

    }
}