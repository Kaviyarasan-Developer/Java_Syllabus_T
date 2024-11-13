


import java.io.*;

public class CharacterStreamExample {
    public static void main(String[] args) {
        FileReader fr = null;
        FileWriter fw = null;
        
        try {
            // Create input and output stream objects
            fr = new FileReader("source.txt");
            fw = new FileWriter("destination.txt");
            
            int charData;
            // Read and write character by character
            while ((charData = fr.read()) != -1) {
                fw.write(charData);
            }
            System.out.println("Data copied successfully using character streams.");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // Close the streams
            try {
                if (fr != null) fr.close();
                if (fw != null) fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
