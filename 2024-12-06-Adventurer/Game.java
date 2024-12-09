import java.util.Scanner;
import java.util.Arrays;
import java.util.List;

public class Game {
  public static void main(String[] args) {
    //do this once
    Scanner userInput = new Scanner(System.in);

    //You can do the rest many times:

    System.out.println("Enter username");
    //Read one line of user input
    String userName = userInput.nextLine();
    //Do something with the input
    System.out.println("Username is: " + userName);

    System.out.println();
    Adventurer player = new Worrier(userName,20);
    Adventurer enemy = new Worrier("Cronwall",30);

    while (player.getHP() > 0 && enemy.getHP() > 0){
      System.out.println(player);
      System.out.println(enemy);

      System.out.println("Type: (a)ttack / (sp)ecial / (su)pport / quit");
      String response  = userInput.nextLine();

      String[] v = {"a", "attack", "sp", "special", "su", "support", "quit"};
      List<String> l = Arrays.asList(v);


      while (l.indexOf(response) == -1){
        System.out.println("Type: (a)ttack / (sp)ecial / (su)pport / quit");
        response  = userInput.nextLine();
      }
      if (response.equals("a") || response.equals("attack")){
        System.out.println(player.attack(enemy));
      }
      if (response.equals("sp") || response.equals("special")){
        System.out.println(player.specialAttack(enemy));
      }
      if (response.equals("su") || response.equals("support")){
        System.out.println(player.support());
      }
      if (response.equals("quit")){
        break;
      }
System.out.println();
      if (enemy.getHP() > 0){
        int eresponse = (int) (Math.random() * 3 + 1);
        if (eresponse == 1){
          System.out.println(enemy.attack(player));
        }
        if (eresponse == 2){
          System.out.println(enemy.specialAttack(player));
        }
        if (eresponse == 3){
          System.out.println(enemy.support());
        }
      }



      if (enemy.getHP() <= 0){
        System.out.println(player.getName() + " won!");
        break;
      }
      if (player.getHP() <= 0){
        System.out.println(enemy.getName() + " won!");
        break;
      }




    }
  }
}
