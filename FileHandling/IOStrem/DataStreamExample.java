

import java.io.*;

public class DataStreamExample {
    public static void main(String[] args) {
        DataOutputStream dos = null;
        DataInputStream dis = null;
        
        try {
            // Writing data to the file
            dos = new DataOutputStream(new FileOutputStream("dataFile.txt"));
            dos.writeInt(123);
            dos.writeDouble(456.78);
            dos.writeUTF("Hello, Data Stream!");
            System.out.println("Data written to file.");
            
            // Reading data from the file
            dis = new DataInputStream(new FileInputStream("dataFile.txt"));
            int intValue = dis.readInt();
            double doubleValue = dis.readDouble();
            String stringValue = dis.readUTF();
            
            System.out.println("Data read from file:");
            System.out.println("Integer: " + intValue);
            System.out.println("Double: " + doubleValue);
            System.out.println("String: " + stringValue);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // Close the streams
            try {
                if (dos != null) dos.close();
                if (dis != null) dis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
