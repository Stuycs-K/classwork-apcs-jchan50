public class Worrier extends Adventurer{
  private String specialName = "Anxiety";
  private int special, specialMax;

  public Worrier(String name, int hp, int max){
      super(name, hp);
      this.special = max;
      this.specialMax = max;
  }

  public Worrier(String name, int hp){
    this(name,hp,"c++");
  }

  public Worrier(String name){
    this(name,12);
  }

  public Worrier(){
    this("Carmack");
  }
  //Abstract methods are meant to be implemented in child classes.

  /*
    all adventurers must have a custom special
    consumable resource (mana/rage/money/witts etc)
  */
  //give it a short name (fewer than 13 characters)
  public String getSpecialName(){
    return specialName;
  }
  //accessor methods
  public int getSpecial(){
    return special;
  }
  public  void setSpecial(int n){
    special = n;
  }

  public  int getSpecialMax(){
    return specialMax;
  }

  /*
    all adventurers must have a way to attack enemies and
    support their allys
  */
  //hurt or hinder the target adventurer
  public  String attack(Adventurer other){
    other.applyDamage(5);
    return this.getName() + " attacked " + other.getName() + ". " + other.getName() + "'s hp is now " + other.getHP();
  }
//adding two randoms varies the distribution; ie two 6-sided die makes 7 more common
  //heall or buff the target adventurer
  public  String support(Adventurer other){
    other.setHP(other.getHP() + 1);
    return this.getName() + " supported " + other.getName() + ". " + other.getName() + "'s hp is now " + other.getHP();
  }

  //heall or buff self
  public  String support(){
    this.setHP(this.getHP() + 1);
    return this.getName() + " supported itself. " + this.getName() + "'s hp is now " + this.getHP();
  }

  //hurt or hinder the target adventurer, consume some special resource
  public  String specialAttack(Adventurer other){
    other.applyDamage(10);
    special -= 10;
    return this.getName() + " used " + this.getSpecialName() + " on " + other.getName() + ". " + other.getName() + "'s hp is now " + other.getHP();
  }


}
