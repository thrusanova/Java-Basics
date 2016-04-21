import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by tanya on 4/10/2016.
 */
public class LogParser {
    public static void main(String[] args) {
        Scanner scn = new Scanner( System.in );
        LinkedHashMap<String, LinkedHashMap<String,ArrayList<String>>> projects = new LinkedHashMap<>();
        String line = scn.nextLine();
        while (!line.equals( "END" )){
            Pattern pattern = Pattern.compile( "\\\"Project\\\":\\s+\\[\\\"(.*?)\\\"],+\\s+\\\"Type\\\":\\s+\\[\\\"(.*?)\\\"],+\\s+\\\"Message\\\":+\\s+\\[\\\"(.*?)\\\"]" );
            Matcher m = pattern.matcher( line );
            while (m.find()) {
                String name=m.group(1);
                String type=m.group(2);
                String message=m.group(3);
                if(!projects.containsKey(name)){
                    projects.put(name,new LinkedHashMap<>(  ) );
                    projects.get(name).put("Critical",new ArrayList<>(  ));
                    projects.get(name).put( "Warnings",new ArrayList<>(  ));
                }
                if (type.equals( "Critical" )) {
                    projects.get( name ).get( "Critical" ).add( message );
                }
                    else{
                        projects.get( name ).get( "Warnings" ).add( message );
                    }
                }
            line=scn.nextLine();
                }
        projects.entrySet().stream()
                .sorted((e1,e2) -> {
                    int total2 = (e2.getValue().get("Critical").size() + e2.getValue().get("Warnings").size());
                    int total1 = (e1.getValue().get("Critical").size() + e1.getValue().get("Warnings").size());

                    if (total1 != total2) {
                        return Integer.compare(total2, total1);
                    }
                    return e1.getKey().compareTo(e2.getKey());
                }).forEach( item-> {
          System.out.println(item.getKey()+":");
          System.out.println("Total Errors: "+(item.getValue().get( "Critical" ).size()+item.getValue().get("Warnings").size()));
          System.out.println( "Critical: "+item.getValue().get( "Critical" ).size( ) );
          System.out.println( "Warnings: "+item.getValue().get( "Warnings" ).size() );

        System.out.println("Critical Messages:");
      printMessages(item.getValue().get( "Critical" ));
          System.out.println("Warning Messages:");
          printMessages(item.getValue().get( "Warnings" ));
            System.out.println();
      });


    }

    private static void printMessages(ArrayList<String> critical) {
        if (critical.size()<1){
            System.out.println("--->None");
            return;
        }

        critical.stream().sorted((ar1,ar2)-> {
           if(ar1.length()!=ar2.length()){
               return Integer.compare( ar1.length(),ar2.length() );
           }
            return  ar1.compareTo( ar2 );
            }).forEach(ar1-> System.out.println("--->"+ar1));
    }

}

