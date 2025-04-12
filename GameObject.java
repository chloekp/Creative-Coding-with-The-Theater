import org.code.theater.*;
import org.code.media.*;

// Superclass for all drawable game objects
public abstract class GameObject extends Scene {
  protected String type;

  // Constructor
  public GameObject(String type) {
    this.type = type;
  }

  // Method to be overridden by subclasses
  public abstract void display();
}
