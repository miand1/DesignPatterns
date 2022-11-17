package Command;

public class CircleCursorDownCommand implements Command{
    private CircleCursor circleCursor;

    public CircleCursorDownCommand(CircleCursor circleCursor) {
        this.circleCursor = circleCursor;
    }

    @Override
    public void execute() {
        circleCursor.moveDown();
    }
}
