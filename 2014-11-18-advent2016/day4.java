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
            System.out.println("1" + checksum);
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
            System.out.println("2" + letters);
            System.out.println("3" +tally);
            String common5 = "";
            for (int i = 0; i < 5; i++){
              int m = indexOfMax(tally, letters);
              System.out.println(m);
              // if (tally.get(m).equals(1)){
              //   letters.sort(null);
              // }
              System.out.println(letters.get(m));
              common5 += letters.get(m);
              tally.remove(m);
              letters.remove(m);
            }
            System.out.println("4" + common5);
            
          }
          return null;
        }catch(Exception e){
        e.printStackTrace();
          return null;
        }
    }

    public static int indexOfMax(ArrayList<Integer> nums, ArrayList<String> letters){
      int index = 0;
      int temp = -1;
      for (int i = 0; i < nums.size(); i++){
        if (nums.get(i) > temp){
          temp = nums.get(i);
          index = i;
        }
        if (nums.get(i) == temp){//if tally is the same
          if (letters.get(i).compareTo(letters.get(index)) < 0){ //if the letter corresponding to i is before the letter corresponding to INDEX in the alphabet
            index = i;
             

            System.out.println("index is " + index);
            System.out.println("letter at index is " + letters.get(index));
            System.out.println("letter at temp is " + letters.get(temp));

          }
        }
      }
      return index;
    }

    public static void main(String[] args){
        System.out.println(solve("day4input.txt"));
    }
}
