
public class Main {
  public static void main(String[] args) {
    // winter, spring, summer, autumn
    // warm jacket, t-shirt, swimming suite, rain coat

    var temperature = 10;
    
    if (temperature <= 5) {
      System.out.println("Wear super warm");
    }
    else if (temperature <= 15) {
      System.out.println("Wear warm");
      }
    else if (temperature <= 30) {
      System.out.println("Wear normal");
    }
    else {
      System.out.println("Wear cooling");
    }

  }
}
