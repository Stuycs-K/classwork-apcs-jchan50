import java.util.Arrays;
public class ArrayDemo{
  public static void main(String[]args){
    //write your tests here!
    //You can now use Arrays.toString(yourArray) instead of writing arrayToString again.
    //Compare Arrays.toString(yourArray) to YOUR arrayToString() method to make sure yours is correct
    //do not use any other Arrays.method()
    //test cases for arrToSTring
    System.out.println("Expected: " + Arrays.deepToString(new int[][] {{2, 3, 4}, {5, 6, 7}, {2, 4, 9}}) +  " output: " + arrToString(new int[][] {{2, 3, 4}, {5, 6, 7}, {2, 4, 9}}));
    System.out.println("Expected: " + Arrays.deepToString(new int[][] {{}, {5, 6}, {2, 4, 9}}) + " output: " + arrToString(new int[][] {{}, {5, 6}, {2, 4, 9}}));
    System.out.println("Expected: " + Arrays.deepToString(new int[][] {{2, 3, 4}, {5, 6, 7}, {2, 4, 9}, {0, 0, 0}}) + " output: " + arrToString(new int[][] {{2, 3, 4}, {5, 6, 7}, {2, 4, 9}, {0, 0, 0}}));
    System.out.println("");

    //test cases for arr2DSum
    System.out.println("Expected: 42 output: " + arr2DSum(new int[][] {{2, 3, 4}, {5, 6, 7}, {2, 4, 9}}));
    System.out.println("Expected: 26 output: " + arr2DSum(new int[][] {{}, {5, 6}, {2, 4, 9}}));
    System.out.println("Expected: 42 output: " + arr2DSum(new int[][] {{2, 3, 4}, {5, 6, 7}, {2, 4, 9}, {0, 0, 0}}));
    System.out.println("Expected: 0 output: " + arr2DSum(new int[][] {{}, {}, {}}));
    System.out.println("");

    //test cases for swapRC
    System.out.println("Expected: {{1,4},{2,5},{3,6}} output: " + arrToString(swapRC(new int[][] {{1,2,3},{4,5,6}})));
    System.out.println("Expected: {{0,1,2,3},{0,4,5,6},{0,5,1,2232},{0,0,2,1}} output: " + arrToString(swapRC(new int[][] {{0,0,0,0}, {1,4,5,0},{2,5,1,2},{3,6,2232,1}})));
    System.out.println("");

    //test cases for replaceNegative
    int[][] a = {{3,-3,5},{-3,4,2,-9},{0,2,-62342,2}};
    System.out.println("Original:" + arrToString(a));
    replaceNegative(a);
    System.out.println("Edited: " + arrToString(a));
    int[][] b = {{3,-3,5},{0,-4,2,-9},{0,2,-62342,2}, {}, {0,0,0,0,0}};
    System.out.println("Original:" + arrToString(b));
    replaceNegative(b);
    System.out.println("Edited: " + arrToString(b));
    b = new int[][] {};
    System.out.println("Original:" + arrToString(b));
    replaceNegative(b);
    System.out.println("Edited: " + arrToString(b));
    b = new int[][] {{}};
    System.out.println("Original:" + arrToString(b));
    replaceNegative(b);
    System.out.println("Edited: " + arrToString(b));
    System.out.println("");


    //test cases for copy
    a = new int[][] {{3,-3,5},{-3,4,2,-9},{0,2,-62342,2}};
    System.out.println("Original:" + arrToString(a));
    System.out.println("Copy: " + arrToString(copy(a)));
    System.out.println("are their addresses the same? " + (a == copy(a)));
    a = new int[][] {{2, 3, 4}, {5, 6, 7}, {2, 4, 9}, {0, 0, 0}};
    System.out.println("Original:" + arrToString(a));
    System.out.println("Copy: " + arrToString(copy(a)));
    System.out.println("are their addresses the same? " + (a == copy(a)));
    a = new int[][] {{0,0,0,0}, {1,4,5,0},{2,5,1,2},{3,6,2232,1}};
    System.out.println("Original:" + arrToString(a));
    System.out.println("Copy: " + arrToString(copy(a)));
    System.out.println("are their addresses the same? " + (a == copy(a)));
    a = new int[][] {{}, {5, 6}, {2, 4, 9}};
    System.out.println("Original:" + arrToString(a));
    System.out.println("Copy: " + arrToString(copy(a)));
    System.out.println("are their addresses the same? " + (a == copy(a)));
    a = new int[][] {};
    System.out.println("Original:" + arrToString(a));
    System.out.println("Copy: " + arrToString(copy(a)));
    System.out.println("are their addresses the same? " + (a == copy(a)));
    a = new int[][] {{}};
    System.out.println("Original:" + arrToString(a));
    System.out.println("Copy: " + arrToString(copy(a)));
    System.out.println("are their addresses the same? " + (a == copy(a)) + "\n");
    
    //test cases for countZeros2D
    System.out.println("Expected : 5. Output: " + countZeros2D(new int[][] {{34, 2, 5}, {}, {0,2,0,4,0,3}, {000}, {}, {30, 0}}));
    System.out.println("Expected : 1. Output: " + countZeros2D(new int[][] {{34, 2, 5}, {3,2,03423432432}, {2,2,3,4,3}, {1000}, {3}, {30, 0}}));
    System.out.println("Expected : 3. Output: " + countZeros2D(new int[][] {{0}, {0}, {2}, {0}}));

    //test cases for htmlTable
    System.out.println(htmlTable(new int[][]{{1,2},{3}}));
  }

