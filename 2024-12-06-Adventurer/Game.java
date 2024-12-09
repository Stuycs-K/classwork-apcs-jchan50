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

    Adventurer player = new Worrier(userName,20);
    Adventurer enemy = new Worrier("Cronwall",30);

    while (player.getHP() > 0 && enemy.getHP() > 0){
      System.out.println(player);
      System.out.println(enemy);

      System.out.println("Type: (a)ttack / (sp)ecial / (su)pport / quit");
      String response  = userInput.nextLine();
      System.out.println(response);

      String[] v = {"a", "attack", "sp", "special", "su", "support", "quit"};
      List<String> l = Arrays.asList(v);


      while (l.indexOf(response) == -1){
        System.out.println("Type: (a)ttack / (sp)ecial / (su)pport / quit");
        response  = userInput.nextLine();
        System.out.println(response);
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
      else{

      }

      break;
    }
  }
}
