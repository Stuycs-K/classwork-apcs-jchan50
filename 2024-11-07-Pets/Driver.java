//It changed the String that getName() returned by attaching "The Mighty" to the front
//Since getName is overwritten, speak() now uses the new name


public class Driver{

  public static void main(String[] args){
    Animal a1 = new Animal("Squack", 3, "Robin");
    a1.speak();
    Bird b1 = new Bird("Squakkkkkkk", 7, "Fido", 5.0, "yellow");
    b1.speak();
  }

}
