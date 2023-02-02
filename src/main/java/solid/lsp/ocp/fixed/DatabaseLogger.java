package solid.lsp.ocp.fixed;

public class DatabaseLogger implements MessageLogger {

    @Override
    public void log(String message) throws Exception {
        System.out.println("Logging to database: " + message);
    }
}
