public class CtoFTester {
  public static double celsiusToFahrenheit(double celsius) {
    return celsius * 1.8 + 32;
  }
  public static double fahrenheitToCelsius(double fahrenheit) {
    return (fahrenheit - 32) * (5/9);
  }
  public static void main(String[] args) {
    System.out.println (celsiusToFahrenheit (0));
    System.out.println (fahrenheitToCelsius (32));
  }
}
