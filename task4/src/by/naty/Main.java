package by.naty;


import by.naty.model.util.LoadFile;

import java.io.File;

public class Main {
    public static void main(String[] args) {

        String file = "employee.txt";
        LoadFile.loadFromFile(new File(file));

    }
}
