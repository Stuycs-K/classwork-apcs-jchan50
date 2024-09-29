public class MyArrays{
  public static String arrayToString(int[] nums){
    String s = "";
    for (int i = 0; i < nums.length; i++) {
      s = s + nums[i];
      if (i != nums.length -1) {
        s += ", ";
      }
    }
    s = "[" + s + "]";
    return s;
  }


  public static int[] returnCopy(int[]ary){
    int[] a = new int[ary.length];
    for (int i = 0; i < ary.length; i++) {
      a[i] = ary[i];
    }
    return a;
  }

  public static void test(int[] ary) {
    System.out.println("Contents of original array:" + arrayToString(ary));
    System.out.println("Contents of copy:" + arrayToString(returnCopy(ary)));
    System.out.println("Checking if addresses are the same: " + (ary == returnCopy(ary)));
  }
  public static void main(String[] args) {
    System.out.println(arrayToString(new int[] {1,2,3,4}));

    //test cases for returnCopy
    int[] ary1 = {2,3,4};
    test(ary1);
    int[] ary2 = {2,3,4,3,0};
    test(ary2);
    int[] ary3 = {};
    test(ary3);
    int[] ary4 = {2,3,-4};
    test(ary4);
    int[] ary5 = {2,3,4, 3, 3, 2, 2, 2, 2};
    test(ary5);
  }
}
