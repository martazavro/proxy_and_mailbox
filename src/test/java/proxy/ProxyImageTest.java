package proxy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.io.*;
import static org.junit.jupiter.api.Assertions.*;

class ProxyImageTest {
    ProxyImage image = new ProxyImage("fotka.png");
    private ByteArrayOutputStream captor = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(captor));
    }

    @Test
    void display() {
        image.display();
        assertEquals(captor.toString().trim(), "Image displaying...\nThis is Real Image");
    }
}