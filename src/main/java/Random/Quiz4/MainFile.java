package Random.Quiz4;

import java.io.IOException;

import static Random.Quiz4.Events.generateEventsFile;
import static Random.Quiz4.Events.readEventsFile;

public class MainFile {
    public static void main(String[] args) {

        try {
            generateEventsFile("events.txt", 10);
            readEventsFile("events.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }





}
