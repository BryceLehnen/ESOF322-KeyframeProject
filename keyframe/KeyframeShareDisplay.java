<<<<<<< HEAD:KeyframeShareDisplay.java


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
=======
package keyframe;

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
    /*
    // False, then skip (REMOVE AFTER TESTING)
    else if (state.equals(false)) {
      System.out.println("SHARING IS REGISTERED AS FALSE");
    }*/
  }
  
  @Override
  public void display() {
    System.out.println("Information shared");
  }
}
>>>>>>> 2d85883196ee84c642492144558d03ca27b60181:keyframe/KeyframeShareDisplay.java
