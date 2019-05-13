package structural.proxy.sample;

public class ProxyImage implements Image {
	
	   private RealImage realImage;
	   private String fileName;

	   public ProxyImage(String fileName){
	      this.fileName = fileName;
	   }

	@Override
	public void display() {
		if(realImage == null){
	         realImage = new RealImage(fileName);
	      }
	      realImage.display();

	}
	
	
	public static void main(String[] args) {
		Image image = new ProxyImage("test_10mb.jpg");

	      //image will be loaded from disk
	      image.display(); 
	      System.out.println("");
	      
	      //image will not be loaded from disk
	      image.display(); 
	}

}
