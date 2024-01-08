package Random.Quiz4;

import java.io.*;
import java.util.Random;

public class Events {

    private final static String[] eventTypes={"Login", "Logout", "Purchase", "ViewPage", "Error"};
    public static void generateEventsFile(String name, int numR) throws  IOException{

    Random random=new Random();


        try (BufferedWriter writer = new BufferedWriter(new FileWriter(name))){

            for(int i=0;i<numR;i++) {
                writer.write("Time stamp: " + random.nextInt(50) + " Event type: " + eventTypes[random.nextInt(5)] + " User ID: " + random.nextInt(1000));
                writer.newLine();
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

}

public static void readEventsFile(String name) throws IOException{
    try (BufferedReader reader = new BufferedReader(new FileReader(name))) {
    String line;

        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }
    }
}


}
