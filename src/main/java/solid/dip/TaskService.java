package solid.dip;

public class TaskService {
    private FileRepository repository = new FileRepository();

    public void addTask(String filename) {
        repository.saveTask(filename);
    }

    public void removeTask(String filename) {
        repository.delateTask(filename);
    }
}
