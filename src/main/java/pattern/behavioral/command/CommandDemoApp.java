package pattern.behavioral.command;

public class CommandDemoApp {

    public static void main(String[] args) {
        MyFile myFile = new MyFile("simpleFile.txt");
        FileOperationPerformer performer = new FileOperationPerformer();

        performer.executeOperation(new CreateFileOperation(myFile), "aaaabbbb");
        System.out.println(myFile.getContent());
        System.out.println("==================================");
         performer.executeOperation(new UpadateFileOperation(myFile), "xxxxxxrtyui");
        System.out.println(myFile.getContent());
        System.out.println("==================================");
         performer.executeOperation(new CreateFileOperation(myFile), "rthyguhjyt");
        System.out.println(myFile.getContent());
        System.out.println("==================================");

        System.out.println("Historia operacij:");
        performer.getOperationHistory()
                .forEach(System.out::println);
    }
}
