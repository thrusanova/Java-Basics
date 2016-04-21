import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by tanya on 4/10/2016.
 */
public class SoftuniDefence {
    public static void main(String args[]) {
        Scanner console = new Scanner( System.in );

        String input = console.nextLine();

        long quantity = 0;
        while (!input.equals( "OK KoftiShans" )) {
            Pattern pattern = Pattern.compile( "([A-Z][a-z]+).*?([A-Z][a-z]*[A-Z]).*?(\\d+L)" );
            Matcher m = pattern.matcher( input );
            while (m.find()) {
                String guest = m.group( 1 );
                String alcohol = m.group( 2 ).toLowerCase();
                String value = m.group( 3 ).substring( 0, m.group( 3 ).length() - 1 );
                long amount = Integer.parseInt( value );
                quantity+=amount;
                System.out.printf( "%s brought %d liters of %s!%n", guest, amount, alcohol );

            }
            input=console.nextLine();
        }
        double result=quantity*0.001;
        System.out.printf("%.3f softuni liters",result);
    }
    }

