package Observer;

public class Participant implements Observer{
    private Subject whatsappGroup;
    private String name;

    public Participant(String name) {
        this.name = name;
    }

    @Override
    public void update() {
        String msg = (String)whatsappGroup.getUpdate(this);
        if(msg!=null){
            System.out.println(name+"'s New Message: "+msg);
        }
    }

    @Override
    public void setSubject(Subject subject) {
        this.whatsappGroup = subject;
    }
}
