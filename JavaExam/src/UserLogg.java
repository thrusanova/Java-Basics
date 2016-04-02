import java.util.*;

/**
 * IP=192.23.30.41 message='Hello&yall.' user=destroyer
 */
public class UserLogg {
    public static void main(String args[]) {
        Scanner console = new Scanner( System.in );
        TreeMap<String,LinkedHashMap<String,Integer>> result=new TreeMap<>();
        String input=console.nextLine();
        while(!input.equals("end")) {
            String ip=(input.split(" ")[0].split("IP=")[1]);
            String user=(input.split(" ")[2].split("user=")[1]);
            if (!result.containsKey(user)) {
                result.put(user,new LinkedHashMap<>( ));
            }
            LinkedHashMap<String,Integer>ipAdrress=result.get(user);
            if (!ipAdrress.containsKey(ip)){
                ipAdrress.put(ip,1);
            }
            else {
                ipAdrress.put( ip, ipAdrress.get(ip)+1);
            }
            result.put( user,ipAdrress );
            input=console.nextLine();
        }
        for (Map.Entry<String,LinkedHashMap<String,Integer>>user:result.entrySet()){
            String key=user.getKey();
            LinkedHashMap<String,Integer> value=user.getValue();
            System.out.println(key+":");
            String out="";
            for (Map.Entry<String,Integer>ip:value.entrySet()) {
                String ipAdd=ip.getKey();
                Integer count=ip.getValue();
                out+=String.format( "%s => %d, ",ipAdd,count);
            }
            out = out.substring(0, out.length()-2)+'.';
            System.out.println(out);

        }



    }
}