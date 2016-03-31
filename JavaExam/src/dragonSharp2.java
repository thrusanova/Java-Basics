import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by tanya on 3/24/2016.
 */
class DragonSharp2 {
    public static void main(String args[]) {
        Scanner console = new Scanner(System.in);
        int num = Integer.parseInt(console.nextLine());
        Pattern pattern = Pattern.compile("(.+?)\"(.+?)\";");
        int count=1;
        for (int i = 0; i < num; i++) {
            String input = console.nextLine();
            Matcher m = pattern.matcher(input);
            boolean correct=true;
            if (m.find()) {
                String str=m.group(1);
                String output=m.group(2);
                // System.out.println(str);
                // System.out.println(output);
                count++;
            }
        }
        if (count==num+1) {

        }
        else {
            System.out.printf( "Compile time error @ line %s",count );
        }

    }


}