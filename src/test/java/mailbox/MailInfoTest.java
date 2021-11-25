package mailbox;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MailInfoTest {
    public Client client;
    public MailInfo mailInfo;
    @BeforeEach
    void setUp() {
        client = new Client("Martusia", 18, Gender.FEMALE, "martasmile@gmail.com");
        mailInfo = new MailInfo();
        mailInfo.setClient(client);
        mailInfo.setMailCode(MailCode.GREETINGS);
    }

    @Test
    void getClientEmail() {
        assertEquals(mailInfo.getEmail(), "martasmile@gmail.com");
    }
}