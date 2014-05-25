/*
 * Write a program to read a text file "Input.txt" holding a sequence of integer numbers, each at a separate line. Print the sum of the numbers 
 * at the console. Ensure you close correctly the file in case of exception or in case of normal execution. In case of exception (e.g. the file 
 * is missing), print "Error" as a result.
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
 
public class _08_SumNumbersFromATextFile {
 
        public static void main(String[] args) {
 
                BufferedReader br = null;
                int result = 0;
                try {
 
                        String currentLine;
 
                        br = new BufferedReader(new FileReader("Input.txt"));
 
                        while ((currentLine = br.readLine()) != null) {
                                result += Integer.parseInt(currentLine);
                        }
                        System.out.println(result);
 
                } catch (IOException e) {
                        System.out.println("Error!");
                } finally {
                        try {
                                if (br != null){
                                        br.close();
                                }
                        } catch (IOException ex) {
                                ex.printStackTrace();
                        }
                }
               
        }
       
}