public class Worrier extends Adventurer{
  private String specialName = "Anxiety";
  private int special, specialMax = 50;

  public Worrier(String name){
      super(name);
  }

  public Worrier(String name, int hp){
      super(name, hp);
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
    return this.getName() + " attacked " + other.getName();
  }

  //heall or buff the target adventurer
  public  String support(Adventurer other){
    other.setHP(other.getHP() + 1);
    return this.getName() + " supported " + other.getName();
  }

  //heall or buff self
  public  String support(){
    this.setHP(this.getHP() + 1);
    return this.getName() + " supported itself";
  }

  //hurt or hinder the target adventurer, consume some special resource
  public  String specialAttack(Adventurer other){
    attack(other);
    special -= 10;
    return this.getName() + "used" + this.getSpecialName() + " on " + other.getName();
  }



}
