package libraryDatabase;


import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public final class DatabaseHandler {
    private static DatabaseHandler handler;
    
    private static final String DB_URL = "jdbc:derby:database;create=true";
    private static Connection conn = null;
    private static Statement statement =null;
    
    public DatabaseHandler(){
        createConnection();
    }
    
    
    void createConnection(){
        try{
            conn = DriverManager.getConnection(DB_URL);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Cant load database", "Database Error", JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }
    }
    
    void settingBookTable(){
        String TABLE_NAME = "BOOK";
        try{
            statement = conn.createStatement();
            
            DatabaseMetaData dbm =conn.getMetaData();
            ResultSet tables = dbm.getTables(null,null, TABLE_NAME.toUpperCase(), null);
            
            if(tables.next()){
                System.out.println("Table "+TABLE_NAME+"już istnieje!");
            }else{
                statement.execute("CREATE TABLE" + TABLE_NAME + "("
                        + "	id varchar(200) primary key,\n"
                        + "	title varchar(200),\n"
                        + "	author varchar(200),\n"
                        + "	publisher varchar(100),\n"
                        + "	isAvail boolean default true"
+ " )");
            }
        }catch(SQLException e){
            System.err.println(e.getMessage());
        }
    }
}
