import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by tanya on 3/24/2016.
 */
public class DragonSharp {
    public static void main(String args[]) {
        Scanner console = new Scanner(System.in);
        int num = Integer.parseInt(console.nextLine());
        ArrayList<String>list=new ArrayList<>( );
    //  boolean bool = false;
        boolean elseVar=false;
        Pattern pattern = Pattern.compile("(.+?)\"(.+?)\";");
        int count=1;
        boolean wrongInput=false;
        for (int i = 0; i < num ; i++) {
            String input = console.nextLine();
           // StringBuilder sb=new StringBuilder(  )
            Matcher m = pattern.matcher(input);
            if (m.find() && !wrongInput) {
                boolean bool=false;
                String[] str = m.group( 1 ).split( " " );
                String output = m.group( 2 );
                String loopCount = str[str.length - 2];
                int number = 0;
                if (loopCount.length() == 1) {
                    number = Integer.parseInt( str[str.length - 2] );
                } else {
                    number = 1;
                }
                if (str[0].equals( "if" )) {
                    str[1] = str[1].substring( 1, str[1].length() - 1 );
                    String[] s = str[1].split( "[><=]+" );
                    int first = Integer.parseInt( s[0] );
                    int second = Integer.parseInt( s[1] );
                    //char sign=s.charAt( 2 );
                  if (first == second && str[1].contains( "==" )) {
                        bool = true;
                    }
                    if (first > second && str[1].contains( ">" )) {
                        bool = true;
                    }
                    if (first < second && str[1].contains( "<" )) {
                        bool = true;
                    }

                }

                if (bool == true && !elseVar) {
                    for (int j = 0; j < number; j++) {
                        list.add( output );
                    }
                    if (i==num-1){
                        break;
                    }
             }
                else if (!bool){

                    if (loopCount.length() == 1) {
                        number = Integer.parseInt( str[str.length - 2] );
                    } else {
                        number = 1;
                    }
                    for (int j = 0; j < number; j++) {
                        list.add( output );
                    }
                }

count++;
            }
            else {
                wrongInput=true;
                //System.out.printf( "Compile time error @ line %s",count );
            }
            }

        if (!wrongInput) {
            for (int i = 0; i < list.size(); i++) {
                String s = list.get( i );
                System.out.println(s);
            }

        }
        else    {
            System.out.printf( "Compile time error @ line %s",count );
        }
        }


        //System.out.print(input);
    }

