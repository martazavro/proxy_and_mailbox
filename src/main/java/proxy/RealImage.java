package proxy;

public class RealImage implements Image{
    String fileName;
    public RealImage(String realImageFileName) {fileName = realImageFileName;}

    public void display() {
        System.out.println("This is Real Image");
    }

    public void loadFromDisk() {
        System.out.println("Loading from disk...");
    }
}