


import java.io.*;

public class BufferedReaderExample {
    public static void main(String[] args) {
        // Define file paths
        String inputFile = "input.txt";
        String outputFile = "output.txt";

        // Initialize BufferedReader and FileWriter
        BufferedReader reader = null;
        FileWriter writer = null;

        try {
            // Create FileReader to read from input file
            FileReader fileReader = new FileReader(inputFile);
            reader = new BufferedReader(fileReader);

            // Create FileWriter to write to output file
            writer = new FileWriter(outputFile);

            // Read and write line by line
            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line + "\n"); // Write each line to the output file
            }

            System.out.println("File has been successfully copied!");

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                // Close resources
                if (reader != null) reader.close();
                if (writer != null) writer.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
}
