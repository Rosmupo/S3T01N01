public class Command {
    private int id;

    public Command(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Command{" +
                "id=" + id +
                '}';
    }
}
