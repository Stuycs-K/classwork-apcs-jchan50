import java.util.ArrayList;


public class Driver{
    public static void main(String[] args){
      ArrayList<String> arr =  ArrayListPractice.createRandomArray(10);
      // System.out.println(arr);
      // ArrayListPractice.replaceEmpty(arr);
      System.out.println(arr);
      // System.out.println(ArrayListPractice.makeReversedList(arr));

      ArrayList<String> arr2 =  ArrayListPractice.createRandomArray(17);
      System.out.println(arr2);
      System.out.println(ArrayListPractice.mixLists(arr,arr2));

      //System.out.println(ArrayListPractice.createRandomArray((int)(Math.random()*10)));
    //  ArrayListPractice.createRandomArray(200000);
  
      
  
      
      }
    }
  