import org.code.theater.*;
import org.code.media.*;
import java.util.*;

public class Ball extends GameObject {
  private ArrayList<String> ballImages = new ArrayList<>();

  public Ball(String type) {
    super(type);
    loadBallImages();
  }

  // Fills the ArrayList with ball image
  private void loadBallImages() {
    ballImages.add("volleyballclipart.png");      // colorful
    ballImages.add("volleyballclipart1.png");     // white
  }

  // Display the correct image and play sound
  public void display() {
    String imageFile;

    if (type.equals("colorful")) {
      imageFile = "volleyballclipart.png";
    } else if (type.equals("white")) {
      imageFile = "volleyballclipart1.png";
    } else {
      imageFile = "error.png";
    }

    drawImage(imageFile, 250, 100, 100);
    playSound("ballhit.wav");
  }
  }
