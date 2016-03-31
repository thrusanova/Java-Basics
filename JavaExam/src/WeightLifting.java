import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 * Created by tanya on 3/26/2016.
 */
public class WeightLifting {
    public static void  main (String args[]) {
        Scanner console = new Scanner( System.in );
        int number=Integer.parseInt(console.nextLine());
        TreeMap<String,TreeMap<String,Long>>result=new TreeMap<>( );
        for (int i = 0; i < number; i++) {
            String [] input=console.nextLine().split(" ");
            String name=input[0];
            String exersise=input[1];
            Long value=Long.parseLong(input[2]);
            if (!result.containsKey(name)) {
                result.put(name,new TreeMap<String, Long>());
            }
            TreeMap<String,Long>totalWeight=result.get(name);
            long weigthCount=0;
            if(totalWeight.containsKey(exersise)){
                weigthCount=totalWeight.get(exersise);
            }
            totalWeight.put(exersise,weigthCount+value);
        }
        for (String name:result.keySet()){
            System.out.print(name+" : " );
            TreeMap<String,Long>values=result.get(name);
            boolean first=true;
            for (Map.Entry<String,Long>exc:values.entrySet()){
                if (!first) {
                    System.out.print( ", " );
                }
                first=false;
                String exersice=exc.getKey();
                long weight=exc.getValue();
                System.out.print(exersice+ " - "+weight+" kg" );
            }
            System.out.println();
        }
    }
}
