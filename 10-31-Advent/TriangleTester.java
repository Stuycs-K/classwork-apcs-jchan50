//1 you need all three imports.
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;



public class TriangleTester{

    public static boolean isTriangle(int a, int b, int c){
        // if ((c > a + b) || (b > a + c) ||  (a > c + b)){
        //     return false;
        // }
        // return true;
        return (c < a + b) && (b < a + c) &&  (a < c + b);
    }


    public static int countTrianglesA(String filename){

        try {
        File file = new File(filename);//1
        Scanner s = new Scanner(file);
        int count = 0;
        int a = 0;
        int b = 0;
        int c = 0;
        while(s.hasNextInt()){
            a = s.nextInt();
            b = s.nextInt();
            c = s.nextInt();
            if (isTriangle(a,b,c)){
                count++;
            }
        }
        return count;
        }
        catch (FileNotFoundException ex) {
          //File not found what should you do?
          System.out.println("File not found");
          return -1; //you can return from a void function just don't put a value.
        }
    }

    public static int countTrianglesB(String filename){
      try {
      File file = new File(filename);//1
      Scanner s = new Scanner(file);
      int count = 0;
      while(s.hasNextInt()){
        int[] nums = new int[9];
          for (int i = 0; i < nums.length; i++){
            nums[i] = s.nextInt();
          }
          if (isTriangle(nums[0],nums[3],nums[6])){
              count++;
          }
          if (isTriangle(nums[1],nums[4],nums[7])){
              count++;
          }
          if (isTriangle(nums[2],nums[5],nums[8])){
              count++;
          }
      }
      return count;
      }
      catch (FileNotFoundException ex) {
        //File not found what should you do?
        System.out.println("File not found");
        return -1; //you can return from a void function just don't put a value.
      }
    }


    public static void main(String[] args){

        System.out.println(isTriangle(5, 100, 23));
        System.out.println(isTriangle(4, 5, 6));
        System.out.println(isTriangle(1, 2, 3));
        System.out.println(isTriangle(3, 2, 3));
        System.out.println(countTrianglesA("advent3puzzleinput.txt"));
        System.out.println(countTrianglesB("advent3puzzleinput.txt"));
    }
}
