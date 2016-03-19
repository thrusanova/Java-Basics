import java.util.Scanner;

/**
 *Create a triangle of characters, based on input.
 *  Learn about java.util.Scanner and Integer.parseInt ().
 *  Test your program with integers up to 26. Think why.
 */
public class PrintCharacterTriangle {
    public static void main(String[] args) {
        Scanner console=new Scanner(System.in);
        int number=Integer.parseInt(console.nextLine());
        int num=0;
        while (num != number){
            for (char i = 'a'; i <= 'a'+num; i++) {
                System.out.print(i+" ");
            }
            num++;
            System.out.println();
        }
        num-=2;
        while (num >= 0) {
            for (char i = 'a'; i <= 'a' + num; i++) {
                System.out.print(i + " ");
            }
            num--;
            System.out.println();
        }
    }
}

