package Observer;

public class Demo {
    public static void main(String[] args) {
        WhatsappGroup whatsappGroup = new WhatsappGroup();

        Observer observer1 = new Participant("Participant One");
        Observer observer2 = new Participant("Participant Two");
        whatsappGroup.register(observer1);
        whatsappGroup.register(observer2);

        observer1.setSubject(whatsappGroup);
        observer2.setSubject(whatsappGroup);

        whatsappGroup.sendMessage("Hello");

        whatsappGroup.unregister(observer2);
        observer2.setSubject(null);
        whatsappGroup.sendMessage("Hi");
    }
}
