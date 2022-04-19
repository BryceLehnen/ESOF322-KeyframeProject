package keyframe;

// Interface for HomeData that allows it to
// add, remove, and notify Keyframe* classes

public interface subject {
  public void registerObserver(observer n);
  public void removeObserver(observer n);
  public void notifyObserver(observer n);
}
