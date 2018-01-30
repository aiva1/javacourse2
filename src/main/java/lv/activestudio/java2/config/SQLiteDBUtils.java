package lv.activestudio.java2.config;

import org.springframework.beans.factory.annotation.Autowired;

import javax.sql.DataSource;
import javax.annotation.PostConstruct;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * When Spring initializes the Java application,
 * the @PostConstruct annotation in this file will cause the initialize method to be executed.
 * This method will recreate the SQLite database and table each time you run the application.
 */
public class SQLiteDBUtils {

    @Autowired
    private DataSource dataSource;

    @PostConstruct
    public void initialize(){
        try {
            Connection connection = dataSource.getConnection();
            Statement statement = connection.createStatement();
            statement.execute("DROP TABLE IF EXISTS TEACHERS");
            statement.executeUpdate(
                    "CREATE TABLE TEACHERS(" +
                            "id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                            "first_name varchar(30) NOT NULL, " +
                            "last_name varchar(30) NOT NULL, " +
                            "bio varchar(30), " +
                            "photo varchar(30))"
            );
            statement.executeUpdate(
                    "INSERT INTO TEACHERS " +
                            "(first_name, last_name, bio, photo) " +
                            "VALUES " + "('Kate', 'Billing', 'nobio', 'photo1.jpg')"
            );
            statement.executeUpdate(
                    "INSERT INTO TEACHERS " +
                            "(first_name, last_name, bio, photo) " +
                            "VALUES " + "('Grace', 'Neild', 'fan of trx', 'grace.jpg')"
            );
            statement.close();
            connection.close();
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
