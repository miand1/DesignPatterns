package Command;

public class RemoteController {
    private Command upCommand,downCommand, rightCommand, leftCommand;

    public RemoteController(Command upCommand, Command downCommand, Command rightCommand, Command leftCommand) {
        this.upCommand = upCommand;
        this.downCommand = downCommand;
        this.rightCommand = rightCommand;
        this.leftCommand = leftCommand;
    }

    public void pressUp(){
        upCommand.execute();
    }
    public void pressDown(){
        downCommand.execute();
    }
    public void pressRight(){
        rightCommand.execute();
    }
    public void pressLeft(){
        leftCommand.execute();
    }
}
