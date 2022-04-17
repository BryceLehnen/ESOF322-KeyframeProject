//Lukas Bernard - Framework, Implementation and override
//Nathan Johnson - Method framework, parameter input
// Bryce Lehnen - update method

public class KeyframeAdditionalDisplay implements observer, PreviewData
{

  private String datastored;
  
  @Override
  public <T extends Comparable<T>> void update(T information)
  {
      // Checking if important* info was sent
      // was sent
      if (!information.equals("nothing found")) {
        datastored = (String) information;
        display();
      }
      // No important info (REMOVE AFTER TESTING)
      else {
        System.out.println("NO ADDITIONAL INFO");
      }
  }
  
  @Override
  public void display(/*String message*/)
  {
    // Update was changed after this was made. Most likely needs to be changed

    /*
    if (dataStored)
    {
      System.out.println("There is an additional element: " + message);
    }
    else if (!dataStored){
      System.out.pirntln("There is no additional occurrences to display");
    }
    */
  }
  
}
