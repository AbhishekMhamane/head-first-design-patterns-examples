package proxy_pattern;

public class Main {

  public static void main(String[] args) {
    Image image = new ProxyImage("test.jpg");

    image.display();

    image.display();
  }
}
