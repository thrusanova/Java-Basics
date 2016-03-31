import java.util.*;

/**
 * 192.168.0.11 peter 33
 * //Treeset ipAdress-set of ipAddresses
 */
public class LogAggregators {
    public static void main (String args[]) {
        Scanner console=new Scanner(System.in);
        int number=Integer.parseInt(console.nextLine());
        HashMap<String,TreeSet<String>>ipAddresses=new HashMap<>();
        TreeMap<String,Integer>durations= new TreeMap<>();
        //String input="";
        for (int i = 0; i < number; i++) {
           String  input=console.nextLine();
            String [] str=input.split(" ");
            String ip = str[0];
            String name = str[1];
            int duration =Integer.parseInt(str[2]);
            Integer  durr=durations.get(name);
            if (durr==null) {
                durr=0;
            }
            durations.put(name,durr+duration);
            TreeSet<String>ipSet=ipAddresses.get(name);//ekstact ip adresses by name
            if(ipSet==null) {
                ipSet=new TreeSet<>();
            }
            ipSet.add(ip);//get ip by name
            ipAddresses.put(name,ipSet);

        }
        for (Map.Entry<String,Integer>result:durations.entrySet()) {
            String name=result.getKey();
            int duration=result.getValue();
            TreeSet<String>ipSet=ipAddresses.get(name);
            System.out.println(name+": "+duration+ " " +ipSet);
        }
    }
}
