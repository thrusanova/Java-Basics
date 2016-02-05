import java.io.*;
import java.math.BigDecimal;
import java.util.ArrayList;

/**
 *Create a class Product to hold products, which have name (string) and price (decimal number).
 * Read from a text file named "Products.txt" a list of product with prices and keep them in a list of products.
 * Each product will be in format name + space + price. You should hold the products in objects of class Product.
 * Read from a text file named "Order.txt" an order of products with quantities.
 * Each order line will be in format product + space + quantity.
 * Calculate and print in a text file "Output.txt" the total price of the order. Ensure you close correctly all used resources.
 */
public class OrderList {

    public static void  main (String args[]) throws IOException {
            FileReader fileReader = new FileReader("product.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            ArrayList<Product> products = new ArrayList<Product>();
            String productList = bufferedReader.readLine();
            while (productList != null) {
                String[] input = productList.split(" ");
                String prName = input[0];
                BigDecimal prPrice = new BigDecimal(input[1]);
                Product currProduct = new Product(prName, prPrice);
                products.add(currProduct);
                productList = bufferedReader.readLine();
            }
            FileReader reader = new FileReader("order.txt");
            BufferedReader bReader = new BufferedReader(reader);
             BigDecimal totalSum = BigDecimal.ZERO;
            String orderList = bReader.readLine();

            while (orderList != null) {
                String[] inp = orderList.split(" ");
                BigDecimal quantity = new BigDecimal(inp[0]);
                String name = inp[1];
                for (Product product : products) {
                    if (product.getName().equals(name)) {
                        BigDecimal currPrice = (product.getPrice().multiply(quantity));
                        totalSum = totalSum.add(currPrice);
                    }
                }
                orderList = bReader.readLine();
            }
        BufferedWriter  bufferedWriter=new BufferedWriter(new FileWriter("outputOrder.txt"));
        String total=String.format("%.1f ",totalSum);
        bufferedWriter.write(total);
        fileReader.close();
        reader.close();
        bufferedWriter.close();
        }

    }
