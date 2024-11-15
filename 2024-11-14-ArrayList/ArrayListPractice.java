import java.util.ArrayList;

public class ArrayListPractice{
  // Write a method public static ArrayList<String>createRandomArray(int size)
  // Create and return an ArrayList of the specified size that is randomly filled. Fill it with strings that look like the integers from 0 to 10 or similar,
  // but make every 0 turn into the empty string "". Do not make very long numbers that are difficult to read. You shoudl use Math.random()
  public static ArrayList<String> createRandomArray (int size){
    ArrayList<String> result = new ArrayList<String>();
    for (int i = 0; i < size; i++){
      int x = (int)(11 * Math.random()); //this takes away very small chance that we get 11
      if (x == 0){
        result.add("");
      }
      else{
        result.add("" + x);
      }
    }
    return result;
  }

  public static void replaceEmpty( ArrayList<String> original){
//Modify the ArrayList such that it has all of the empty strings are
//replaced with the word "Empty".
  }

  // public static ArrayList<String> makeReversedList( ArrayList<String> original){
  //   //return a new ArrayList that is in the reversed order of the original.
  // }
  //
  // public static ArrayList<String> mixLists( ArrayList<String> a,  ArrayList<String> b){
  //   //return a new ArrayList that has all values of a and b in alternating order that is:
  //   //a[0], b[0], a[1], b[1]...
  //   //If one list is longer than the other, just attach the remaining values to the end.
  // }
}
