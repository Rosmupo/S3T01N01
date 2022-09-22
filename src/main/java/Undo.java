import java.util.ArrayList;

public class Undo {
    private static Undo instance= new Undo();

    private ArrayList<Command> listCommand= new ArrayList<>();

    private Undo(){
    }

    public static Undo getInstance(){
        if (instance == null){
            Undo instance = new Undo();
        }
        return instance;
    }

    public Command addCommand(int id){
        Command command = new Command(id);
        listCommand.add(command);
        return command;
    }

    public void deleteCommand(int id) throws Exception{
        listCommand.remove(findCommand(id));
        System.out.println("Se ha borrado la comanda " + id);
    }

    public Command findCommand(int id) throws Exception{
        for (Command currentCommand: listCommand ){
            if (currentCommand.getId()==id){
                System.out.println(currentCommand.toString());
                return currentCommand;
            }
        }
        throw new Exception("no se ha encontrado la comanda");
    }

    public ArrayList<Command> getListCommand(){
        return listCommand;
    }

}
