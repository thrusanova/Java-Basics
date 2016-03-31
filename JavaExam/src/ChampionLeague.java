import java.util.Scanner;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 * Created by tanya on 3/28/2016.
 */
public class ChampionLeague {
    public static void  main (String args[]) {
        Scanner console = new Scanner( System.in );
        TreeMap<String, TreeSet<String>> matches = new TreeMap<>();
        TreeMap<Integer, String> winners = new TreeMap<>();
        String input = console.nextLine();
        int startP=0;
        while (!input.equals( "Stop" )) {
            String str = " | ";
            input = input.replace( str, "&" );
            String[] result = input.split( "&" );
            String team1 = result[0];
            String team2 = result[1];
            if (!matches.containsKey( team1 )) {
                matches.put( team1, new TreeSet<String>() );
            }
            TreeSet<String> oponents = matches.get( team1 );
            if (!oponents.contains( team2 )) {
                oponents.add( team2 );
            }
            matches.put( team1, oponents );

            if (!matches.containsKey( team2 )) {
                matches.put( team2, new TreeSet<String>() );
            }
            TreeSet<String> oponents2 = matches.get( team2 );
            if (!oponents2.contains( team1 )) {
                oponents2.add( team1 );
            }
            matches.put( team2, oponents2 );
            if (!winners.containsValue(team1)){
               winners.put(startP,team1);
            }
            if(!winners.containsValue(team2)){
                winners.put( startP,team2 );
            }
            int team1Scores = 0;
            int team2Scores = 0;
            String[] matches1 = result[2].split( ":" );
            team1Scores += Integer.parseInt( matches1[0] );
            team2Scores += Integer.parseInt( matches1[1] );
            String[] matches2 = result[3].split( ":" );
            team2Scores += Integer.parseInt( matches1[0] );
            team1Scores += Integer.parseInt( matches1[1] );
            int startpoins=0;
            if (team1Scores>team2Scores){
               startpoins++;
                winners.put(startP+startpoins,team1);
            }
            if (team1Scores<team2Scores){
                startpoins++;
                winners.put(startP+startpoins,team2);
            }
            else {
                if(Integer.parseInt(matches1[1])<Integer.parseInt(matches2[1])){

                }
            }
        }
     input=console.nextLine();
    }
}
