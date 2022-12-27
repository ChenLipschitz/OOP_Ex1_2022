package observer;
import java.util.ArrayList;

public class GroupAdmin implements Sender{

    private ArrayList <Member> clients;
    private UndoableStringBuilder status;

    // constructor
    public GroupAdmin() {
        this.clients = new ArrayList<Member>();
        this.status = new UndoableStringBuilder();
    }

    @Override
    public void register(Member obj) {
        this.clients.add(obj);
    }

    @Override
    public void unregister(Member obj) {
        this.clients.remove(obj);
    }

    @Override
    public void insert(int offset, String obj) {
        this.status.insert(offset, obj);
        for (Member client : this.clients) {
            client.update(status);
        }
    }

    @Override
    public void append(String obj) {
        this.status.append(obj);
        for (Member client : this.clients) {
            client.update(status);
        }
    }

    @Override
    public void delete(int start, int end) {
        this.status.delete(start, end);
        for (Member client : this.clients) {
            client.update(status);
        }
    }

    @Override
    public void undo() {
        this.status.undo();
        for (Member client : this.clients) {
            client.update(status);
        }
    }
    public ArrayList<Member> getClients() {
        return this.clients;
    }

    public UndoableStringBuilder getStatus() {
        return this.status;
    }

    @Override
    public String toString() {
        return "GroupAdmin{" +
                "situations=" + this.status +
                '}';
    }

}
