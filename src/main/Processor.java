package main;

import java.io.*;

/**
 * Created by linka on 09.04.2015.
 */
public class Processor {

    public boolean commandIsValid(String command) {
        return command.matches("tail\\s+-n\\d+\\s.+");
    }

    public int fileLength(File file) throws IOException {
        LineNumberReader lnr = new LineNumberReader(new FileReader(file));
        lnr.skip(Long.MAX_VALUE);
        int length = lnr.getLineNumber() + 1;
        lnr.close();
        return length;
    }

    public int getTailLength(String command) {
        String commandPart = command.substring(command.indexOf('n') + 1);
        return Integer.parseInt(commandPart.substring(0, commandPart.indexOf(' ')));
    }

    public String getFileName(String command) {
        String commandPart = command.substring(command.indexOf('n') + 1);
        return commandPart.substring(commandPart.indexOf(" ") + 1).trim();
    }

    public void printLines(File file, int fileLength, int startLine) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            int lineNumber = 1;
            while ((line = br.readLine()) != null) {
                if (lineNumber > fileLength - startLine) {
                    System.out.println(line);
                }
                lineNumber++;
            }
        }
    }
}
