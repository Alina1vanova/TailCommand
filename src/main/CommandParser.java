package main;

import java.io.*;

/**
 * Created by linka on 09.04.2015.
 */
public class CommandParser {

    public boolean commandIsValid(String command) {
        return command.matches("tail -n\\d+\\s.+");
    }

    public int fileLength(File file) throws IOException {
        LineNumberReader lnr = new LineNumberReader(new FileReader(file));
        lnr.skip(Long.MAX_VALUE);
        int length = lnr.getLineNumber() + 1;
        lnr.close();
        return length;
    }

    public void printLines(File file, int startLine) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            int lineNumber = 0;
            while ((line = br.readLine()) != null) {

                    System.out.println(line);

                lineNumber++;
            }
        }
    }
}
