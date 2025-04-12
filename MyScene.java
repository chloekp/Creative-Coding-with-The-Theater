import org.code.theater.*;
import org.code.media.*;

public class MyScene extends Scene {
  private String playerInput;
  private String ballInput;

  public MyScene(String playerInput, String ballInput) {
    this.playerInput = playerInput;
    this.ballInput = ballInput;
  }

  // Draws the scene using player and ball objects
  public void drawScene() {
    GameObject player = new Player(playerInput);
    GameObject ball = new Ball(ballInput);

    player.display();
    ball.display();

    drawText("You chose to be a " + playerInput + " with a " + ballInput + " ball!", 20, 20);
  }

}
