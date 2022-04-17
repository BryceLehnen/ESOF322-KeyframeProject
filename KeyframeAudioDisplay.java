//Lukas Bernard - Framework, Implementation and override
//Nathan Johnson - Method framework, parameter input
// Bryce Lehnen - update method

public class KeyframeAudioDisplay implements PreviewData, observer {
    
    @Override
    public <T extends Comparable<T>> void update(T state) {
        // Checking state (boolean) if it is true or false
        // True, then update display
        if (state.equals(true)) {
            display();
        }
        // False, then skip (REMOVE AFTER TESTING)
        else if (state.equals(false)) {
            System.out.println("AUDIO IS REGISTERED AS FALSE");
        }
    }
    
    @Override
    public void display() {
        
    }
}
