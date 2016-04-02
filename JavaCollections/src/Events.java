




import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by tanya on 3/22/2016.
 */
public class Events {

    public static void main(String[] args) throws java.lang.Exception {

        Scanner console = new Scanner(System.in);
        int number = Integer.parseInt(console.nextLine());
        // TreeMap tree=new TreeMap<String,TreeMap<String,new ArrayList<DateTime>>>();
        TreeMap<String, TreeMap<String, ArrayList<String>>> towns = new TreeMap<>();
        //  TreeMap<String, String> towns = new TreeMap<>();
        for (int i = 0; i < number; i++) {

            String input = console.nextLine();
            Pattern pattern = Pattern.compile("^#{1}([a-zA-z]+):[ ]*@([a-zA-z]+)[ ]*(([01]?[0-9]:[0-5][0-9])|(2[0-3]:[0-5][0-9]))$");
            Matcher m = pattern.matcher(input);

            while (m.find()) {
                String person = m.group(1);
                String town = m.group(2);
                String time = m.group(3);
                if (!towns.containsKey(town)) {
                    towns.put(town, new TreeMap<String, ArrayList<String>>());
                }
                TreeMap<String, ArrayList<String>> hours = towns.get(town);
                ArrayList<String> times = new ArrayList<>();
                if (hours.containsKey(person)) {
                    times = hours.get(person);
                    hours.get(person).add(time);
                }
                if (!hours.containsValue(times)) {
                    hours.put(person, new ArrayList<>(Arrays.asList(time)));
                }

            }


        }
        String[] location = console.nextLine().split(" ");
        for (String town : towns.keySet()) {
            for (int i = 0; i < location.length; i++) {
                String s = location[i];

                if (s.contains(town)) {
                    int line = 1;
                    System.out.println(town + ": ");
                    TreeMap<String, ArrayList<String>> times = towns.get(town);
                    boolean first = true;

                    for (Map.Entry<String, ArrayList<String>> people : times.entrySet()) {
                        System.out.print(line + ". ");
                        //  if (!first){
                        // System.out.print(", ");
                        //    }
                        //  first=false;
                        String name = people.getKey();

                        Collections.sort(people.getValue());
                        String  hour = people.getValue().toString();
                        System.out.print(name + " -> " + hour.toString().substring(1,hour.length()-1));
                        System.out.println();
                        line++;
                    }
                    //   String divs = getDivisors(drome).toString().replace("\\[", "(").replace("\\]", ")")
                    // System.out.println();
                }
            }
        }
    }

}