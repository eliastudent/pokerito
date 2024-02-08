import java.util.Scanner;

public class RookPaperScissors {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("let's play Rook Paper Scissors.");
    System.out.println("are you redy?");

    String answer = scanner.nextLine();

    if (answer.equals("yes")) {
      System.out.println("Great!, chose now:");
      System.out.println("rock -- paper -- scissors, shoot!");

      String clieantAnswer = scanner.nextLine();
      String computerAnswer = computerChoice();
      String result = result(clieantAnswer, computerAnswer);

      printResult(clieantAnswer, computerAnswer, result);

    } else {
      System.out.println("Darn, some other time...!");
    }
  }

  /**
   * Function name: computerChoice <--------
   * 
   * @return a choice (String).
   *
   */

  public static String computerChoice() {
    int random = (int) (Math.random() * 3);

    switch (random) {
      case 0:
        return "rook";
      case 1:
        return "paper";
      case 2:
        return "scissors";

      default:
        return "please enter correct answer!";

    }

  }

  /**
   * Function name: result <-------
   * 
   * @param yourChoice     (String)
   * @param computerChoice (String)
   * @return result (String).
   */

  public static String result(String yourChoice, String computerChoice) {
    if ((yourChoice.equals("rock") && computerChoice.equals("scissors"))
        || (yourChoice.equals("paper") && computerChoice.equals("rock"))
        || (yourChoice.equals("scissors") && computerChoice.equals("paper"))) {
      return "you win!";

    } else if ((yourChoice.equals("scissors") && computerChoice.equals("rock"))
        || (yourChoice.equals("rock") && computerChoice.equals("paper"))
        || (yourChoice.equals("paper") && computerChoice.equals("scissors"))) {
      return "you lose!";

    } else if (yourChoice.equals(computerChoice)) {
      return "It's a tie";

    } else {
      return "INVALID CHOICE";

    }

  }

  /**
   * Name: printResult
   * 
   * @param yourChoice     (String)
   * @param computerChoice (String)
   * @param result         (String)
   *
   */

  public static void printResult(String yourChoice, String computerChoice, String Result) {
    System.out.println("You chose:          " + yourChoice);
    System.out.println("The computer chose: " + computerChoice);
    System.out.println(Result);

  }
}