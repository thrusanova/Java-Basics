import java.util.Scanner;

/**
 * Created by tanya on 4/2/2016.
 */
public class Gandalf {
    public static void  main (String args[]) {
        Scanner console = new Scanner( System.in );
        int startPoints=Integer.parseInt(console.nextLine());
        String [] input = console.nextLine().toLowerCase().split( "[^a-zA-Z]+" );
        int result=startPoints;
        for (String str:input){
            switch (str){
                case "cram":result+=2;break;
                case "melon":result+=1;break;
                case "honeycake":result+=5;break;
                case "lembas":result+=3;break;
                case "mushrooms":result-=10;break;
                case "apple":result+=1;break;
                default:result-=1;break;
            }
        }
        System.out.println(result);
        if (result<-5){
            System.out.println("Angry");
        }
        else if (result>=-5 && result<0)
        {
            System.out.println("Sad");
        }
        else if (result>=0 && result<=15)
        {
            System.out.println("Happy");
        }
        else {
            System.out.println("Special JavaScript mood");
        }


    }

}
