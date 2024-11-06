public class TriangleTester{
    public static int countTrianglesA(String filename){
        int count = 0;
        int 
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
}