//1 you need all three imports.
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Arrays;

public class day1{

  public static String[] parse(String filename){
    try{
      Scanner input = new Scanner(new File(filename));
      String line = input.nextLine();
      return line.split(", ");
    }catch(Exception e){
      System.exit(1);
      return null;
    }
  }
  //Integer.parseInt

  public static int solve(String[] data){
    int x = 0, y = 0, facing = 0;
    int[][]compass = {{0,1}, {1,0}, {0,-1}, {-1,0}};
    String[]cardinal = {"north", "east", "south", "west"};
    for (int i = 0; i < data.length; i++){
      String direction = data[i].substring(0,1);
      int distance = Integer.parseInt(data[i].substring(1));
      // System.out.println(direction + ";" + distance);
      if (direction.equals("R")){
        facing++;
        x += distance * compass[(facing + 4) % 4][0]; //selects one of the unit vectors from above
        y += distance * compass[(facing + 4) % 4][1];
        //System.out.println(cardinal[(facing + 4) % 4]);
      }
      if (direction.equals("L")){
        facing--;
        x += distance * compass[(facing + 4) % 4][0];
        y += distance * compass[(facing + 4) % 4][1];  //selects one of the unit vectors from above
      //  System.out.println(cardinal[(facing + 4) % 4]);
      }
    }
    return  Math.abs(x) +  Math.abs(y);
    //(facing + length) % length
  }

  // public static boolean Right(String filename){
  //   try {
  //   Scanner input = new Scanner(new File(filename));
  //   while(input.hasNext()){
  //       String step = input.next();
  //       System.out.println(step);
  //   }
  //   return true;
  //   }
  //   catch (FileNotFoundException ex) {
  //     //File not found what should you do?
  //     System.exit(1);
  //     return false; //you can return from a void function just don't put a value.
  //   }
  // }

  public static void main(String[] args){
    //String[] data = prase("input.txt"):
    //System.out.println(data.arrayToString);
    System.out.println(Arrays.toString(parse("advent3puzzleinput.txt")));
    System.out.println(solve(parse("advent3puzzleinput.txt")));
  }

}
