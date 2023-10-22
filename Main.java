public class Main {
    public static void main(String[] args) { //main running class
        AmericanPlug plug = new Adapter(); //create new object for adapter
        plug.ConnectLaptop();
        plug.ConnectTeapot();
        plug.ConnectTV();
    }
}