package exceptions;

public class Main {
    public static void main(String[] args) {
        throwException();
//        try {
//            throwExceptions();
//        } catch (RuntimeException ex) {
//            System.out.println(ex.getCause());
//            ex.printStackTrace();
//
//        }
    }

    public static void throwException() {
        throw new RuntimeException("Błąd");
    }
}
