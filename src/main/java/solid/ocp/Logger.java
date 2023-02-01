package solid.ocp;

import static solid.ocp.LogDestination.CONSOLE;

public class Logger {

    private LogDestination loqDestination;

    public void logger(LogDestination logDestination) {
        this.loqDestination = logDestination;
    }

    public void log(String logMessage) {
        switch (loqDestination) {
            case CONSOLE:
                System.out.println("Writing "+ logMessage + " to console");
                break;
            case DB:
                System.out.println("Writing "+ logMessage + " to console");
                break;


        }
    }
}
