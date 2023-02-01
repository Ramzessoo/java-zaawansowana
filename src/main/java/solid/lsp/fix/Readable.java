package solid.lsp.fix;

public interface Readable {

    byte[] read(String filename);

    default void someNonAbstractMethod() {
        System.out.println("Non abstract method called from interface");
    }

    static void someStaticMethod() {
        System.out.println("Call Static");
    }

    private void somePrivateMethod() {
        System.out.println("Private call");
    }
}
