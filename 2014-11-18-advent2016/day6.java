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

    public static void solve(String filename){
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
            // System.out.println(col1);
            // System.out.println(col2);
            // System.out.println(col3);
            // System.out.println(col4);
            // System.out.println(col5);
            // System.out.println(col6);
            // System.out.println(col7);
            // System.out.println(col8);

            String message = "";
            message = mostCommonLetter(col1) 
                        + mostCommonLetter(col2) 
                        + mostCommonLetter(col3) 
                        + mostCommonLetter(col4)
                        + mostCommonLetter(col5) 
                        + mostCommonLetter(col6) 
                        + mostCommonLetter(col7)
                        + mostCommonLetter(col8);
            System.out.println(message);
            
        }catch(Exception e){
            e.printStackTrace();
            System.out.println("bad");
            
          }

          
    }

    public static String mostCommonLetter(ArrayList<String> column){
        ArrayList<String> letters = new ArrayList<String>();
        ArrayList<Integer> tally = new ArrayList<Integer>();
        for (int i = 0; i < column.size(); i++){
            if (letters.indexOf(column.get(i)) != -1){
              tally.set(letters.indexOf(column.get(i)), tally.get(letters.indexOf(column.get(i))) + 1); //increases that letter's  tally by one;
            }
            else{ //else add new letter to letters and new slot to tally
              letters.add(column.get(i)); 
              tally.add(1);
            }
          }
        //   System.out.println( letters);
        //     System.out.println(tally);
            int m = indexOfMax(tally, letters);
            //System.out.println(letters.get(m));

        return letters.get(m);
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
  
            }
          }
        }
        return index;
      }

    public static void main(String[] args){
        solve("day6input.txt");
    }
}