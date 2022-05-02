package keyframe;

// Lukas Bernard - Framework, Implementation and override
// Nathan Johnson - Method framework, parameter input, display method
// Bryce Lehnen - update method

public class KeyframeTimeDisplay implements observer, PreviewData {

  private String time;  // Holds time info for keyframe
  
  @Override
  public <T extends Comparable<T>> void update(T information) {
    // Checking to ensure that information was actually sent
    // Info was sent successfully
    if (!information.equals(null)) {
      time = (String) information;
      display();
    }
    // No info was sent
    // If no time information is sent then something is wrong with another system
    else {
      System.out.println("ERROR: No TIME information was sent");
    }
  }
  
  @Override
  public void display() {
    System.out.println("An event occurred at " + time);
  }
}