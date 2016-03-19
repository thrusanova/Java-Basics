import java.io.*;

/**
 * Write a program that reads a list of words from the file words.txt and finds the count of vowels (гласни букви), consonants (съгласни) and other punctuation marks. Since English is a bit tricky, assume that a, e, i, o, u are vowels and all others are consonants. Punctuation marks are (!,.?). Do not count whitespace.
 Write the results in file count-chars.txt.

 */
public class CountCharacter {
    public  static  void main (String args[]) throws IOException {
      FileReader fileReader  = new FileReader(new File("words.txt"));
      PrintWriter printer=new PrintWriter(new File("count-chars.txt"));
        int input=fileReader.read();
        int vowels=0;
        int consonants=0;
        int punctoations=0;
        while (input!=-1) {
            char symbol=(char) input;
            if (Character.isLetter(symbol)){
                if (symbol=='a' || symbol=='i' || symbol=='o'
                        || symbol=='u' || symbol=='e') {
                    vowels++;
                }
                else  {
                    consonants++;
                }
            }
            else if (symbol=='!' || symbol=='.' || symbol==',' || symbol=='?') {
                punctoations++;
            }
            input=fileReader.read();
            if (input==-1) {
                break;
            }
        }
        printer.write(String.format("Vowels: %d%n Consonants: %d%n Punctuation: %d%n",vowels,consonants,punctoations));
        fileReader.close();
        printer.close();

    }
}
