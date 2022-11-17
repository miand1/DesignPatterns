package Adapter;

public class Demo {

    public static void main(String[] args) {
        SocketAdapter socketAdapter = new SocketAdapterImplementation();
        Volt v1 = socketAdapter.get30Volts();
        System.out.println(v1.getVolts());
    }
}
