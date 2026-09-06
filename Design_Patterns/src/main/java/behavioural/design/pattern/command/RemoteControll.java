package behavioural.design.pattern.command;

import java.util.Stack;

public class RemoteControll {

    private Stack<Command> history = new Stack<>();
    public void executeCommand(Command command) {
        command.execute();
        history.push(command);
    }

    public void undoLast(){

        if(!history.isEmpty()){
            Command lastCommand = history.pop();
            lastCommand.undo();
        }else {
            IO.println("Nothing to undo...");
        }
    }
}
