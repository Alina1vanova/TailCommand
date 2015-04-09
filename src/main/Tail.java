package main;

import java.io.File;

/**
 * Created by linka on 09.04.2015.
 */
public class Tail {
    private File file;
    private String tale;
    private String taleLength;

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    public String getTale() {
        return tale;
    }

    public void setTale(String tale) {
        this.tale = tale;
    }

    public String getTaleLength() {
        return taleLength;
    }

    public void setTaleLength(String taleLength) {
        this.taleLength = taleLength;
    }
}
