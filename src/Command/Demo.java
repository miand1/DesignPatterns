package Command;

public class Demo {
    public static void main(String[] args) {
        CircleCursor circleCursor = new CircleCursor();
        CircleCursorUpCommand circleCursorUpCommand = new CircleCursorUpCommand(circleCursor);
        CirclrCursorRightCommand circlrCursorRightCommand = new CirclrCursorRightCommand(circleCursor);
        CircleCursorLeftCommand circleCursorLeftCommand = new CircleCursorLeftCommand(circleCursor);
        CircleCursorDownCommand cursorDownCommand = new CircleCursorDownCommand(circleCursor);

        RemoteController remoteController = new RemoteController(circleCursorUpCommand,cursorDownCommand,circlrCursorRightCommand,circleCursorLeftCommand);

        remoteController.pressDown();
    }
}
