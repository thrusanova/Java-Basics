import java.util.Scanner;

/**
 * Created by tanya on 3/25/2016.
 */
public class Enigma {
    public static void main(String args[]) {
        Scanner console = new Scanner( System.in );
        int number=Integer.parseInt( console.nextLine() );
        for (int k = 0; k <number; k++) {
            String input = console.nextLine();
            String st="";
            int count=0;
            String s= input.replace( " ","");

            for (int i = 0; i < input.length(); i++) {
                char c= input.charAt( i );
                if (Character.isDigit( c )) {
                    count++;
                }
            }
            int len=(s.length()-count)/2;
            for (int i = 0; i < input.length(); i++) {
                char c= input.charAt( i );
                if (c==' ') {
                    st += " ";
                }
                else if (Character.isDigit( c )) {
                    st+=c;
                }
                else {
                    char ch=(char)(c+len);
                    st+=ch;
                }

            }
            System.out.println( st );;

        }
    }

}

