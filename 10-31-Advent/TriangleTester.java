//1 you need all three imports.
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;



public class TriangleTester{
   
    public static int countTrianglesA(String filename){

        Scanner input = new Scanner(filename);

        int count = 0;
        int a = 0;
        int b = 0;
        int c = 0;
        while(input.hasNextInt){
            a = nextInt();
            b = nextInt();
            c = nextInt();
            if (isTriangle(a,b,c)){
                count++;
            }
        }
        return count;
    }

    public static boolean isTriangle(int a, int b, int c){
        if (c > a + b){
            return false;
        }
        if (b > a + c){
            return false;
        }
        if (a > c + b){
            return false;
        }
        return true;
    }

    public static void main(String[] args){

        File file = new File("inputTri.txt");//1

        System.out.println(isTriangle(5, 100, 23));
        System.out.println(isTriangle(4, 5, 6));
        System.out.println(countTrianglesA(file));
    }
}