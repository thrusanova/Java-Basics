import java.io.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;

/**
 * Create a class Product to hold products, which have name (string) and price (decimal number).
 * Read from a text file named "Input.txt" a list of products. Each product will be in format name + space + price.
 * You should hold the products in objects of class Product. Sort the products by price
 * and write them in format price + space + name in a file named "Output.txt". Ensure you close correctly all used resources.
 */
public class ListOfProducts {
    public static void main(String args[]) throws IOException {
        FileReader fileReader = new FileReader("input9.txt");
        BufferedReader bufferedReader=new BufferedReader(fileReader);
        String line=bufferedReader.readLine();
        ArrayList<Product>list=new ArrayList<Product>();
        while (line!=null) {
              String [] input= line.split(" ");
            String name=input[0];
            BigDecimal price=new BigDecimal(input[1]);
            Product product=new Product(name,price);
            list.add(product);
            line=bufferedReader.readLine();
        }
        Collections.sort(list);
        bufferedReader.close();
        BufferedWriter  bufferedWriter=new BufferedWriter(new FileWriter("output9.txt"));
        for (Product pr:list) {
            String p=String.format("%.2f %s%n",pr.getPrice(),pr.getName());
            bufferedWriter.write(p);
        }
        bufferedWriter.close();
    }
}