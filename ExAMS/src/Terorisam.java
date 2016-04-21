import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by tanya on 4/14/2016.
 */
public class Terorisam {
    public static void main(String[] args) {
        Scanner scn = new Scanner( System.in );
        String input = scn.nextLine().trim();
        int count = 0;
        String str = "";
        String pattern = "\\|(.*?)\\|";
        Pattern pat = Pattern.compile( pattern );
        Matcher match = pat.matcher( input );
        StringBuilder sb = new StringBuilder(input);
        //while (match.find()) {
        for (int i = 0; i < sb.length(); i++) {
            int counter = 0;
            int sum = 0;
            int startIndex = 0;
            int endIndex = 0;
            String st="";
         //   String s = match.group( );
           char s1 = input.charAt( i );
            if (s1 == '|' ){

                for (int j = i+1; j < sb.length(); j++) {
                    if (sb.charAt( j )=='|'){
                        break;
                    }else {
                    sum+=sb.charAt( j );
                        counter++;
                }
            }

            int lastDigit = sum % 10;
                int symbolToSymbol=0;
                if (i==0){
                    startIndex=0;
                     symbolToSymbol = lastDigit+2 + counter;
                }else {
                    startIndex = i - lastDigit;
                     symbolToSymbol = 2 * (lastDigit+1) + counter;
                }

                    endIndex = startIndex+symbolToSymbol;
            if(endIndex>sb.length()) {
                sb.replace( startIndex,sb.length(),new String( new char[sb.length()-startIndex] ).replace( "\0", "." ) );
            }else {
                sb.replace( startIndex, endIndex, new String( new char[symbolToSymbol] ).replace( "\0", "." ) );
            }
                i=endIndex;
            }


            }


        System.out.println( sb.toString() );
    }
}