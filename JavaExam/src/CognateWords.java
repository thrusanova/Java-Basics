import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by tanya on 3/23/2016.
 */
public class CognateWords {
    public static void  main (String args[]) {
        Scanner console=new Scanner(System.in);
        String input=console.nextLine();
        ArrayList<String>list=new ArrayList<>();
        TreeSet<String>result=new TreeSet<>();
        Pattern pattern = Pattern.compile("[A-z]+");
        Matcher m = pattern.matcher(input);
        int count=0;
        while (m.find()) {
                String st=m.group();
                list.add(st);
        }
        for (int i = 0; i < list.size(); i++) {
            String a = list.get(i);
            for (int j = i; j < list.size(); j++) {
                String b = list.get(j);
                for (int k = 0; k < list.size(); k++) {
                    String c = list.get(k);
                    if ((a+b).equals(c) ) {
                        count++;
                       result.add(String.format("%s|%s=%s",a,b,c));
                       // System.out.printf("%s|%s=%s",a,b,c);
                      // System.out.println();
                    }
                     if ((a+c).equals(b)){
                        count++;
                         result.add(String.format("%s|%s=%s",a,c,b));
                       // System.out.printf("%s|%s=%s",a,c,b);
                      // System.out.println();
                    }
                     if ((b+c).equals(a)){
                        count++;
                         result.add(String.format("%s|%s=%s",b,c,a));
                      // System.out.printf("%s|%s=%s",b,c,a);
                      // System.out.println();
                    }
                }


            }
        }
        if (count==0){
            System.out.print("No");
        }
        else {
            for (String res : result)
                System.out.println(res);
        }
    }
}
