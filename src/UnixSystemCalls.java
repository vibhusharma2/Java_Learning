import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UnixSystemCalls {
    public static void main(String[] args) {
        // Execute Unix command to open directory
        executeCommand("ls /path/to/directory");

        // Execute Unix command to read directory contents
        executeCommand("ls -l /path/to/directory");

        // Execute Unix command to copy file
        executeCommand("cp /path/to/sourceFile /path/to/destinationFile");

        // Execute Unix command to move file (performing paste operation)
        executeCommand("mv /path/to/sourceFile /path/to/destinationDirectory");

        // Execute Unix command to close directory
        // Note: There's no explicit close operation for directories in Unix command-line operations.
    }

    private static void executeCommand(String command) {
        try {
            // Execute the command
            Process process = Runtime.getRuntime().exec(command);

            // Read the output of the command
            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            // Wait for the command to complete
            int exitCode = process.waitFor();
            System.out.println("Command executed with exit code: " + exitCode);

            // Close the reader
            reader.close();
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
