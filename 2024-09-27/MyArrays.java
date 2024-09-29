import javax.swing.text.PlainDocument;

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

  public static void testReturnCopy(int[] ary) {
    System.out.println("Contents of original array:" + arrayToString(ary));
    System.out.println("Contents of copy:" + arrayToString(returnCopy(ary)));
    System.out.println("Checking if addresses are the same: " + (ary == returnCopy(ary)));
  }

  public static int[] concatArray(int[]ary1,int[]ary2) {
    int[] glue = new int[ary1.length + ary2.length];
    for (int i = 0; i < ary1.length; i++) {
      glue[i] = ary1[i];
    }
    for (int i = ary1.length; i < glue.length; i++) {
      glue[i] = ary2[i-ary1.length];
    }
    return glue;
  }

  public static void testConcatArray(int[] bry1, int[]bry2) {
    System.out.println("Components: " + arrayToString(bry1) + " " + arrayToString(bry2));
    System.out.println(arrayToString(concatArray(bry1, bry2)));
  }
  
  public static void main(String[] args) {
    System.out.println(arrayToString(new int[] {1,2,3,4}));

    //test cases for returnCopy
    int[] ary1 = {2,3,4};
    testReturnCopy(ary1);
    int[] ary2 = {2,3,4,3,0};
    testReturnCopy(ary2);
    int[] ary3 = {};
    testReturnCopy(ary3);
    int[] ary4 = {2,3,-4};
    testReturnCopy(ary4);
    int[] ary5 = {2,3,4, 3, 3, 2, 2, 2, 2};
    testReturnCopy(ary5);

    //test cases for concatArray
    testConcatArray(new int[] {223432,34,2,0}, new int[] {6,8,6} );
    testConcatArray(new int[] {2,0,0,0,0,0,0,2}, new int[] {} );
    testConcatArray(new int[] {}, new int[] {6,8,6} );
    testConcatArray(new int[] {}, new int[] {} );
    testConcatArray(new int[] {2}, new int[] {6,8,6} );
    testConcatArray(new int[] {2}, new int[] {6} );
    testConcatArray(new int[] {22222}, new int[] {6} );
    
  }
}
