package pattern.structural.facade;

import java.sql.Connection;

public class ReportGeneratorFacade {

    public static void generateRaport(DBType dbType, ReportType reportType, String tableName) {
        Connection connection = null;
        switch (dbType) {
            case ORACLE:
                connection = OracleRaportGenerator.getOracleDBConnection();
                var generator = new OracleRaportGenerator();
                switch (reportType) {
                    case PDF:
                        generator.generatePDFReport(tableName, connection);
                        break;
                    case HTML:
                        generator.generateHtmlRaport(tableName, connection);
                        break;
                }
                break;
            case MY_SQL:
                connection = OracleRaportGenerator.getOracleDBConnection();
                var generator1 = new OracleRaportGenerator();
                switch (reportType) {
                    case PDF:
                        generator1.generatePDFReport(tableName, connection);
                        break;
                    case HTML:
                        generator1.generateHtmlRaport(tableName, connection);
                        break;
                }
                break;
        }
    }

    public enum DBType {
        ORACLE,
        MY_SQL,
    }

    public enum ReportType {
        HTML,
        PDF
    }
}
