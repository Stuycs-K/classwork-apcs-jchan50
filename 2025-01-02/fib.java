public class fib{

  public static int fib(int n){
    if (n == 0){
      return 0;
    }
    if (n == 1){
      return 1;
    }
    if (n != 1 && n != 0){
      return fib(n-1) + fib(n-2);
    }
    return -1;
  }

  public static void main(String[] args) {
    // for (int i = 0; i < 11; i++){
    //   System.out.println(fib(i));
    // }
    System.out.println(fib(Integer.parseInt(args[0])));
  }
}
