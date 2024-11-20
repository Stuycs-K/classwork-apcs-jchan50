//1 you need all three imports.
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Arrays;

public class day2{

    public static String[] parse(String filename){
        String[][] keypad = {{"1","2", "3"}, {"4","5", "6"}, {"7","8", "9"}};
        String code = "";
        int a = 1, b = 1;
        try{
          Scanner input = new Scanner(new File(filename));
          while (input.hasNextLine()){
            String line = input.nextLine();
            String[] data (line.split("")));
            for (int i = 0;)
          }
          return null;
        }catch(Exception e){
          System.exit(1);
          return null;
        }
    }

    public static void main(String[] args){
        parse("day2input.txt");
    }
}