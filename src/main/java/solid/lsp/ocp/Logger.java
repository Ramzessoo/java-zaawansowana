package solid.lsp.ocp;

public class Logger {

    private LogDestination loqDestination;

    public void logger(LogDestination logDestination) {
        this.loqDestination = logDestination;
    }

    public void log(String logMessage) {
        switch (loqDestination) {
            case CONSOLE:
                System.out.println("Writing " + logMessage + " to console");
                break;
            case DB:
                System.out.println("Writing " + logMessage + " to console");
                break;
            /**
            * Dołożenie FILE łamie zasadę OCP bo wcześniej mieliśmy 2 opcje zapisywania logów: konsola i baza danych
            * Jeśli mamy np. testy sprawdzające że tylko te dwie opcje mogą być wybrane
            * to po dołożeniu opcji FILE te testy nam się wywalą
             */
            case FILE:
                System.out.println("Newly added writing to file, message: " + logMessage);
                break;
            default:
                throw new IllegalArgumentException("Not supported log destination");

        }
    }
}
