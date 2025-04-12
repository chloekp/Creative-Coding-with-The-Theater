import org.code.theater.*;
import org.code.media.*;
import java.util.*;

public class Player extends GameObject {
  private ArrayList<String> playerImages = new ArrayList<>();

  public Player(String type) {
    super(type);
    loadPlayerImages();
  }

  // Fills the ArrayList with player image 
  private void loadPlayerImages() {
    playerImages.add("volleyballplayer.png");     // hitter
    playerImages.add("volleyballplayer1.png");    // passer
  }

  // Display the correct image and play sound
  public void display() {
    String imageFile;

    if (type.equals("hitter")) {
      imageFile = "volleyballplayer.png";
    } else if (type.equals("passer")) {
      imageFile = "volleyballplayer1.png";
    } else {
      imageFile = "error.png"; // fallback
    }

    drawImage(imageFile, 100, 150, 200);
    playSound("cheering.wav");
  }
  }
