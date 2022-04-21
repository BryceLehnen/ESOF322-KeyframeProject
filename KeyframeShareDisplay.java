

// Lukas Bernard - Framework, Implementation and override
// Nathan Johnson - Method framework, parameter input, display method
// Bryce Lehnen - update method

public class KeyframeShareDisplay implements observer, PreviewData {

  @Override
  public <T extends Comparable<T>> void update(T state) {
    // Checking state (boolean) if it is true or false
    // True, then update display
    if (state.equals(true)) {
      display();
    }
    // False, then skip (REMOVE AFTER TESTING)
    else if (state.equals(false)) {
      System.out.println("SHARING IS REGISTERED AS FALSE");
    }
  }
  
  @Override
  public void display() {
    System.out.println("Information shared");
  }
}
