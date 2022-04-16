//Lukas Bernard constructor

public class HomeData implements subject
{

  HomeData(String t, boolean v, boolean a, String additionalInformation, String device)
  { 
    KeyframeVideoDisplay video = new KeyframeVideoDisplay();
    KeyframeTimeDisplay time = new KeyframeTimeDisplay();
    KeyframeAudioDisplay audio = new KeyframeAudioDisplay();
    KeyframeAdditionalDisplay additional = new KeyframeAdditionalDisplay();
    KeyframeDeviceDisplay deviceType = new KeyframeDeviceDisplay();
    
    registerObserver(video);
    registerObserver(time);
    registerObserver(audio);
    registerObserver(additional);
    registerObserver(deviceType);

  }

  void registerObserver(observer n)
  {
    
  }
  
  void removeObserver(observer n)
  {
    
  }
  
  void notifyObservers(string M)
  {

  }

  void notifyObservers(boolean state)
  {

  }
  
  void getTime()
  {
    
  }
  
  void getVideo()
  {
    
  }
  
  void getAudio()
  {
    
  }
  
  void getAdditional()
  {
    
  }
  
  void getShareInformation()
  {
    
  }
  
  void getDeviceType()
  {
    
  }
}
