package _03_LoopsMethodsClasses;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils.Collections;




public class _09_ListProducts {

	
	public static void main(String[] args) {
		ArrayList<Product> products = new ArrayList<>();
        
        try {
                BufferedReader fileReader = new BufferedReader(new FileReader("input.txt"));
                File fileProducts = new File("products.txt");
                fileProducts.createNewFile();
                BufferedWriter fileWriter = new BufferedWriter(new FileWriter("products.txt"));
                while (true) {
                        String line = fileReader.readLine();
                        if (line == null) {
                                fileReader.close();
                                break;
                        }
                        String[] input = line.split(" ");
                        products.add(new Product(input[0], new BigDecimal(input[1])));
                }
                Collections.sort(products);
                for (Product product : products) {
                        System.out.println(product.getName() + " " + product.getPrice());
                        fileWriter.write(product.getName() + " " + product.getPrice());
                        fileWriter.newLine();
                }
                fileWriter.close();
        }catch (IOException e) {
                System.out.println("Error!");
        }
	}
	class Product implements Comparable<Product> {
        private String name;
        private BigDecimal price;
       
        public Product(String name, BigDecimal price) {
                super();
                this.name = name;
                this.price = price;
        }
 
        public String getName() {
                return name;
        }
        public void setName(String name) {
                this.name = name;
        }
        public BigDecimal getPrice() {
                return price;
        }
        public void setPrice(BigDecimal price) {
                this.price = price;
        }
        public int compareTo(Product compareProduct) {
                 
                BigDecimal comparePrice = ((Product)compareProduct).getPrice();

                return this.price.compareTo(comparePrice);
 
        }      
	}
}

