package pattern.structural.facade;

import java.sql.Connection;

public class OracleRaportGenerator {

    public static Connection getOracleDBConnection() {
        System.out.println("Tu łączymy się z bazą Oracle");
        return null;
    }

    public void generatePDFReport(String tableName, Connection connection) {
        System.out.println("Generator raportu PDF");
    }

    public void generateHtmlRaport(String tableName, Connection connection) {
        System.out.println("Generator raportu HTML");
    }
}
