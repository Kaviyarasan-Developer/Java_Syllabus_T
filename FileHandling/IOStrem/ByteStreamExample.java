

import java.io.*;

public class ByteStreamExample {
    public static void main(String[] args) {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        
        try {
            // Create input and output stream objects
            fis = new FileInputStream("source.txt");
            fos = new FileOutputStream("destination.txt");
            
            int byteData;
            // Read and write byte by byte
            while ((byteData = fis.read()) != -1) {
                fos.write(byteData);
            }
            System.out.println("Data copied successfully using byte streams.");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // Close the streams
            try {
                if (fis != null) fis.close();
                if (fos != null) fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
