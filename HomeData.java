//Lukas Bernard constructor
import java.util.List;
import java.util.ArrayList;

public class HomeData implements subject
{

  private List<observer> displayTypes = new ArrayList<>();
  private KeyframeVideoDisplay video;
  private KeyframeTimeDisplay time;
  private KeyframeAudioDisplay audio;
  private KeyframeAdditionalDisplay additional;
  private KeyframeShareDisplay share;
  private KeyframeDeviceDisplay deviceType;

  HomeData()
  { 
    video = new KeyframeVideoDisplay();
    time = new KeyframeTimeDisplay();
    audio = new KeyframeAudioDisplay();
    additional = new KeyframeAdditionalDisplay();
    share = new KeyframeShareDisplay();
    deviceType = new KeyframeDeviceDisplay();
    
    registerObserver(video);
    registerObserver(time);
    registerObserver(audio);
    registerObserver(additional);
    registerObserver(deviceType);
  }

  void registerObserver(observer n)
  {
    displayTypes.add(n);
  }
  
  void removeObserver(observer n)
  {
    displayTypes.remove(n);
  }
  
  void notifyObservers(observer n, string information)
  {
    n.update(information);
  }

  void notifyObservers(observer n, boolean state)
  {
    n.update(state);
  }
  
  void getTime(String timeState)
  {
    notifyObservers(time, timeState);
  }
  
  void getVideo(boolean videoState)
  {
    notifyObservers(video, videoState);
  }
  
  void getAudio(boolean audioState)
  {
    notifyObservers(audio, audioState);
  }
  
  void getAdditional(String additionalInformation)
  {
    notifyObservers(additional, additionalInformation);
  }
  
  void getShareInformation(boolean shareInformation)
  {
    notifyObservers(share, shareInformation);
  }
  
  void getDeviceType(String device)
  {
    notifyObservers(deviceType, device);
  }
  
  void removeObserverSet()
  {
    for(int i = 0; i < displayTypes.size(); i++)
    {
      removeObserver(displayTypes[i]);
    }
  }
}
