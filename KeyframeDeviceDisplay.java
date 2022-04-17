//Lukas Bernard - Framework, Implementation and override
//Nathan Johnson - Method framework, parameter input
// Bryce Lehnen - update method

public class KeyframeDeviceDisplay implements observer, PreviewData
{

  String deviceType;    // Holds the type of device (ie. doorlock, camera, etc)

  @Override
  public <T extends Comparable<T>> void update(T information)
  {
    // Checking to ensure important* info was sent
    // Info was sent
    if (!information.equals(null)) {
      deviceType = (String) information;
      display();
    }
    // No important info (REMOVE AFTER TESTING)
    else {
      System.out.println("NO DEVICE INFO");
    }
  }
  
  @Override
  public void display()
  {
    
  }
  
}
