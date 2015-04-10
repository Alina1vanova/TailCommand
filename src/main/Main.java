package main;

import java.io.*;

/**
 * Created by linka on 09.04.2015.
 */
public class Main {

    private static final String FOLDER_PATH = "";

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Type the command, for example: tail -n5 ex.txt");
        String command = reader.readLine();
        Processor processor = new Processor();

        if (processor.commandIsValid(command)) {
            File file = new File(FOLDER_PATH + processor.getFileName(command));
            try {
                int fileLength = processor.fileLength(file);
                int tailLength = processor.getTailLength(command);
                if (fileLength >= tailLength) {
                    processor.printLines(file, fileLength, tailLength);
                } else {
                    System.out.println("Tail should be smaller than File");
                }
            } catch (FileNotFoundException e) {
                System.out.println("File not found");
            }
        } else {
            System.out.println("Command does not match required format: tail -nX <filePath>");
        }
    }
}
