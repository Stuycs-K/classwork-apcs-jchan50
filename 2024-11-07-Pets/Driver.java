//It changed the String that getName() returned by attaching "The Mighty" to the front
//Since getName is overwritten, speak() now uses the new name

//The only one that didn't work was Bird b2 = new Animal(...)
// because Bird is a child class of Animal,but not vice versa
// meaning, not all animal objects are birds and therefore can't be contained within the Bird class.


public class Driver{

  public static void main(String[] args){
    Animal a1 = new Animal("Squack", 3, "Robin");
    a1.speak();
    Bird b1 = new Bird("Squakkkkkkk", 7, "Fido", 5.0, "yellow");
    b1.speak();

    //test constructors
    //Bird b2 = new Animal("MOo", 12, "Betty"); produces an error
    Animal a2 = new Bird("grrrr", 12, "Pennsylvania", 6.0, "Red");
    a2.speak();
  }

}
