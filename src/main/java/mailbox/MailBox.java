package mailbox;
import lombok.Getter;
import java.util.ArrayList;
import java.util.List;

@Getter
public class MailBox {

    private List<MailInfo> infos = new ArrayList<>();

    public void addMailInfo(MailInfo mailInfo) {
        infos.add(mailInfo);
    }

    public void sendAll(){
        for (int i = 0; i < infos.size(); i++){
            MailSender.sendMail(infos.get(i));
        }
    }
}