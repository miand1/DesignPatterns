package Adapter;

public class SocketAdapterImplementation extends Socket implements SocketAdapter{
    @Override
    public Volt get60Volts() {
        Volt v = getVolt();
        return convertVolt(v,2);
    }

    @Override
    public Volt get30Volts() {
        Volt v = getVolt();
        return convertVolt(v,4);
    }

    @Override
    public Volt get12Volts() {
        Volt v = getVolt();
        return convertVolt(v,10);    }

    public Volt convertVolt(Volt v, int i){
        return new Volt(v.getVolts()/i);
    }
}
