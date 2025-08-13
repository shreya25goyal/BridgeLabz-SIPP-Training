interface LightTrigger {
    void activate();
}

public class SmartLighting {
    public static void main(String[] args) {
        LightTrigger motionTrigger = () -> System.out.println("Lights on: Motion detected");
        LightTrigger timeTrigger = () -> System.out.println("Lights on: Sunset time");
        LightTrigger voiceTrigger = () -> System.out.println("Lights on: Voice command");

        motionTrigger.activate();
        timeTrigger.activate();
        voiceTrigger.activate();
    }
}
