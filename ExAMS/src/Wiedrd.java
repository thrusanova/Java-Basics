import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by tanya on 4/7/2016.
 */
public class Wiedrd {
    public static void main(String args[]) {
        Scanner console = new Scanner( System.in );
        int num = Integer.parseInt( console.nextLine() ) % 52;
        int number=num%52;//104 %52=0
        String str = "";
        if (number <= 26 && num>0) {
            str = Character.toString( (char) (number + 96) ) + Character.toString( (char) (96 + number) );
        }
        else if (num==0){
            str=Character.toString( (char) (number + 90) ) + Character.toString( (char) (90 + number) );;
        }
        else {
            str = Character.toString( (char) (64 + number - 26) ) + Character.toString( (char) (64 + number - 26) );
        }
        String input = console.nextLine();
        StringBuilder sb = new StringBuilder();
        while (!input.equals( "End" )) {
            sb.append( input );
            input = console.nextLine();
        }

        //  input=console.nextLine();
        String s = sb.toString();
        String pattern = str + "(.*?)" + str;
        Pattern pat = Pattern.compile( pattern );
        Matcher match = pat.matcher( s );
        while (match.find()) {

                System.out.println( match.group( 1 ) );

        }

    }
}

