import java.util.*;

/**
 * Created by tanya on 4/19/2016.
 */
public class DraginArmy {
    public static void main(String[] args) {
        Scanner scn = new Scanner( System.in );
        LinkedHashMap<String, TreeMap<String, int[]>> dragons = new LinkedHashMap<>();
        int number = Integer.parseInt( scn.nextLine() );
        int damage = 0;
        int health = 0;
        int armor = 0;
        for (int i = 0; i < number; i++) {
            String[] line = scn.nextLine().split( " " );
            String type = line[0];
            String name = line[1];
            if (line[2].equals( "null" )) {
                damage = 45;
            } else {
                damage = Integer.parseInt( line[2] );
            }
            if (line[3].equals( "null" )) {
                health = 250;
            } else {
                health = Integer.parseInt( line[3] );
            }
            if (line[4].equals( "null" )) {
                armor = 10;
            } else {
                armor = Integer.parseInt( line[4] );
            }
            if (!dragons.containsKey( type )) {
                dragons.put( type, new TreeMap<>() );
            }
            if (!dragons.get( type ).containsKey( name )) {
                dragons.get( type ).put( name, new int[3] );
            }
            dragons.get( type ).get( name )[0] = damage;
            dragons.get( type ).get( name )[1] = health;
            dragons.get( type ).get( name )[2] = armor;
        }


        for (Map.Entry<String, TreeMap<String, int[]>> result : dragons.entrySet()) {
                double[] avg = calculateAverage( result.getValue() );
                System.out.print( result.getKey() + "::" );
                System.out.printf( "(%.2f/%.2f/%.2f)", avg[0], avg[1], avg[2] );
                System.out.println();
                for (Map.Entry<String, int[]> title : result.getValue().entrySet()) {
                    System.out.printf( "-%s -> damage: %d, health: %d, armor: %d", title.getKey(),
                            title.getValue()[0], title.getValue()[1], title.getValue()[2] );
                    System.out.println();

                }

            }
        }

    private static double[] calculateAverage(TreeMap<String, int[]> map) {
        int damages=0;
        int healths=0;
        int armors=0;
        double count=map.size();
        for(Map.Entry<String,int[]>res:map.entrySet()){
            damages+=res.getValue()[0];
            healths+=res.getValue()[1];
            armors+=res.getValue()[2];
        }
        return new double[]{
                damages/count,
                healths/count,
                armors/count
        };
    }


}
