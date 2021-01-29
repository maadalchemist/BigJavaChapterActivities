import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
      int lawnW, lawnH;
      char[][] lawn;
      Scanner cin = new Scanner(System.in);

      // Welcome the user
      System.out.println("Welcome to the lawm mower app");

      // Ask user for lawn width
      System.out.println("Please input the width of the lawn you want to construct");
      lawnW = cin.nextInt();

      // Ask user for lawn height
      System.out.println("Please input the height of the lawn");
      lawnH = cin.nextInt();

      // Generate lawn array
      lawn = new char[lawnW][lawnH];
      for (int i = 0; i < lawnH; i++) {
        for (int j = 0; j < lawnW; j++) {
          lawn[j][i] = '#';
        }
      }

      // Generate display
      Display display = new Display(lawnW + 1, lawnH + 1);

      // Construct LawnMower object
      LawnMower mower = new LawnMower(0, 0, 3);

      // while lawn not mowed
      while (!mower.b_stuck(lawn)) {
        // Mower Logic
        mower.move(lawn);

        // Display stuff
        display.clear();
        display.draw_2d_char_array(1, 1, lawn);
        mower.display(display);
        display.draw();

        // Pause in order to have visible framerate (found online, will look into what the heck tre{}catch{} means later)
        try {
            Thread.sleep(20);
        } catch(InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
      }

      System.out.println("All done!");
    }
}
