


import java.io.*;

public class FileLineCounter {
    public static void main(String[] args) {
        // Define file paths
        String inputFile = "input.txt";
        String outputFile = "lineCount.txt";

        // Initialize BufferedReader and FileWriter
        BufferedReader reader = null;
        FileWriter writer = null;

        try {
            // Create FileReader to read from input file
            FileReader fileReader = new FileReader(inputFile);
            reader = new BufferedReader(fileReader);

            // Create FileWriter to write to output file
            writer = new FileWriter(outputFile);

            // Count the number of lines
            int lineCount = 0;
            while (reader.readLine() != null) {
                lineCount++;
            }

            // Write the line count to the output file
            writer.write("Total number of lines: " + lineCount);

            System.out.println("Line count has been written to the file!");

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
