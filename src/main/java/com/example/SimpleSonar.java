public class SimpleSonar {

    public static void main(String[] args) {

        // Speed of sound in water (meters per second)
        double speedOfSound = 1500.0;

        // Fixed distance to object (meters)
        double distance = 300.0;

        // Sonar pulse travel time (to object and back)
        double time = (2 * distance) / speedOfSound;

        System.out.println("SONAR SYSTEM");
        System.out.println("------------");
        System.out.println("Ping sent...");
        System.out.println("Echo received!");
        System.out.println("Distance to object: " + distance + " meters");
        System.out.println("Echo return time: " + time + " seconds");
    }
}
