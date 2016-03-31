import java.math.BigDecimal;
import java.util.Scanner;

/**
 * Created by tanya on 3/21/2016.
 */
public class SimpleExpression {
    public static void main (String args[]) {
        Scanner console = new Scanner(System.in);
        String input = console.nextLine();
        String str=input.replace(" ","");
        String [] numbers=str.split("[^0-9.]+");
        String [] operator =str.split("[0-9.]+");

       // int sum=0;
        BigDecimal sum=new BigDecimal(numbers[0]);
        for (int i = 0; i < operator.length; i++) {
            BigDecimal num=new BigDecimal(numbers[i]);
            if (operator[i].equals("-")) {
                sum=sum.subtract(num);
            }
            else if(operator[i].equals("+")){
                sum=sum.add(num);
            }

        }

        System.out.println(sum);
    }
}
