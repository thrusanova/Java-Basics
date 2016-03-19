import java.util.Scanner;

/**
 Write a program that converts the decimal number system to the ghetto numeral system. In the ghetto, numbers are represented as following:
 	0 – Gee
 	1 – Bro
 	2 – Zuz
 	3 – Ma
 	4 – Duh
 	5  - Yo
 	6 – Dis
 	7 – Hood
 	8 – Jam
 	9 – Mack

 */
public class GhettoNumeral {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String input=console.nextLine();
        String newStr="";
        String result="";
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            switch (c) {
                case '0':result+="Gee";break;
                case '1':result+="Bro";break;
                case '2':result+="Zuz";break;
                case '3':result+="Ma";break;
                case '4':result+="Duh";break;
                case '5':result+="Yo";break;
                case '6':result+="Dis";break;
                case '7':result+="Hood";break;
                case '8':result+="Jam";break;
                case '9':result+="Mack";break;
           }

        }
        System.out.println(result);

    }

}
