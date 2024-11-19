//1 you need all three imports.
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class day1{
  private int x;
  private int y;

  // public String[] parse(String filename){
  //   try{
  //     Scanner input = new Scanner(new File(filename)):
  //     String line = inf.nextLine();
  //     return line.split(", ");
  //   }catch(Exception e){
  //     System.exit(1);
  //   }
  // }
  // Integer.parseInt
  //
  // public static int solve(String[] data){
  //   int x = 0, y = 0, facing = 0;
  //   int[][]offset = {
  //     {0,1}, {1,0}, {0,-1}, {-1,0}
  //   }
  //   (facing + length) % length
  // }

  public static boolean Right(String filename){
    try {
    Scanner input = new Scanner(new File(filename));
    while(input.hasNext()){
        String step = input.next();
        System.out.println(step);
    }
    return true;
    }
    catch (FileNotFoundException ex) {
      //File not found what should you do?
      System.exit(1);
      return false; //you can return from a void function just don't put a value.
    }
  }

  public static void main(String[] args){
    //String[] data = prase("input.txt"):
    //System.out.println(data.arrayToString);
    System.out.println(Right("advent3puzzleinput.txt"));
  }

}
