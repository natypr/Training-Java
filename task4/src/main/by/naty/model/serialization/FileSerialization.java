package main.by.naty.model.serialization;

import java.io.BufferedInputStream;
import java.io.InputStream;
import java.util.Scanner;

public class FileSerialization implements Serialization {

    private final Scanner reader;
    private static String DELIMITER = "$";

    public FileSerialization(InputStream stream)
    {
        reader = new Scanner(new BufferedInputStream(stream));
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
