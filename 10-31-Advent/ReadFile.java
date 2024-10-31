//1 you need all three imports.
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {

  public static void main(String[] args) {
    //2 Opening a file requires a try/catch

    int i = 0;
    int[] test = new int[]  {3,4,3,6,32,1,3};
    while(i < test.length ){
      if ((i % 2) == 0){
        System.out.println(test[i]);
        //do something with the next line of the file
      }
      i++;
    }

    try {
      File file = new File("ReadFile.java");//1
      Scanner input = new Scanner(file);
      //CODE THAT SCANS THE FILE.
      int index = 0;
      while(input.hasNextLine() ){
        if ((index % 2) == 0){
          System.out.println(input.nextLine());
          //do something with the next line of the file
        }
        index++;
      }
      input.close();//releases the file from your program



    } catch (FileNotFoundException ex) {
      //File not found what should you do?
      System.out.println("File not found");
      return; //you can return from a void function just don't put a value.
    }
  }
}
//prints out itself
