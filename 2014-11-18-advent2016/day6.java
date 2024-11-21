//1 you need all three imports.
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class day6{
    // private ArrayList<String> col1 = new ArrayList<>();
    // private ArrayList<String> col2 = new ArrayList<>();
    // private ArrayList<String> col3 = new ArrayList<>();
    // private ArrayList<String> col4 = new ArrayList<>();
    // private ArrayList<String> col5 = new ArrayList<>();
    // private ArrayList<String> col6 = new ArrayList<>();
    // private ArrayList<String> col7 = new ArrayList<>();
    // private ArrayList<String> col8 = new ArrayList<>();

    public static void parse(String filename){
         ArrayList<String> col1 = new ArrayList<>();
         ArrayList<String> col2 = new ArrayList<>();
         ArrayList<String> col3 = new ArrayList<>();
         ArrayList<String> col4 = new ArrayList<>();
         ArrayList<String> col5 = new ArrayList<>();
         ArrayList<String> col6 = new ArrayList<>();
         ArrayList<String> col7 = new ArrayList<>();
         ArrayList<String> col8 = new ArrayList<>();

         try{
            Scanner input = new Scanner(new File(filename));
            while (input.hasNextLine()){
                String line = input.nextLine();
                String[] data = line.split("");
                col1.add(data[0]);
                col2.add(data[1]);
                col3.add(data[2]);
                col4.add(data[3]);
                col5.add(data[4]);
                col6.add(data[5]);
                col7.add(data[6]);
                col8.add(data[7]);
            }
            System.out.println(col1);
            System.out.println(col2);
            System.out.println(col3);
            System.out.println(col4);
            System.out.println(col5);
            System.out.println(col6);
            System.out.println(col7);
            System.out.println(col8);
        }catch(Exception e){
            e.printStackTrace();
            System.out.println("bad");
            
          }


    }


    public static void main(String[] args){
        parse("day6input.txt");
    }
}