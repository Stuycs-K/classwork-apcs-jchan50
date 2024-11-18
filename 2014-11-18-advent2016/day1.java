//1 you need all three imports.
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class day1{
  privite int x;
  privite int y;

  public static boolean Right?(String filename){
    try {
    File file = new File(filename);//1
    Scanner s = new Scanner(file);
    while(s.hasNext()){
        String step = next();
        System.out.println(step);
    }
    return true;
    }
    catch (FileNotFoundException ex) {
      //File not found what should you do?
      System.out.println("File not found");
      return -1; //you can return from a void function just don't put a value.
    }

  System.out.println(Right?("advent3puzzleinput.txt"));
}
