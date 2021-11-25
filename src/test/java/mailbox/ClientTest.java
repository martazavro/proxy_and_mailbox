package mailbox;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClientTest{
    Client client;

    @BeforeEach
    void setUp() {
        client = new Client("MartaSmile", 18, Gender.FEMALE, "martasmile@gmail.com");
    }

    @Test
    void TestGetName() {
        assertEquals(client.getName(),"MartaSmile");
    }

    @Test
    void TestGetAge() {
        assertEquals(client.getAge(),18);
    }

    @Test
    void testGetSex() {
        assertEquals(client.getSex(),Gender.FEMALE);
    }

    @Test
    void TestGetId() {
        assertEquals(client.getId(),2);
    }


    @Test
    void getEmail() {
        assertEquals(client.getEmail(),"martasmile@gmail.com");
    }
}