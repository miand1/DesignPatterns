package Command;

public class CircleCursorUpCommand implements Command{
    private CircleCursor circleCursor;

    public CircleCursorUpCommand(CircleCursor circleCursor) {
        this.circleCursor = circleCursor;
    }

    @Override
    public void execute() {
        circleCursor.moveUp();
    }
}
