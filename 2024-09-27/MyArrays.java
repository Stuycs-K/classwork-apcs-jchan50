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
    return new int[] {0};
  }
  public static void main(String[] args) {
    System.out.println(arrayToString(new int[] {1,2,3,4}));

    //test cases for returnCopy
    int[] ary1 = {2,3,4};
    System.out.println("Contents of original array:" + arrayToString(ary1));
    System.out.println("Contents of copy:" + arrayToString(returnCopy(ary1)));
    System.out.println("Checking if addresses are the same:" + ary1==returnCopy(ary1));

  }
}