  //0. Include your prior methods to help you print a 1D/2D array of ints.
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

  //The name of different methods can be the same,
  //as long as the parameters are different! (type and/or quantity must be different)
  //Pro tip: you should be using your 1D arrToString in this method!
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

  //1. Calculate and return how many elements equal zero in the 2D array.
  public static int countZeros2D(int[][] nums){
    int count = 0;
     for (int i = 0; i < nums.length; i++) {
       for (int j = 0; j < nums[i].length; j++) {
         if (nums[i][j] == 0) {
           count++;
         }
       }
     }
     return count;
  }

  //2. Calculate the sum of a 2d array
  /*Return the sum of all of the values in the 2D array
   *Use a nested loop instead of a helper method*/
   public static int arr2DSum(int[][]nums){
     int sum = 0;
     for (int i = 0; i < nums.length; i++) {
       for (int j = 0; j < nums[i].length; j++) {
         sum += nums[i][j];
       }
     }
     return sum;
   }

  //3. Modify a given 2D array of integer as follows:
  //Replace all the negative values:
  //-When the row number is the same as the column number replace
  //that negative with the value 1
  //-All other negatives replace with 0
  public static void replaceNegative(int[][] vals){
    for (int i = 0; i < vals.length; i++) {
      for (int j = 0; j < vals[i].length; j++) {
        if (vals[i][j] < 0) {
          if (i == j) {
            vals[i][j] = 1;
          }
          else {
            vals[i][j] = 0;
          }
        }
      }
    }
  }

  //4. Make a copy of the given 2d array.
  //When testing : make sure that changing the original does NOT change the copy.
  //DO NOT use any built in methods that "copy" an array.
  //You SHOULD write a helper method for this.
  //If you don't see a good way to do that, you should stop and look at prior methods.
  public static int[] returnCopy(int[]ary){
    int[] a = new int[ary.length];
    for (int i = 0; i < ary.length; i++) {
      a[i] = ary[i];
    }
    return a;
  }

  public static int[][] copy(int[][] nums){
    int[][] copy = new int[nums.length][1];
    for (int i = 0; i < copy.length; i++){
      copy[i] = returnCopy(nums[i]);
    }
    return copy;
  }

  //5. Rotate an array by returning a new array with the rows and columns swapped.
  //   You may assume the array is rectangular and neither rows nor cols is 0.
  //   e.g. swapRC({{1,2,3},{4,5,6}}) returns {{1,4},{2,5},{3,6}}
  public static int[][] swapRC(int[][]nums){
    int[][] newArr = new int[nums[0].length][nums.length];
    for (int i = 0; i < newArr.length; i++) {
      for (int j = 0; j < newArr[i].length; j++) {
        newArr[i][j] = nums[j][i];
      }
    }
    return newArr;
  }

  //6. Make an HTML table by putting a table tag around the entire 2d array,
  //   tr tags around each row, and td tags around each value.
  //   You may use a helper method
  //   Note there is no whitespace in the string, it all one line with no spaces/tabs.
  //   e.g. htmlTable(new int[][]{{1,2},{3}})  returns:
  // "<table><tr><td>1</td><td>2</td></tr><tr><td>3</td></tr></table>"
  public static String htmlTable(int[][]nums){
    String s = "<table>";
    for (int i = 0; i < nums.length; i++) {
      for (int j = 0; j < nums[i].length; j++) {
        s = s + "<td>" + arrToString(nums[i][j]) + "</td>";
      }
      s = s + "<tr>" + arrToString(nums[i]) + "</tr>";
    }
    return s + "</table>";
  }


}
