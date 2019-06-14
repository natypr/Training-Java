package main.by.naty.model.serialization;

import org.apache.log4j.Logger;

import java.io.BufferedInputStream;
import java.io.InputStream;
import java.util.Scanner;

public class FileSerialization implements ISerialization {
    private static final Logger log = Logger.getLogger(FileSerialization.class);

    private final Scanner reader;
    private static String DELIMITER = "$";

    public FileSerialization(InputStream stream)
    {
        reader = new Scanner(new BufferedInputStream(stream));
    }

    @Override
    public int readInteger()
    {
        log.info("read int");
        String next = reader.next();
        if (DELIMITER.equals(next)) {
           // log.log(Level.WARNING, "Reading Int past delimiter!", new Throwable());
            log.warn("Reading Int past delimiter!");
            throw new RuntimeException("Reading past delimiter");
        }
        try {
            return Integer.valueOf(next);
        } catch (NumberFormatException e){
            return -1;
        }

    }

    @Override
    public double readDouble()
    {
        log.info("read double");
        String next = reader.next();
        if (DELIMITER.equals(next)) {
            log.warn("Reading Double past delimiter!");
            throw new RuntimeException("Reading past delimiter");
        }
        return Double.valueOf(next);
    }

    @Override
    public String readString()
    {
        log.info("read string");
        String next = reader.next();
        if (DELIMITER.equals(next)) {
            log.warn("Reading String past delimiter!");
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
