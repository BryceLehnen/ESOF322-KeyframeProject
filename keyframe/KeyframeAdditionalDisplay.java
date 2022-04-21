<<<<<<< HEAD:KeyframeAdditionalDisplay.java


//Lukas Bernard - Framework, Implementation and override
//Nathan Johnson - Method framework, parameter input, display method
// Bryce Lehnen - update method

public class KeyframeAdditionalDisplay implements observer, PreviewData {

  private String dataStored;  // Contains important info about incident
  
  @Override
  public <T extends Comparable<T>> void update(T information) {
      // Checking if important* info was sent
      // was sent
      if (!information.equals("nothing found")) {
        dataStored = (String) information;
        display();
      }
      // No important info (REMOVE AFTER TESTING)
      else {
        System.out.println("NO ADDITIONAL INFO");
      }
  }
  
  @Override
  public void display(/*String message*/) {
    // Update was changed after this was made. Most likely needs to be changed
    /*if (dataStored)
    {
      System.out.println("There is an additional element: " + message);
    }
    else if (!dataStored){
      System.out.pirntln("There is no additional occurrences to display");
    }*/

    // Since display method is only getting called if something actually happens, this should be sufficient
    System.out.println(dataStored); // prints the additional information
  }
  
}
=======
package keyframe;

//Lukas Bernard - Framework, Implementation and override
//Nathan Johnson - Method framework, parameter input, display method
// Bryce Lehnen - update method

public class KeyframeAdditionalDisplay implements observer, PreviewData {

  private String dataStored;  // Contains important info about incident
  
  @Override
  public <T extends Comparable<T>> void update(T information) {
      // Checking if important* info was sent
      // was sent
      if (!information.equals("nothing found")) {
        dataStored = (String) information;
        display();
      }
      /*
      // No important info (REMOVE AFTER TESTING)
      else {
        System.out.println("NO ADDITIONAL INFO");
      }*/
  }
  
  @Override
  public void display() {
    // Since display method is only getting called if something actually happens, this should be sufficient
    System.out.println("Additional notes: " + dataStored); // prints the additional information
  }
  
}
>>>>>>> 2d85883196ee84c642492144558d03ca27b60181:keyframe/KeyframeAdditionalDisplay.java
