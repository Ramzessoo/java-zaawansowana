package solid.dip;

public class FileRepository {

    public void saveTask(String filename) {
        System.out.println("Saving to file: " + filename);
    }

    public void delateTask(String filename) {
        System.out.println("Deleting from file: " + filename);
    }

}
