import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 * •	steve 8 apples
 */
public class orders {
    public  static void main (String args[]) {
        Scanner console=new Scanner(System.in);
        int number = Integer.parseInt(console.nextLine());
        LinkedHashMap<String,TreeMap<String,Integer>> orders=new LinkedHashMap<>();
        for (int i = 0; i < number; i++) {
           String input = console.nextLine();
            String [] str = input.split(" ");
            String name=str[0];
            int amount = Integer.parseInt(str[1]);
            String fruit=str[2];

            if (!orders.containsKey(fruit)) {
                orders.put(fruit, new TreeMap<String, Integer>());
            }
                TreeMap<String,Integer>quantities=orders.get(fruit);

                int fruitCount=0;
                if (quantities.containsKey(name)) {
                    fruitCount = quantities.get(name);
                }
                    quantities.put(name,fruitCount+amount);
}

        for (String fruit: orders.keySet() )
        {
            System.out.print(fruit + ": " );
            TreeMap<String,Integer>amounts=orders.get(fruit);
            boolean first=true;
            for (Map.Entry<String,Integer>quantity:amounts.entrySet()){

                if (!first){
                    System.out.print(", ");
                }
                first=false;
                String name=quantity.getKey();
                int amount=quantity.getValue();
                System.out.print(name+ " "+amount);
            }
            System.out.println();
        }
    }
}
