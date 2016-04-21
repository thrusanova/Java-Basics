import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 * Created by tanya on 4/13/2016.
 */
public class SchoolSystem {
    public static void main(String args[]) {
        Scanner console = new Scanner( System.in );
        int rows = Integer.parseInt( console.nextLine() );
        TreeMap<String, TreeMap<String, ArrayList<Integer>>> students = new TreeMap<>();

        int count = 0;
        for (int i = 0; i < rows; i++) {
            String[] input = console.nextLine().split( "\\s+" );
            String name = input[0] + " " + input[1];
            String subject = input[2];
            int score = Integer.parseInt( input[3] );
            TreeMap<String, ArrayList<Integer>> subjects = new TreeMap<>();
            if (students.containsKey( name )) {
                subjects = students.get( name );

                if (!subjects.containsKey( subject )) {
                    subjects.put( subject, new ArrayList<>() );
                }
                subjects.get( subject ).add( score );

                //  ArrayList<Integer>marks=subjects.get( subject );

            } else {
                ArrayList<Integer> marks = new ArrayList<>();
                marks.add( score );
                subjects.put( subject, marks );
                students.put( name, subjects );

            }
        }
        // for (String fullName : students.keySet()) {

        for (Map.Entry<String, TreeMap<String, ArrayList<Integer>>> result : students.entrySet()) {
            String fullName = result.getKey();
            TreeMap<String, ArrayList<Integer>> marks = result.getValue();
            System.out.print( fullName + ": " );
            System.out.print( "[" );
            boolean first = true;
            for (Map.Entry<String, ArrayList<Integer>> point : marks.entrySet()) {
                String sub = point.getKey();
                ArrayList<Integer> res = point.getValue();
                if (!first) {
                    System.out.print( ", " );
                }
                first = false;

                int sum = 0;
                for (double grade : res) {
                    sum += grade;
                }

                double average = (double) sum / res.size();
                System.out.printf( "%s - %.2f", sub, average );

            }
            System.out.println( "]" );

        }

    }
}