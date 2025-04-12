import org.code.theater.*;
import java.util.Scanner;

public class TheaterRunner {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("What position would you like to play? hitter or passer:");
    String playerChoice = scanner.nextLine();

    System.out.println("What ball do you want to use? colorful or white:");
    String ballChoice = scanner.nextLine();

    MyScene scene = new MyScene(playerChoice, ballChoice);
    scene.drawScene();

    Theater.playScenes(scene);
  }
}
