/**
 * Class observer
 * Author: Bryce Lehnen
 * Updates
 * ---------------------
 * Update 1: Created update methods for both
 *           String and boolean types
 * Update 2: Reduced methods to work with generics
 *           instead
 * Update 3: Ensured that the generic was comparable
 */

public interface observer {
  public <T extends Comparable<T>> void update(T info);
}
