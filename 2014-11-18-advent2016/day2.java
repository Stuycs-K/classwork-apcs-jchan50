//1 you need all three imports.
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Arrays;

public class day2{

    public static String solve(String filename){
        String[][] keypad = {{"1","2", "3"}, {"4","5", "6"}, {"7","8", "9"}};
        String code = "";
        int a = 1, b = 1; //row and column index starting at value "5"
        try{
          Scanner input = new Scanner(new File(filename));
          while (input.hasNextLine()){
            String line = input.nextLine();
            String[] data = line.split("");
            for (int i = 0; i < data.length; i++){
                //System.out.println(data[i]);
                if (a > 0 && data[i].equals("U")){ //checking that it doesnt leave bounds
                    a--;
                    // System.out.println("hi");
                    // System.out.println(a);
                }
                if (a < 2 && data[i].equals("D")) {
                    a++;
                    // System.out.println(a);
                    // System.out.println("hi");
                }
                if (b < 2 && data[i].equals("R")){
                    b++;
                    // System.out.println(b);
                    // System.out.println("hi");
                }
                if ( b > 0 && data[i].equals("L")) {
                    b--;
                    // System.out.println(b);
                    // System.out.println("hi");
                }
            }
            
            code += keypad[a][b];
            //System.out.println(code);
          }
          return code;
        }catch(Exception e){
        e.printStackTrace();
          return null;
        }
    }

    public static void main(String[] args){
        System.out.println(solve("day2input.txt"));
    }
}