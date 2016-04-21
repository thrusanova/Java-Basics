import java.util.Arrays;
import java.util.Scanner;

/* Name of the class has to be "Main" only if the class is public. */
public class Pyramid
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner console=new Scanner(System.in);
        int number =Integer.parseInt(console.nextLine());
        String  n=console.nextLine();
        int first =Integer.parseInt(n.trim());
        String result=first+ ", ";
        int count=1;
        for(int i=1;i<number;i++){
            String  s=console.nextLine();
            String [] input=s.trim().split("[ ]+");
            int [] arr=new int[input.length];
            for(int j=0;j<input.length;j++){
                arr[j]=Integer.parseInt(input[j]);;
            }
            Arrays.sort(arr);

            for (int anArr : arr) {
                if (anArr >= first + 1) {
                    result += anArr + ", ";
                    first = anArr;
                    count++;
                    break;
                }

            }
        }
        System.out.print(result.substring(0,result.length()-2));

        System.out.println();
    }
}