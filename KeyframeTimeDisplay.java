//Lukas Bernard - Framework, Implementation and override
//Nathan Johnson - Method framework, parameter input

public class KeyframeTimeDisplay implements observer, PreviewData{

  String time;
  
  @Override
  void update(String timeVariable)
  {
    time = timeVariable;
  }
  
  @Override
  void display()
  {
    System.out.println("The event occurred at " + time);
  }
}
