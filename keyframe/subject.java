package keyframe;
public interface subject {
  public void registerObserver(observer n);
  public void removeObserver(observer n);
  public void notifyObserver(observer n);
}
