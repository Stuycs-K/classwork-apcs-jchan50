//1 you need all three imports.
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class day4{
    public static String solve(String filename){
        ArrayList<String> letters = new ArrayList<String>();
        ArrayList<Integer> tally = new ArrayList<Integer>();
        try{
          Scanner input = new Scanner(new File(filename));
          while (input.hasNextLine()){
            String line = input.nextLine();
            String[] data = line.split("-");
            //System.out.println(Arrays.toString(data));
            String encr = "";
            for (int i = 0; i < data.length -1; i++){
              encr += data[i]; 
            }
            System.out.println(encr);
            
          }
          return null;
        }catch(Exception e){
        e.printStackTrace();
          return null;
        }
    }

    public static void main(String[] args){
        System.out.println(solve("day4input.txt"));
    }
}