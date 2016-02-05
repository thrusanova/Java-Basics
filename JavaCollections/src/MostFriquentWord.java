import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeMap;

/**
 * Write a program to find the most frequent word in a text and print it, as well as how many times it appears in format
 * "word -> count". Consider any non-letter character as a word separator. Ignore the character casing.
 * If several words have the same maximal frequency, print all of them in alphabetical order.
 */
public class MostFriquentWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] input=scanner.nextLine().split("[^a-zA-z]");
        TreeMap<String,Integer> dict=new TreeMap<String, Integer>();
        int count=0;
        ArrayList<String>list=new ArrayList<String>();
        for (int i = 0; i < input.length; i++) {
            String s = input[i].toLowerCase();
            if (!s.isEmpty()) {
                if (!dict.containsKey(s)) {
                    dict.put(s,1);
                }
                else {
                    dict.put(s,dict.get(s)+1);
                }
            }
        }
        for (String  str:dict.keySet()) {
            if (dict.get(str)>count){
                count=dict.get(str);
                list.clear();
                list.add(str);
            } else if (dict.get(str)==count) {
                list.add(str);
            }
        }
      for (String result:list) {
          System.out.printf("%s -> %d times%n",result,count);

        }
    }
}
