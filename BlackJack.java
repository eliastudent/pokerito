import java.util.Scanner;

public class BlackJack {

  public static Scanner scan = new Scanner(System.in);

  public static void main(String[] args) {
    System.out.println("Welcome to Java Casinol Do you have a knack for Black Jack? We shall see\n" + //

        "..Ready? Press YES to begin!");
    String playerAnswer = scan.nextLine();
    if (playerAnswer.equals("yes") || playerAnswer.equals("YES")) {
      int randomPlayerCard1 = drawRandomNumberCard();
      int randomPlayerCard2 = drawRandomNumberCard();

      System.out.println("\nYou get a:\n" + returnsACard(randomPlayerCard1) +
          "\n and a\n" + returnsACard(randomPlayerCard2));

      int resultPlayerPoints = Math.min(randomPlayerCard1, 10) + Math.min(10, randomPlayerCard2);

      System.out.println("\nYour total is: " + resultPlayerPoints
          + "\nTape ENTER to see what the dealer cards");
      scan.nextLine();
      int randomDealercard1 = drawRandomNumberCard();
      int randomDealercard2 = drawRandomNumberCard();
      System.out.println("The dealer shows:\n" + returnsACard(randomDealercard1)
          + "\nand has a card facing down:\n"
          + returnsACard(0) + "\nThe dealer's total is hidden");
      int resultDealerPoints = Math.min(randomDealercard1, 10) + Math.min(10, randomDealercard2);

      String respons = hitOrStay();

      while (respons.equals("hit")) {

        if (respons.equals("stay")) {
          break;
        }
        int localPlayerCardNumber = hitFunc(resultPlayerPoints);
        resultPlayerPoints += localPlayerCardNumber;
        System.out.println(
            "You get a:\n" + returnsACard(localPlayerCardNumber) + "\nYour new total is: "
                + (resultPlayerPoints));

        if (resultPlayerPoints > 21) {
          System.out.println("Bust! Player loses.");
          System.exit(0);

        }

        respons = hitOrStay();

      }
      System.out
          .println("\nDealer's turn\n\nThe dealer's card are:\n" + returnsACard(randomDealercard1) + "\n And a:\n"
              + returnsACard(randomDealercard2));
      while ((resultDealerPoints) < 17) {
        int localDealerCardNumber = hitFunc(resultDealerPoints);

        resultDealerPoints += localDealerCardNumber;
        System.out.println("Dealer get a:\n" + returnsACard(localDealerCardNumber));
      }
      System.out.println("Dealer's total is: " + resultDealerPoints);
      if (resultDealerPoints > 21) {
        System.out.println("Bust! Dealer loses.");

      } else if (resultDealerPoints > resultPlayerPoints) {
        System.out.println("Dealer win!");

      } else if (resultDealerPoints < resultPlayerPoints) {
        System.out.println("Player win!");

      }

    } else {
      System.out.println("Everithing is fine! we play later...");
    }
  }

  private static int hitFunc(int resultPoints) {
    int localCardFuncNumber = drawRandomNumberCard();
    // int totalSum = resultPoints + Math.min(localCardFuncNumber, 10);
    // System.out.println(
    // "You get a:\n" + returnsACard(localCardFuncNumber) + "\nYour new total is: "
    // + (totalSum));

    return Math.min(10, localCardFuncNumber);

  }

  private static String hitOrStay() {
    System.out.println("Do you wanna hit or stay?");
    String hitOrStayAnswer = scan.nextLine();

    while (!(hitOrStayAnswer.equals("hit") || hitOrStayAnswer.equals("stay"))) {
      System.out.println("Please write 'hit' or 'stay'.");
      hitOrStayAnswer = scan.nextLine();
    }

    return hitOrStayAnswer;

  }

  private static int drawRandomNumberCard() {
    int randomNumber = (int) (Math.random() * 13) + 1;
    return randomNumber;

  }

  private static String returnsACard(int numberCard) {
    switch (numberCard) {
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
      case 0:
        return "   _____\n" +
            "  |     |\n" +
            "  |  J  |\n" +
            "  | JJJ |\n" +
            "  |  J  |\n" +
            "  |_____|\n";

    }

    return "ddd";

  }

}
