

import java.io.*;

public class BufferedByteStreamExample {
    public static void main(String[] args) {
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;
        
        try {
            // Create input and output stream objects with buffer
            bis = new BufferedInputStream(new FileInputStream("source.txt"));
            bos = new BufferedOutputStream(new FileOutputStream("destination.txt"));
            
            int byteData;
            // Read and write byte by byte (buffered)
            while ((byteData = bis.read()) != -1) {
                bos.write(byteData);
            }
            System.out.println("Data copied successfully using buffered byte streams.");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // Close the streams
            try {
                if (bis != null) bis.close();
                if (bos != null) bos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
