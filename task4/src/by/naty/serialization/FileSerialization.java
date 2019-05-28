package by.naty.serialization;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileSerialization implements Serialization {

    private final Scanner reader;
    private static String DELIMITER = "$";

    public FileSerialization(File file)
    {
        try {
            reader = new Scanner(new BufferedInputStream(new FileInputStream(file)));
        }
        catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public int readInteger()
    {
        String next = reader.next();
        if (DELIMITER.equals(next)) {
            throw new RuntimeException("Reading past delimiter");
        }
        return Integer.valueOf(next);
    }

    @Override
    public double readDouble()
    {
        String next = reader.next();
        if (DELIMITER.equals(next)) {
            throw new RuntimeException("Reading past delimiter");
        }
        return Double.valueOf(next);
    }

    @Override
    public String readString()
    {
        String next = reader.next();
        if (DELIMITER.equals(next)) {
            throw new RuntimeException("Reading past delimiter");
        }
        return next;
    }

    @Override
    public boolean readDelimiter()
    {
        String next = reader.next();
        return DELIMITER.equals(next);
    }

    @Override
    public boolean hasMoreTokens()
    {
        return reader.hasNext();
    }

    @Override
    public void close()
    {
        reader.close();
    }
}
