package mailbox;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;

class MailBoxTest {
    public MailBox mailBox;
    public MailSender mailSender;
    public Client client;
    public MailInfo mailInfo;
    public ArrayList<MailInfo> infoo;

    @BeforeEach
    void setUp() {
        mailSender = new MailSender();
        mailBox = new MailBox();
        client = new Client("Martusia", 18, Gender.FEMALE, "martusia@gmail.com");
        mailInfo = new MailInfo();
        mailInfo.setClient(client);
        mailInfo.setMailCode(MailCode.HAPPY_BIRTHDAY);
        infoo = new ArrayList<MailInfo>();
        infoo.add(mailInfo);
    }

    @Test
    void addMailInfo() {
        mailBox.addMailInfo(mailInfo);
        assertEquals(mailBox.getInfos(), infoo);
    }
}