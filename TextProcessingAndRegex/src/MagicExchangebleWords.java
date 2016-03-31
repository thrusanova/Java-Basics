import java.util.HashMap;
import java.util.Scanner;

/**
 * CWrite a method that takes as input two strings of equal length, and returns Boolean if they are exchangeable or not.
 * Exchangeable are words where the characters in the first string can be replaced to get the second string. Example:
 * egg and add are exchangeable, but aabbccbb and nnooppzz are not. (First bb corresponds to oo, but second bb corresponds to zz)
 */
public class MagicExchangebleWords {
    public static void main (String args[]){
        Scanner scn=new Scanner(System.in);
        String str=scn.nextLine();
        String [] input=str.split(" ");
        String first=input[0];
        String second=input[1];
        boolean res=false;
        HashMap<Character,Character> dict=new HashMap<>();
        for (int i = 0; i < first.length(); i++) {
            if (!dict.containsKey(first.charAt(i))){
                if (!dict.containsValue(second.charAt(i))) {
                    dict.put(first.charAt(i),second.charAt(i));
                }
            }
        }

        for (int i = 0; i < first.length(); i++) {
            if (dict.containsKey(first.charAt(i))) {
                if (dict.get(first.charAt(i)) != second.charAt(i)) {
                    res = false;
                } else {
                    res = true;
                }
            }
            else  {
                res=false;
            }
        }
        System.out.print(res);
    }
}
