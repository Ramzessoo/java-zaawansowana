package pattern.behavioral.templateMethod;

public abstract class NewsProvider {
    private String message;

    //metoda do implementacji
    public abstract boolean authorize();

    //metoda - część algorytmu, już zaimplementowana, reszta niezmienna
    public final boolean sendMessage() {
        System.out.println("Wysyłanie wiadomości: " + message);
        return true;
    }

    //metoda do implementacji
    public abstract boolean endConnection();

    //metoda z algorytmem
    public final void provideNews() {
        if (authorize()) {
            sendMessage();
            endConnection();
        }
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
