/**
 In most Poker games, the "full house" hand is defined as three cards of the same face + two cards of the same face,
 other than the first, regardless of the card's suits. The cards faces are "2", "3", "4", "5", "6", "7", "8", "9", "10",
 "J", "Q", "K" and "A".The card suits are "♣", "♦", "♥" and "♠".
 Write a program to generate and print all full houses and print their number
 */
public class FullHouse {
    public static void main(String args[]) {
        String [] face={"2","3","4","5","6","7","8","9","10","J","D","K","A" };
        String [] suit ={"♣", "♦", "♥", "♠" };
        int count=0;
        for (int a = 0; a < suit.length; a++) {
            for (int b = a+1; b < suit.length; b++) {
                for (int c = b+1; c < suit.length; c++) {
                        for (int i = 0; i < suit.length; i++) {
                            for (int j = i+1; j < suit.length; j++) {
                                for (int firstFace = 0; firstFace < face.length; firstFace++) {
                                     for (int secondFace = 0; secondFace < face.length; secondFace++) {
                                         if (firstFace!=secondFace) {
                                             System.out.println("("+face[firstFace]+suit[a]+ " "
                                                                 + face[firstFace]+suit[b]+" "
                                                                 +face[firstFace]+suit[c]+ " "
                                                                 +face[secondFace]+suit[i]+ " "
                                                                  +face[secondFace]+suit[j]+ ")"+ " ");
                                             count++;
                                         }
                                }

                            }

                        }
                        
                    }
                    
                }
                
            }
            
        }
        System.out.print(count + " full houses");
    }
}
