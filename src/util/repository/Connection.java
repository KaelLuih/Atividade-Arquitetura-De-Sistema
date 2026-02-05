package util.repository;

import java.sql.DriverManager;
import java.sql.SQLException;

public class Connection {


    private final static String URL = "jdbc:mysql://localhost:3306/biblioteca_db?useSSL=false&serverTimezone=UTC";
    private final static String NAME = "root";
    private final static String SENHA = "mysqlPW";


    public static Connection conexao()throws SQLException {
        return (Connection) DriverManager.getConnection(URL,NAME,SENHA);
    }

}
