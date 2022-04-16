//Lukas Bernard - Framework, Implementation and override
//Nathan Johnson - Method framework, parameter input

import java.lang.String;

public class KeyframeAdditionalDisplay implements observer, PreviewData
{

  private boolean dataStored = false;
  @Override
  public void update(boolean test)
  {
      dataStored = test;
  }
  
  @Override
  public void display(String message)
  {
    if (dataStored)
    {
      System.out.println("There is an additional element: " + message);
    }
    else if (!dataStored){
      System.out.pirntln("There is no additional occurrences to display");
    }
  }
  
}
