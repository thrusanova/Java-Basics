import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;


/**
 * Created by tanya on 3/28/2016.
 */
public class ChampionLeague {
    public static void main(String args[]) {
        Scanner console = new Scanner( System.in );
        TreeMap<String, TreeSet<String>> matches = new TreeMap<>();
        TreeMap<String, Integer> winners = new TreeMap<>();
        String input = console.nextLine();
        int startP = 0;
        int wins=0;
        while (!input.equals( "stop" )) {
          //  int wins = 0;
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
            if (!winners.containsKey( team1 )) {
                winners.put( team1, wins );
            }

            if (!winners.containsKey( team2 )) {
                winners.put( team2, wins );
            }
            int team1Scores = 0;
            int team2Scores = 0;
            String[] matches1 = result[2].split( ":" );
            team1Scores += Integer.parseInt( matches1[0] );
            team2Scores += Integer.parseInt( matches1[1] );
            String[] matches2 = result[3].split( ":" );
            team2Scores += Integer.parseInt( matches2[0] );
            team1Scores += Integer.parseInt( matches2[1] );
            int wins1 = 0;
            int wins2 = 0;
              int win=0;

            if (team1Scores > team2Scores) {

                winners.put( team1, winners.get(team1)+1 );
                //wins += 1;
            } else if (team1Scores < team2Scores) {
              //  wins2++;
                winners.put( team2, winners.get(team2)+1);
            } else {
                if (Integer.parseInt( matches1[1] ) < Integer.parseInt( matches2[1] )) {
                   // wins1++;
                    winners.put( team1, winners.get(team1)+1);
                } else {
                //    wins2++;
                    winners.put( team2, winners.get(team2)+1 );
                }
            }
            input = console.nextLine();
        }
        Stream<Map.Entry<String,Integer>> sorted = winners.entrySet().stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()));

        for (Map.Entry<String, Integer> res : sorted.collect( Collectors.toList())) {
            String team=res.getKey();
            Integer wink= res.getValue();
            System.out.println(team);
            System.out.printf("- Wins: %s%n",wink);

                TreeSet<String> value2 = matches.get(team);

                System.out.printf( "- Opponents: %s",String.join( ", ",value2));
            System.out.println();
            }
        }
    }




