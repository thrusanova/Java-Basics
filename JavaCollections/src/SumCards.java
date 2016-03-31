import java.util.Scanner;

/**
 * Created by tanya on 3/20/2016.
 */
public class SumCards {
    public static void main (String args[]) {
        Scanner console=new Scanner(System.in);
        String [] input=console.nextLine().split(" ");
        int sum=0;

        int [] array = new int[input.length];
      for  (int j = 0; j < input.length; j++){

            input[j]=input[j].substring(0,input[j].length()-1);
        }
        for (int i = 0; i < input.length; i++) {

            if (input[i].equals("J")){
                array[i]=12;
            }
        else    if (input[i].equals("Q")){
                array[i]=13;
            }
     else       if (input[i].equals("K")){
                array[i]=14;
            }
        else   if (input[i].equals("A")){
                array[i]=15;
            }
            else {
                array[i] = Integer.parseInt(input[i]);
            }
        }

        for (int i = 0; i < array.length-1; i++) {
            int count=1;
            int nums = array[i];
            if (array[i+1]==nums) {
                while (array[i + 1] == nums) {
                    count++;
                    i++;
                    if ( i>=array.length-1) {

                    break;
                    }
                }
            }
            else    {
                count=1;
            }
            if (count == 1) {
                switch (nums) {
                    case 2:sum+=2*count;break;
                    case 3:sum+=3*count;break;
                    case 4:sum+=4*count;break;
                    case 5:sum+=5*count;break;
                    case 6:sum+=6*count;break;
                    case 7:sum+=7*count;break;
                    case 8:sum+=8*count;break;
                    case 9:sum+=9*count;break;
                    case 10:sum+=10*count;break;
                    case 12:sum+=12*count;break;
                    case 13:sum+=13*count;break;
                    case 14:sum+=14*count;break;
                    case 15:sum+=15*count;break;
                }
            }
            else  {
                switch (nums) {
                    case 2:sum+=2 *2*count;break;
                    case 3:sum+=3 *2*count;break;
                    case 4:sum+=4*2*count;break;
                    case 5:sum+=5*2*count;break;
                    case 6:sum+=6*2*count;break;
                    case 7:sum+=7*2*count;break;
                    case 8:sum+=8*2*count;break;
                    case 9:sum+=9*2*count;break;
                    case 10:sum+=10*2*count;break;
                    case 12:sum+=12*2*count;break;
                    case 13:sum+=13*2*count;break;
                    case 14:sum+=14*2*count;break;
                    case 15:sum+=15*2*count;break;

                }
             //   count=1;
            }

            }
        if (array[array.length-2]!=array[array.length-1]){
            sum+=array[array.length-1];

        }
        System.out.println(sum);
    }
}

