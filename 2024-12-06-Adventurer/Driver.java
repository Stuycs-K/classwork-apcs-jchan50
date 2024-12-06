public class Driver{
  public static void main(String[] args) {
    Adventurer p1 = new Worrier("Stuart",10);
    Adventurer p2 = new Worrier("Bob",5);

    System.out.println(p1);
    System.out.println(p1.getHP());
    System.out.println(p2);
    System.out.println(p2.getHP());
    System.out.println(p1.getSpecial());
    System.out.println(p2.getSpecial());
    System.out.println(p1.attack(p2));
    System.out.println(p2.getHP());
    System.out.println(p2.attack(p1));
    System.out.println(p1.getHP());
  }
}
