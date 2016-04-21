import java.util.*;

/**
 * Created by tanya on 3/23/2016.
 */
public class ArangeNumbers {
    public static void main (String args[]) {
        Scanner console=new Scanner(System.in);
        String [] input=console.nextLine().split("[ ,]+");
        Map<String,String> numbersAsStr= new HashMap<>(  );
        Map<String,ArrayList<Integer>> sorted = new TreeMap<>();

        for (int i = 0; i < input.length; i++) {//1111\
            String s = input[i];
            if (s.length()==1){
                switch (s) {
                    case "0":numbersAsStr.put("zero",s);break;
                    case "1":numbersAsStr.put("one",s);break;
                    case "2":numbersAsStr.put("two",s);break;
                    case "3":numbersAsStr.put("three",s); break;
                    case "4":numbersAsStr.put("four",s);break;
                    case "5":numbersAsStr.put("five",s);break;
                    case "6":numbersAsStr.put("six",s);break;
                    case "7":numbersAsStr.put("seven",s);break;
                    case "8":numbersAsStr.put("eight",s);break;
                    case "9":numbersAsStr.put("nine",s);break;
                }
            } else {
                String st="";
                for (int j = 0; j < s.length(); j++) {

                    char str = s.charAt( j );


                    switch (str) {
                        case '0':
                            st += "zero-";
                            break;
                        case '1':
                            st += "one-";
                            break;
                        case '2':
                            st += "two-";
                            break;
                        case '3':
                            st += "three-";
                            break;
                        case '4':
                            st += "four-";
                            break;
                        case '5':
                            st += "five-";
                            break;
                        case '6':
                            st += "six-";
                            break;
                        case '7':
                            st += "seven-";
                            break;
                        case '8':
                            st += "eight-";
                            break;
                        case '9':
                            st += "nine-";
                            break;
                    }
                }
                st=st.substring( 0,st.length()-1);
                numbersAsStr.put(st,input[i]);
            }
            //
        }
        boolean first=true;
        for(Map.Entry<String,String>result :numbersAsStr.entrySet()){
            if (!first){
                System.out.print(", ");
            }
            first=false;

            String value=result.getValue();
            System.out.print(value);
        }
    }

}