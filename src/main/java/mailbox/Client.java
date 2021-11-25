package mailbox;

import lombok.Getter;

@Getter
public class Client {
    private int id; private int age;
    private String email;
    private String name;
    private Gender sex;

    public Client(String name, int age, Gender sex, String email) {
        id = IdGenerator.generateid();
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.email = email;}

    private static class IdGenerator {
        private static int counter = 0;

        public static int generateid() {
            counter++;
            return counter;
        }}}