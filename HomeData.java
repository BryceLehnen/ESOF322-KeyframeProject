package keyframe;

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
Update 6: Commented comprehensively
*/
// Nathan Johnson - added override to notifyObserver to ensure proper program function

import java.util.List;
import java.util.ArrayList;

public class HomeData implements subject {

  // Declaration of out methods as well as list housing all types observer
  private List<observer> displayTypes = new ArrayList<>();
  private KeyframeVideoDisplay video;
  private KeyframeTimeDisplay time;
  private KeyframeAudioDisplay audio;
  private KeyframeAdditionalDisplay additional;
  private KeyframeShareDisplay share;
  private KeyframeDeviceDisplay deviceType;

  // Constructor, creating new instances of the objects
  HomeData() { 
    video = new KeyframeVideoDisplay();
    time = new KeyframeTimeDisplay();
    audio = new KeyframeAudioDisplay();
    additional = new KeyframeAdditionalDisplay();
    share = new KeyframeShareDisplay();
    deviceType = new KeyframeDeviceDisplay();
    //registering the observers
    registerObserver(video);
    registerObserver(time);
    registerObserver(audio);
    registerObserver(additional);
    registerObserver(deviceType);
  }

  // Adding and removing observers by extracting from displayTypes list
  public void registerObserver(observer n) { displayTypes.add(n); }
  public void removeObserver(observer n) { displayTypes.remove(n); }
  
  // Seperate notify's for each type of data, string and boolean
  // Using the update method implemented by PreviewData interface
  public void notifyObservers(observer n, String information) { n.update(information); }
  public void notifyObservers(observer n, boolean state) { n.update(state); }
  
  // Getters for all types of incoming information, called to notify with parameter sets
  // and input values.
  public void getTime(String timeState) { notifyObservers(time, timeState); }
  public void getVideo(boolean videoState) { notifyObservers(video, videoState); }
  public void getAudio(boolean audioState) { notifyObservers(audio, audioState); }
  public void getAdditional(String additionalInformation) { notifyObservers(additional, additionalInformation); }
  public void getShareInformation(boolean shareInformation) { notifyObservers(share, shareInformation); }
  public void getDeviceType(String device) { notifyObservers(deviceType, device); }
  
  //To remove extrenuous observers past their need
  public void removeObserverSet()
  {
    for(int i = 0; i < displayTypes.size(); i++)
    {
      removeObserver(displayTypes.get(i));
    }
  }
   //if not supported yet
    @Override
    public void notifyObserver(observer n) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}