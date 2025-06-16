public class RealImage implements Image {
    private String fileName;
  
    public RealImage(String fileName) {
        this.fileName = fileName;
        loadImageFromServer();
    }
//Method
    private void loadImageFromServer() {
        System.out.println("Loading image from remote server: " + fileName);
    }

    @Override
    public void display() {
        System.out.println("Displaying: " + fileName);
    }
}
