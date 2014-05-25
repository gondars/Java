/*
 * Create a class Product to hold products, which have name (string) and price (decimal number). Read from a text file named "Input.txt" a list of 
 * products. Each product will be in format name + space + price. You should hold the products in objects of class Product. Sort the products by price 
 * and write them in format price + space + name in a file named "Output.txt". Ensure you close correctly all used resources.
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;
import java.util.Scanner;
 
 
public class _09_ListOfProducts {
        public static void main(String args[]) {
 
                Locale.setDefault(Locale.ROOT);
                File file = new File("InputProblem9.txt");
                ArrayList<Product> products = new ArrayList<Product>();
                try {
                        Scanner sc = new Scanner(file);
                        while (sc.hasNext()) {
                                products.add(new Product(sc.next(), sc.nextDouble()));
                        }
                } catch (FileNotFoundException e) {
                        System.out.println("Error");
                }
               
                Collections.sort(products);
                try {
                        PrintWriter pw = new PrintWriter (new File("output.txt"));
                        for (Product product : products) {
                                pw.println(product.toString());
                        }
                        pw.close();
                } catch (FileNotFoundException e) {
                        e.printStackTrace();
                }
               
        }
 
       
       
}
class Product implements Comparable <Product>{
        private String name;
        private double price;
        Product (String name, double price) {
                this.name = name;
                this.price = price;
        }
        @Override
        public String toString() {
                DecimalFormat formatter = new DecimalFormat("#0.00");
                return formatter.format(this.price) + " " + this.name;
        }
        @Override
        public int compareTo(Product arg) {
                if(this.price < arg.price)
                        return -1;
                else if (this.price > arg.price)
                        return 1;
                return 0;
        }
}