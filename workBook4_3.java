public class workBook4_3 {

  // convert fahrenheit to celsius
  public static void main(String[] args) {
    printTemperatures(77);
    printTemperatures(61);
    printTemperatures(55);

  }

  public static double fahrenheitToCelsius(double fahrenheit) {
    double celsius = (fahrenheit - 32) * 5 / 9;

    return celsius;
  }

  public static void printTemperatures(double fahrenheit) {
    System.out.println("F: " + fahrenheit);
    System.out.println(fahrenheitToCelsius(fahrenheit));
  }
}