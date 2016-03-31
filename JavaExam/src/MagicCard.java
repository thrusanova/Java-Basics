import java.util.Scanner;

/**
 * Created by tanya on 3/25/2016.
 */
public class MagicCard {
        public static void  main (String args[]) {
            Scanner console = new Scanner( System.in );
            String[] input = console.nextLine().split( " " );
            String str = console.nextLine();
            String card = console.nextLine();
            if ((input.length == 1) && (str.equals( "odd" ))) {
                System.out.println( 0 );
            } else {
                int cardNum = 0;
                String c = card.substring( card.length() - 1 );
                //   int p=  card.length();
                String n = card.substring( 0, card.length() - 1 );
                if (n.contains( "J" )) {
                    cardNum = 12;
                } else if (n.contains( "Q" )) {
                    cardNum = 13;
                } else if (n.contains( "K" )) {
                    cardNum = 14;
                } else if (n.contains( "A" )) {
                    cardNum = 15;
                } else {
                    cardNum = Integer.parseInt( String.valueOf( n ) );
                }
                String suit = String.valueOf( c );
                int result = 0;
                String s = "";

                for (int i = 0; i < input.length; i += 2) {
                    if (str.equals( "odd" )) {
                        s = input[i + 1];
                    } else {
                        s = input[i];

                    }
                    String a = s.substring( 0, s.length() - 1 );
                    int inputNum = 0;
                    if (a.contains( "J" )) {
                        inputNum = 12;
                    } else if (a.contains( "Q" )) {
                        inputNum = 13;
                    } else if (a.contains( "K" )) {
                        inputNum = 14;
                    } else if (a.contains( "A" )) {
                        inputNum = 15;
                    } else {
                        inputNum = Integer.parseInt( s.substring( 0, s.length() - 1 ) );
                    }
                    String inputSuit = String.valueOf( s.substring( s.length() - 1 ) );

                    switch (inputNum) {
                        case 2:
                            inputNum = 20;
                            break;
                        case 3:
                            inputNum = 30;
                            break;
                        case 4:
                            inputNum = 40;
                            break;
                        case 5:
                            inputNum = 50;
                            break;
                        case 6:
                            inputNum = 60;
                            break;
                        case 7:
                            inputNum = 70;
                            break;
                        case 8:
                            inputNum = 80;
                            break;
                        case 9:
                            inputNum = 90;
                            break;
                        case 10:
                            inputNum = 100;
                            break;
                        case 12:
                            inputNum = 120;
                            break;
                        case 13:
                            inputNum = 130;
                            break;
                        case 14:
                            inputNum = 140;
                            break;
                        case 15:
                            inputNum = 150;
                            break;
                    }
                    if (inputNum / 10 == cardNum) {
                        inputNum *= 3;
                    }
                    if (inputSuit.equals( suit )) {
                        inputNum *= 2;
                    }
                    result += inputNum;
                }
                System.out.println( result );
            }

        }
           //
        }


