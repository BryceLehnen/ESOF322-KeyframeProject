/**
 * Class observer
 * Author: Bryce Lehnen
 * Updates
 * ---------------------
 * Update 1: Created update methods for both
 *           String and boolean types
 * Update 2: Reduced methods to work with generics
 *           instead
 */

public interface observer {
  public <T> void update(T info);
}
