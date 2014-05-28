package _03_LoopsMethodsClasses;

import java.io.BufferedReader;
import java.io.FileReader;



public class _08_SumNumbersFromATextFile {

	public static void main(String[] args) {
		 try{
             @SuppressWarnings("resource")
			BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
             String line = null;
             int result = 0;
             while ((line = reader.readLine()) != null) {
                 result+=Integer.parseInt(line);
             }
             System.out.println(result);
     }
     catch(Exception ex){
             System.out.println("(missing file)");
     }
	}

}
