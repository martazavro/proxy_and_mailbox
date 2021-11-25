package proxy;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.io.*;


class RealImageTest {
    RealImage image = new RealImage("fotka.png");
    private final ByteArrayOutputStream captor = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(captor));}

    @Test
    void loadFromDisk() {
        image.loadFromDisk();
        assertEquals(captor.toString().trim(), "Loading from disk...");}

    @Test
    void display() {
        image.display();
        assertEquals(captor.toString().trim(), "This is Real Image");}
}