import java.util.Scanner;

/**
 * Create a method that finds the average of three numbers. Read in internet about java methods. Check the naming conventions.
 * Invoke your method and test it. Format the output to two digits after the decimal separator. The placeholder is %.2f
 */
public class GetAverage {
   public static double findAverage(double [] array){
        double sum=0;
        int count=0;
        double average=0;
        for(int i = 0; i<=array.length-1;i++){
          sum += array[i];
            count++;
        }

        if(count>0){
          average = (double)sum /(double) count;
        }else{
            average=0;
        }
       return average;
   }
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double a=Double.parseDouble(console.nextLine());
        double b=Double.parseDouble(console.nextLine());
        double c=Double.parseDouble(console.nextLine());
        double []array=new double[3];
        array[0]=a;
        array[1]=b;
        array[2]=c;
    double result=  findAverage(array);
         System.out.printf("%.2f",result);

}



}

