package proxy;

public class ProxyPatternDemo {
    public static void main(String[] args) {
        ProxyImage fotka = new ProxyImage("fotka.jpg");
        fotka.display();
    }
}
