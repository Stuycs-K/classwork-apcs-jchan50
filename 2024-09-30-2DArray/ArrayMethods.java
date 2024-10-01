// Names: Jessie Chan (jessiec39@nycstudents.net) and Christine Chen (christinec109@nycstudents.net)
public class ArrayMethods{
  public static String arrToString(int[] nums){
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

  //3. Write arrToString, with a 2D array parameter.
//Note: Different parameters are allowed with the same function name.
/**Return a String that represets the 2D array in the format:
  * "[[2, 3, 4], [5, 6, 7], [2, 4, 9]]"
  * Note the comma+space between values, and between arrays
  * You are encouraged to notice that you may want to re-use
  * previous code, but you should NOT duplicate that code. (Don't copy/paste or retype it)
  */
public static String arrToString(int[][]ary){
  //this should use arrToString(int[])
  String s = "[";
  for (int i = 0; i < ary.length; i++) {
    s += arrToString(ary[i]);
    if (i != ary.length -1) {
      s += ", ";
    }
  }
  return s + "]";
}

/*Return the sum of all of the values in the 2D array */
public static int arr2DSum(int[][]nums){
  int sum = 0;
  for (int i = 0; i < nums.length; i++) {
    for (int j = 0; j < nums[i].length; j++) {
      sum += nums[i][j];
    }
  }
  return sum;
}

/**Rotate an array by returning a new array with the rows and columns swapped.
  * You may assume the array is rectangular and neither rows nor cols is 0.
  * e.g. swapRC({{1,2,3},{4,5,6}}) returns {{1,4},{2,5},{3,6}}
  */
public static int[][] swapRC(int[][]nums){
  int[][] newArr = new int[nums[0].length][nums.length];
  for (int i = 0; i < newArr.length; i++) {
    for (int j = 0; j < newArr[i].length; j++) {
      newArr[i][j] = nums[j][i];
    }
  }
  return newArr;
}

public static void main(String[] args) {
  //test cases for arrToSTring
  System.out.println("Expected: [[2, 3, 4], [5, 6, 7], [2, 4, 9]]. output: " + arrToString(new int[][] {{2, 3, 4}, {5, 6, 7}, {2, 4, 9}}));
  System.out.println("Expected: [[], [5, 6], [2, 4, 9]]. output: " + arrToString(new int[][] {{}, {5, 6}, {2, 4, 9}}));
  System.out.println("Expected: [[2, 3, 4], [5, 6, 7], [2, 4, 9], [0, 0, 0]]. output: " + arrToString(new int[][] {{2, 3, 4}, {5, 6, 7}, {2, 4, 9}, {0, 0, 0}}));

  //test cases for arr2DSum
  System.out.println("Expected: 42 output: " + arr2DSum(new int[][] {{2, 3, 4}, {5, 6, 7}, {2, 4, 9}}));
  System.out.println("Expected: 26 output: " + arr2DSum(new int[][] {{}, {5, 6}, {2, 4, 9}}));
  System.out.println("Expected: 42 output: " + arr2DSum(new int[][] {{2, 3, 4}, {5, 6, 7}, {2, 4, 9}, {0, 0, 0}}));
  System.out.println("Expected: 0 output: " + arr2DSum(new int[][] {{}, {}, {}}));

  //test cases for swapRC
  System.out.println("Expected: {{1,4},{2,5},{3,6}} output: " + arrToString(swapRC(new int[][] {{1,2,3},{4,5,6}})));
  System.out.println("Expected: {{0,1,2,3},{0,4,5,6},{0,5,1,2232},{0,0,2,1}} output: " + arrToString(swapRC(new int[][] {{0,0,0,0}, {1,4,5,0},{2,5,1,2},{3,6,2232,1}})));
}

}
