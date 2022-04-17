/**
Class HomeData 
Author: Lukas Bernard
Updates
-----------------
Update 1: Created framework and implementation
Update 2: Added constructor
Update 3: Added variables
Update 4: Filled Methods
Update 5: Changed functionality
*/
import java.util.List;
import java.util.ArrayList;

public class HomeData implements subject {

  // Declaration
  private List<observer> displayTypes = new ArrayList<>();
  private KeyframeVideoDisplay video;
  private KeyframeTimeDisplay time;
  private KeyframeAudioDisplay audio;
  private KeyframeAdditionalDisplay additional;
  private KeyframeShareDisplay share;
  private KeyframeDeviceDisplay deviceType;

  // Constructor
  HomeData() { 
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

  // Adding and removing observers
  public void registerObserver(observer n) { displayTypes.add(n); }
  public void removeObserver(observer n) { displayTypes.remove(n); }
  
  // Seperate notify's for each type of data
  public void notifyObservers(observer n, String information) { n.update(information); }
  public void notifyObservers(observer n, boolean state) { n.update(state); }
  
  // Getters for all types of incoming information
  public void getTime(String timeState) { notifyObservers(time, timeState); }
  public void getVideo(boolean videoState) { notifyObservers(video, videoState); }
  public void getAudio(boolean audioState) { notifyObservers(audio, audioState); }
  public void getAdditional(String additionalInformation) { notifyObservers(additional, additionalInformation); }
  public void getShareInformation(boolean shareInformation) { notifyObservers(share, shareInformation); }
  public void getDeviceType(String device) { notifyObservers(deviceType, device); }
  
  public void removeObserverSet()
  {
    for(int i = 0; i < displayTypes.size(); i++)
    {
      removeObserver(displayTypes[i]);
    }
  }
}
