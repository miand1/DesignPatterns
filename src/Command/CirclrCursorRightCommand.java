package Command;

public class CirclrCursorRightCommand implements Command{
    private CircleCursor circleCursor;

    public CirclrCursorRightCommand(CircleCursor circleCursor) {
        this.circleCursor = circleCursor;
    }

    @Override
    public void execute() {
        circleCursor.moveRight();
    }
}