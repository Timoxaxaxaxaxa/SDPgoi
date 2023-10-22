public class Adapter extends EuPlug implements AmericanPlug{ //adapter for convert

    @Override //overiding Plug method from Plug interfcae
    public void ConnectLaptop() {
        adapterLaptop(); //replacing method in American to Eu
    }

    @Override
    public void ConnectTeapot() {
        adapterTeapot();
    }

    @Override
    public void ConnectTV() {
        adapterTV();
    }

}