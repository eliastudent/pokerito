import java.util.Scanner;

public class Hangman {
  public static String[] words = { "ant", "baboon", "badger", "bat", "bear", "beaver", "camel", "cat", "clam", "cobra",
      "cougar", "coyote", "crow", "deer", "dog", "donkey", "duck", "eagle", "ferret", "fox", "frog", "goat", "goose",
      "hawk", "lion", "lizard", "llama", "mole", "monkey", "moose", "mouse", "mule", "newt", "otter", "owl", "panda",
      "parrot", "pigeon", "python", "rabbit", "ram", "rat", "raven", "rhino", "salmon", "seal", "shark", "sheep",
      "skunk", "sloth", "snake", "spider", "stork", "swan", "tiger", "toad", "trout", "turkey", "turtle", "weasel",
      "whale", "wolf", "wombat", "zebra" }; // 64

  private static Scanner scanner = new Scanner(System.in);
  private static boolean lose = true;
  private static char[] missed = new char[10];
  private static int numOfMisses = 0;

  public static void main(String[] args) {

    // System.out.println(" Guess: ");
    // char guess = ' ';
    int random = randomString();
    String randomWord = words[random];
    int turnFalseOff = 0;
    int turnTrueOff = 0;
    boolean plusNumOfMisse = true;
    System.out.println(randomWord);
    char[] faceWord = new char[randomWord.length()];
    for (int i = 0; i < faceWord.length; i++) {
      faceWord[i] = '_';

    }

    // int lengthWord = randomWord.length();

    while (lose) {
      System.out.print(gallows[numOfMisses]);
      if (numOfMisses == 6) {
        System.out.println("\nYou lose!");
        System.exit(0);

      }

      if (turnFalseOff == randomWord.length()) {
        lose = false;

      } else {
        lose = true;

      }

      System.out.print("word:   ");
      for (int i = 0; i < randomWord.length(); i++) {
        System.out.print(faceWord[i] + " ");
      }
      for (int i = 0; i < faceWord.length; i++) {
        if (faceWord[i] == randomWord.charAt(i)) {
          turnTrueOff++;
        }

      }
      if (turnTrueOff == randomWord.length()) {
        System.out.println("\nYou win!");
        System.exit(0);

      } else {
        turnTrueOff = 0;
      }

      System.out.println("\n");
      System.out.print("Misses:   ");
      for (int i = 0; i < missed.length; i++) {
        System.out.print(missed[i]);

      }
      System.out.print("\nGuess:   ");

      char guess = scanner.nextLine().charAt(0);

      System.out.println(" Guess:   " + guess + "\n");
      for (int i = 0; i < randomWord.length(); i++) {
        if (guess == randomWord.charAt(i)) {
          faceWord[i] = guess;
        }
      }
      for (int i = 0; i < randomWord.length(); i++) {
        if (guess == randomWord.charAt(i)) {
          plusNumOfMisse = false;
          break;
        } else if (guess != randomWord.charAt(i)) {
          plusNumOfMisse = true;

        }

      }
      if (plusNumOfMisse == true) {
        missed[numOfMisses] = guess;
        numOfMisses++;

      }

      // testEqual(guess, randomWord);
      for (int i = 0; i < faceWord.length; i++) {
        if (faceWord[i] == randomWord.charAt(i)) {
          turnFalseOff++;
        }

      }

      // System.out.println(drawHangman(input));
      // System.out.println(gallows[1]);
      // System.out.println(words.length);
    }

  }

  // private static boolean testEqual(char a, String randomStr) {
  // for (int i = 0; i < randomStr.length(); i++) {
  // if (a == randomStr.charAt(i)) {

  // return true;

  // }

  // }

  // }

  private static int randomString() {
    int randomNum = (int) (Math.random() * 64);
    return randomNum;
  }

  // private static String drawHangman(int option) {
  // switch (option) {
  // case 0:
  // return "+---+\n" +
  // "| |\n" +
  // " |\n" +
  // " |\n" + // if the user didn't miss any guesses.
  // " |\n" +
  // " |\n" +
  // "=========\n";

  // case 1:
  // return "+---+\n" +
  // "| |\n" +
  // "O |\n" + // if the user missed one guess.
  // " |\n" +
  // " |\n" +
  // " |\n" +
  // "=========\n";

  // case 2:
  // return "+---+\n" +
  // "| |\n" +
  // "O |\n" + // if the user missed two guesses.
  // "| |\n" +
  // " |\n" +
  // " |\n" +
  // "=========\n";

  // case 3:
  // return " +---+\n" +
  // " | |\n" +
  // " O |\n" + // if the user missed three guesses.
  // "/| |\n" +
  // " |\n" +
  // " |\n" +
  // " =========\n";

  // case 4:
  // return " +---+\n" +
  // " | |\n" +
  // " O |\n" +
  // "/|\\ |\n" + // if the user missed four guesses.
  // " |\n" +
  // " |\n" +
  // " =========\n";

  // case 5:
  // return " +---+\n" +
  // " | |\n" +
  // " O |\n" +
  // "/|\\ |\n" + // if the user missed five guesses.
  // "/ |\n" +
  // " |\n" +
  // " =========\n";

  // case 6:
  // return " +---+\n" +
  // " | |\n" +
  // " O |\n" +
  // "/|\\ |\n" + // if the user missed six guesses.
  // "/ \\ |\n" +
  // " |\n" +
  // " =========\n";

  // default:
  // return "erorr";
  // }

  // }

  public static String[] gallows = { // 7 length
      "+---+\n" +
          "|   |\n" +
          "    |\n" +
          "    |\n" + // if the user didn't miss any guesses.
          "    |\n" +
          "    |\n" +
          "=========\n",

      "+---+\n" +
          "|   |\n" +
          "O   |\n" + // if the user missed one guess.
          "    |\n" +
          "    |\n" +
          "    |\n" +
          "=========\n",

      "+---+\n" +
          "|   |\n" +
          "O   |\n" + // if the user missed two guesses.
          "|   |\n" +
          "    |\n" +
          "    |\n" +
          "=========\n",

      " +---+\n" +
          " |   |\n" +
          " O   |\n" + // if the user missed three guesses.
          "/|   |\n" +
          "     |\n" +
          "     |\n" +
          " =========\n",

      " +---+\n" +
          " |   |\n" +
          " O   |\n" +
          "/|\\  |\n" + // if the user missed four guesses.
          "     |\n" +
          "     |\n" +
          " =========\n",

      " +---+\n" +
          " |   |\n" +
          " O   |\n" +
          "/|\\  |\n" + // if the user missed five guesses.
          "/    |\n" +
          "     |\n" +
          " =========\n",

      " +---+\n" +
          " |   |\n" +
          " O   |\n" +
          "/|\\  |\n" + // if the user missed six guesses.
          "/ \\  |\n" +
          "     |\n" +
          " =========\n" };

}
