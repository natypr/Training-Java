package main.by.naty.model.serialization;

public interface Serialization extends AutoCloseable {

    int readInteger();
    double readDouble();
    String readString();

    boolean readDelimiter();
    boolean hasMoreTokens();

}
