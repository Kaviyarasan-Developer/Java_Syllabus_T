


import java.io.*;

public class BufferedCharacterStreamExample {
    public static void main(String[] args) {
        BufferedReader br = null;
        BufferedWriter bw = null;
        
        try {
            // Create input and output stream objects with buffer
            br = new BufferedReader(new FileReader("source.txt"));
            bw = new BufferedWriter(new FileWriter("destination.txt"));
            
            String line;
            // Read and write line by line (buffered)
            while ((line = br.readLine()) != null) {
                bw.write(line);
                bw.newLine();  // Add a new line after each line of text
            }
            System.out.println("Data copied successfully using buffered character streams.");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // Close the streams
            try {
                if (br != null) br.close();
                if (bw != null) bw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
