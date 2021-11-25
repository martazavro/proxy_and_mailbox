package proxy;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class ProxyImage implements Image{
    private RealImage realImage;
    private String fileName;

    ProxyImage(String fileName){
        realImage = new RealImage(fileName);
        this.fileName = fileName;
    }

    @Override
    public void display() {
        System.out.println("Image displaying...");
        realImage.display();
    }
}