package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by linka on 09.04.2015.
 */
public class Main {

    public static void main (String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Type the command:");
        String command = reader.readLine();
        CommandParser parser = new CommandParser();
        if (parser.commandIsValid(command)){
            //getFilePath
            //getTailLength
            //printTail
        }
        else
        {
            System.out.println("Command does not match required format: tail -nX <filePath>");
        }
    }
}
