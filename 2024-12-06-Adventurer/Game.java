import java.util.Scanner;
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
    Adventurer enemy = new Worrier("Cronmeal",30);

    while (player.getHP() > 0 && enemy.getHP() > 0){
      System.out.println(player);
      System.out.println(enemy);

      System.out.println("Type: (a)ttack / (sp)ecial / (su)pport / quit");
      String response  = userInput.nextLine();
      System.out.println(response);
      break;
    }
  }
}
