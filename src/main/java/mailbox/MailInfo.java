package mailbox;

import lombok.Getter;
import lombok.Setter;
import java.util.HashMap;

@Getter @Setter
public class MailInfo {
    private Client client;
    private MailCode mailCode;

    public String getText(){
        HashMap<String, String> templates = new HashMap<>();
        templates.put("%NAME", client.getName());
        templates.put("%AGE", Integer.toString(client.getAge()));
        String greeting = mailCode.generateText();

        for (String key: templates.keySet()){
            greeting = greeting.replace(key, templates.get(key));
        }
        return greeting;
    }

    public String getEmail(){
        return client.getEmail();
    }

}