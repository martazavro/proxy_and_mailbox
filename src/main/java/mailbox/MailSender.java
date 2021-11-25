package mailbox;

public class MailSender {
    public static void sendMail(MailInfo info){
        System.out.println(info.getEmail() + "New email for"+info.getEmail() +":\n" + info.getText());
    }
}
