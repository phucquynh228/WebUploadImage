/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dal;

/**
 *
 * @author PhucQuynh
 */
import java.sql.Connection;
import java.sql.DriverManager;

public class DBContext {

    protected Connection connection;

    public DBContext() {
        try {
            String url = "jdbc:sqlserver://localhost:1433;databaseName=DriveImage;encrypt=false";
            String user = "sa";
            String pass = "123456";

            connection = DriverManager.getConnection(url, user, pass);

            if (connection != null) {
                System.out.println("Connected to database successfully!");
            }

        } catch (Exception e) {
            System.out.println("Connect failed!");
            e.printStackTrace();
        }
    }
}
