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

  public static void main(String[] args) {
    System.out.println(arrayToString(new int[] {1,2,3,4}));

  }
}
