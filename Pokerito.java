import java.util.Scanner;

public class Pokerito {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    textRolls();
    String playerAnswer = scanner.nextLine();
    if (playerAnswer.equals("yes") || playerAnswer.equals("YES")) {
      String playerCard1 = randomCard();
      String playerCard2 = randomCard();
      String computerCard1 = randomCard();
      String computerCard2 = randomCard();
      System.out.println("Here's your cards:");
      System.out.println(playerCard1 + "\n" + playerCard2 + "\n");
      System.out.println("Here's the computer's cards:");
      System.out.println(computerCard1 + "\t" + computerCard2 + "\n");
      System.out.println("Now, the dealer will draw five cards. Press enter to continue.");
      int matchPlayer = 0;
      int matchComputer = 0;
      for (int i = 0; i < 5; i++) {
        String playerOutput = scanner.nextLine();
        if (playerOutput.equals("")) {
          System.out.println("card " + (i + 1) + ":\n");
          String matchCards = randomCard();
          System.out.println(matchCards);

          if (computerCard1.equals(matchCards) || computerCard2.equals(matchCards)) {
            matchComputer++;
          } else if (playerCard1.equals(matchCards) || playerCard2.equals(matchCards)) {
            matchPlayer++;
          }

        }

      }
      System.out.println("Your number of matches: " + matchPlayer);
      System.out.println("Computer number of matches: " + matchComputer);
      if (matchComputer > matchPlayer) {
        System.out.println("The computer wins!.");

      } else if (matchComputer < matchPlayer) {
        System.out.println("You win!");

      } else if (matchComputer == matchPlayer) {
        System.out.println("everyone wins!, we split the money beetwen has");

      }

    } else {
      System.out.println("so we will play later...");
    }

  }

  public static void textRolls() {
    System.out.println("Let's play Pokerito. Type anything when you're ready.\n" + //
        "It's like Poker, but a lot simpler.\n" + //
        "- There are two players, you and the computer.\n" + //
        "- The dealer will give each player one card.\n" + //
        "- Then, the dealer will draw five cards (the river)\n" + //
        "- The player with the most river matches wins!\n" + //
        "- If the matches are equal, everyone's a winner!\n" + //
        "- Ready? Type YES if you are.\n" + //
        "");
  }

  public static String randomCard() {
    int randomNum = (int) (Math.random() * 13) + 1;
    String fff = "333";

    switch (randomNum) {
      case 1:
        return "   _____\n" +
            "  |A _  |\n" +
            "  | ( ) |\n" +
            "  |(_'_)|\n" +
            "  |  |  |\n" +
            "  |____V|\n";

      case 2:
        return "   _____\n" +
            "  |2    |\n" +
            "  |  o  |\n" +
            "  |     |\n" +
            "  |  o  |\n" +
            "  |____Z|\n";
      case 3:
        return "   _____\n" +
            "  |3    |\n" +
            "  | o o |\n" +
            "  |     |\n" +
            "  |  o  |\n" +
            "  |____E|\n";
      case 4:
        return "   _____\n" +
            "  |4    |\n" +
            "  | o o |\n" +
            "  |     |\n" +
            "  | o o |\n" +
            "  |____h|\n";
      case 5:
        return "   _____ \n" +
            "  |5    |\n" +
            "  | o o |\n" +
            "  |  o  |\n" +
            "  | o o |\n" +
            "  |____S|\n";
      case 6:
        return "   _____ \n" +
            "  |6    |\n" +
            "  | o o |\n" +
            "  | o o |\n" +
            "  | o o |\n" +
            "  |____6|\n";
      case 7:
        return "   _____ \n" +
            "  |7    |\n" +
            "  | o o |\n" +
            "  |o o o|\n" +
            "  | o o |\n" +
            "  |____7|\n";
      case 8:
        return "   _____ \n" +
            "  |8    |\n" +
            "  |o o o|\n" +
            "  | o o |\n" +
            "  |o o o|\n" +
            "  |____8|\n";
      case 9:
        return "   _____ \n" +
            "  |9    |\n" +
            "  |o o o|\n" +
            "  |o o o|\n" +
            "  |o o o|\n" +
            "  |____9|\n";
      case 10:
        return "   _____ \n" +
            "  |10  o|\n" +
            "  |o o o|\n" +
            "  |o o o|\n" +
            "  |o o o|\n" +
            "  |___10|\n";
      case 11:
        return "   _____\n" +
            "  |J  ww|\n" +
            "  | o {)|\n" +
            "  |o o% |\n" +
            "  | | % |\n" +
            "  |__%%[|\n";
      case 12:
        return "   _____\n" +
            "  |Q  ww|\n" +
            "  | o {(|\n" +
            "  |o o%%|\n" +
            "  | |%%%|\n" +
            "  |_%%%O|\n";
      case 13:
        return "   _____\n" +
            "  |K  WW|\n" +
            "  | o {)|\n" +
            "  |o o%%|\n" +
            "  | |%%%|\n" +
            "  |_%%%>|\n";

    }

    return "ddd";

  }

}