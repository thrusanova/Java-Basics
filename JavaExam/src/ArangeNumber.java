import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 * Created by tanya on 3/23/2016.
 */
public class ArangeNumber {
    public static void main (String args[]) {
        Scanner console=new Scanner(System.in);
        String [] input=console.nextLine().split("[ ,]+");
        TreeMap<String,StringBuilder> numbersAsStr= new TreeMap<>();
        StringBuilder words=new StringBuilder();
        StringBuilder digits=new StringBuilder();
        for (int i = 0; i < input.length; i++) {
            String s = input[i];
            if (s.length()==1){
                switch (s) {
                    case "0":numbersAsStr.put("zero",digits.append(s));break;
                    case "1":numbersAsStr.put("one",digits.append(s));break;
                    case "2":numbersAsStr.put("two",digits.append(s));break;
                    case "3":numbersAsStr.put("three",digits.append(s)); break;
                    case "4":numbersAsStr.put("four",digits.append(s));break;
                    case "5":numbersAsStr.put("five",digits.append(s));break;
                    case "6":numbersAsStr.put("six",digits.append(s));break;
                    case "7":numbersAsStr.put("seven",digits.append(s));break;
                    case "8":numbersAsStr.put("eight",digits.append(s));break;
                    case "9":numbersAsStr.put("nine",digits.append(s));break;
            }
                }
            else if (s.length()!=1){
                for (int j = 0; j < s.length(); j++) {
                    char c = s.charAt(j);
                    switch (c) {
                        case '0':numbersAsStr.put("zero",digits.append(c));break;
                        case '1':numbersAsStr.put("one",digits.append(c));break;
                        case '2':numbersAsStr.put("two",digits.append(c));break;
                        case '3':numbersAsStr.put("three",digits.append(c)); break;
                        case '4':numbersAsStr.put("four",digits.append(c));break;
                        case '5':numbersAsStr.put("five",digits.append(c));break;
                        case '6':numbersAsStr.put("six",digits.append(c));break;
                        case '7':numbersAsStr.put("seven",digits.append(c));break;
                        case '8':numbersAsStr.put("eight",digits.append(c));break;
                        case '9':numbersAsStr.put("nine",digits.append(c));break;
                    }
                  //numbersAsStr.put("-");
                }
            }
        }
        boolean first=true;
        for(Map.Entry<String, StringBuilder> result :numbersAsStr.entrySet()){
              if (!first){
             System.out.print(", ");
                }
              first=false;

            String value=result.getValue().toString();
            System.out.print(value);
        }
            }

        }
