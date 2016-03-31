import java.util.Scanner;
import java.util.TreeMap;

/**
 * Created by tanya on 3/24/2016.
 */
public class StraightFlush {
    public static void main(String args[]) {
        Scanner console = new Scanner(System.in);
        String[] input = console.nextLine().split("[ ,]+");
        int count = 0;
        TreeMap<Integer, Character> result = new TreeMap<>();

        for (int i = 0; i < input.length; i++) {
            String s = input[i];
            int card = 0;
            if (input[i].length() == 3) {
                card = 10;
                result.put(10, s.charAt(2));
            } else {
                switch (s.charAt(0)) {
                    case '1':
                        card = 1;
                        break;
                    case '2':
                        card = 2;
                        break;
                    case '3':
                        card = 3;
                        break;
                    case '4':
                        card = 4;
                        break;
                    case '5':
                        card = 5;
                        break;
                    case '6':
                        card = 6;
                        break;
                    case '7':
                        card = 7;
                        break;
                    case '8':
                        card = 8;
                        break;
                    case '9':
                        card = 9;
                        break;
                    case 'J':
                        card = 11;
                        break;
                    case 'Q':
                        card = 12;
                        break;
                    case 'K':
                        card = 13;
                        break;
                }
                result.put(card, s.charAt(1));
            }
        }

        //  for(Map.Entry<Integer,Character> flush:result.entrySet() ) {
        // Character suit=flush.getValue(0);
        //Integer card=flush.getKey(0);
        for (int i = 0; i < result.entrySet().size(); i++) {
            Character suit = result.get(i);
            Character card = result.get(suit);


        }
    }
    //}

}