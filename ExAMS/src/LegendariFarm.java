import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by tanya on 4/9/2016.
 */
public class LegendariFarm {
    public static void main(String args[]) {
        Scanner console = new Scanner( System.in );
        TreeMap<String, Integer> junk = new TreeMap<>();
        LinkedHashMap<String, Integer> result = new LinkedHashMap<>();
        result.put( "fragments", 0 );
        result.put( "motes", 0 );
        result.put( "shards", 0 );
        String getMaterial = "";
        while (true) {
            String input = console.nextLine();
            String[] str = input.split( " " );
            for (int i = 0; i < str.length - 1; i += 2) {
                int value = Integer.parseInt( str[i] );
                String material = str[i + 1].toLowerCase();
                int amount = 0;
                if (result.containsKey( material )) {
                    amount = result.get( material );

                    result.put( material, amount + value );
                    if (result.get( material ) >= 250) {
                        result.put( material, result.get( material ) - 250 );
                        getMaterial = material;
                        break;
                    }
                } else {
                    if (!junk.containsKey( material )) {
                        junk.put( material, 0 );
                    }

                        junk.put(material, junk.get( material )+ value );

                    }
                }

            if (getMaterial.length()>0){
                break;
            }

        }
        Stream<Map.Entry<String,Integer>> sorted = result.entrySet().stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()));
            System.out.println(getLegendary(getMaterial));
        for (Map.Entry<String,Integer>material: sorted.collect( Collectors.toList()) ){

            System.out.println(material.getKey()+ ": "+material.getValue() );
            }
        for (Map.Entry<String,Integer>trash:junk.entrySet() ){
            System.out.println(trash.getKey()+ ": "+trash.getValue() );
        }
        }
    public static String getLegendary(String material) {
        if (material.equals( "fragments" )){
            return "Valanyr obtained!";
        } else if (material.equals( "motes" )) {
            return  "Dragonwrath obtained!";
        }
        return "Shadowmourne obtained!";
    }
}

