package main;

/**
 * Created by linka on 09.04.2015.
 */
public class CommandParser {

    public boolean commandIsValid(String command) {
        return command.matches("tail -n\\d+\\s.+");
    }

}
