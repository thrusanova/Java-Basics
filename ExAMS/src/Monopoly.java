import java.util.Scanner;

/**
 * Created by tanya on 4/4/2016.
 */
public class Monopoly {
    public static void main (String args[]) {
        Scanner scn=new Scanner( System.in );
        int row=Integer.parseInt(scn.nextLine().split(" ")[0]);
       // int col=Integer.parseInt(scn.nextLine().split(" ")[1]);
        int money=50;
        int turns=0;
        int hotels=0;
        for (int i = 0; i < row; i++) {

            String input=scn.nextLine();
            for (int j = 0; j < input.length(); j++) {
                char ch='0';
                if (i % 2==0){
                 ch = input.charAt( j );
            }
                else {
                    ch=input.charAt( input.length()-j-1 );
                }
                switch (ch){
                    case 'H':
                        hotels++;
                        System.out.printf("Bought a hotel for %d. Total hotels: %d.%n",money,hotels);
                        money=0;
                      //  turns++;

                        break;
                    case 'J':
                        System.out.printf("Gone to jail at turn %d.%n",turns);
                        turns+=2;
                        money+=2 *(hotels*10);
                        break;
                    case 'S':
                        int index=0;
                        if (i % 2==0) {
                            index=j;
                        }
                        else {
                            index=input.length()-j-1;
                        }
                        int spendMoney=Math.min((index+1)*(i+1),money);
                        money-=spendMoney;
                        System.out.printf("Spent %d money at the shop.%n",spendMoney);
                        break;
                }
                money+=10*hotels;
                turns++;
            }

        }
        System.out.println("Turns "+turns);
        System.out.println("Money "+money);


    }
}
