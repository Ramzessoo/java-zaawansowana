package pattern.behavioral.command;

public class UpadateFileOperation implements FileOperation{

    public MyFile myFile;

    public UpadateFileOperation(MyFile myFile) {
        this.myFile = myFile;
    }

    @Override
    public String performOperation(String content) {
        System.out.println(getClass().getSimpleName() + " called for" + myFile.getFileName());
        return myFile.updateContent(content);
    }
}
