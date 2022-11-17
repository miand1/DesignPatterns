package Command;

public class CircleCursorLeftCommand implements Command{
    private CircleCursor circleCursor;

    public CircleCursorLeftCommand(CircleCursor circleCursor) {
        this.circleCursor = circleCursor;
    }

    @Override
    public void execute() {
        circleCursor.moveLeft();
    }
}
