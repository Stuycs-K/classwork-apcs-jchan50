//1 you need all three imports.
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class day4{


    public static String solve(String filename){
        try{
          Scanner input = new Scanner(new File(filename));
          while (input.hasNextLine()){
            ArrayList<String> letters = new ArrayList<String>();
            ArrayList<Integer> tally = new ArrayList<Integer>();
            String line = input.nextLine();
            String[] data = line.split("-");
            //System.out.println(Arrays.toString(data));
            String checksum = data[data.length -1].substring(4,9);
            System.out.println(checksum);
            String encr = "";
            for (int i = 0; i < data.length -1; i++){
              encr += data[i];
            }
            String[] enc = encr.split("");
            //ArrayList<String> en = new ArrayList<>(Arrays.asList(enc));
            //System.out.println(Arrays.toString(enc));
            for (int i = 0; i < enc.length; i++){
              if (letters.indexOf(enc[i]) != -1){
                tally.set(letters.indexOf(enc[i]), tally.get(letters.indexOf(enc[i])) + 1); //increases that letter's  tally by one;
              }
              else{
                letters.add(enc[i]);
                tally.add(1);
              }
            }
            System.out.println(letters);
            System.out.println(tally);
            System.out.println(indexOfMax(tally));
            String common5 = "";
            
          }
          return null;
        }catch(Exception e){
        e.printStackTrace();
          return null;
        }
    }

    public static int indexOfMax(ArrayList<Integer> nums){
      int index = 0;
      int temp = -1;
      for (int i = 0; i < nums.size(); i++){
        if (nums.get(i) > temp){
          temp = nums.get(i);
          index = i;
        }
      }
      return index;
    }

    public static void main(String[] args){
        System.out.println(solve("day4input.txt"));
    }
}
