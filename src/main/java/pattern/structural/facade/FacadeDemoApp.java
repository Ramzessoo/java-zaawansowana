package pattern.structural.facade;

import java.sql.Connection;
import java.util.Collections;

public class FacadeDemoApp {
    public static void main(String[] args) {
        traditionalCall();
        facadeCall();
    }

    private static void traditionalCall() {
        /**
         * Tradycyjne korzystanie z klaqs powoduje że programista "końcowy" użuywa naszego kodu
         * niekoniecznie wiedząc co i jak używać, robi to "żeby zadziałało", "żeby się kompilowało"
         * itp., niekoniecznie optymaplnie, albo zgodnia z założeniami autora kodu do generowania raportu.
         * */

        Connection connection = MySQLRaportGenerator.getMySQLDBConnection();
        var generator = new MySQLRaportGenerator();
        generator.generateHtmlRaport("Customers", connection);

        System.out.println("===================================");

        connection = OracleRaportGenerator.getOracleDBConnection();
        var generator1 = new OracleRaportGenerator();
        generator1.generateHtmlRaport("Cars", connection);
    }
    private static void facadeCall() {
        ReportGeneratorFacade.generateRaport(ReportGeneratorFacade.DBType.ORACLE, ReportGeneratorFacade.ReportType.PDF, "Customers");
    }
}
