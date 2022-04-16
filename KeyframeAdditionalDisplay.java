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
  public void display()
  {
    if (dataStored)
    {
      System.out.println("There is an additional element"); // change this to what it is
    }
    else if (!dataStored){
      System.out.pirntln("THere is no additional occurrences to display");
    }
  }

}
