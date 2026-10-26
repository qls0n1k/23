// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;
import java.util.Scanner;

  public class Main {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

      System.out.print("Podaj liczbę a: ");
      int a = scanner.nextInt();

      System.out.print("Podaj liczbę b: ");
      int b = scanner.nextInt();

      int suma = a + b;
      System.out.println("Suma: " + suma);
    }

  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }
}