package database;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class DatabaseManagement {
	
    public static final String database_url = "jdbc:mysql://localhost/Parking Management Database";
    public static Connection connection = null;
    public static Statement statement = null;
    public static PreparedStatement  Prepared = null;

    public DatabaseManagement() {      
        CreateConnetion();  
    }
    
    
    public void CreateConnetion() {
    try {
        Class.forName("com.mysql.jdbc.Driver");       
        connection = DriverManager.getConnection(database_url,"root","");
        statement = connection.createStatement();
    } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Data Base Connetion Error");
            e.printStackTrace();
        }
    }
    
    
    public void InsertIntoMember(ArrayList row){
        try{
            
            String query = "insert into member(Name,ID,EmailAddress,CarID,CarName,CarModel,CarColor)values("
                            + "'" + row.get(0) + "'," 
                            + "'" + row.get(1) + "',"
                            + "'" + row.get(2) + "',"
                            + "'" + row.get(3) + "',"
                            + "'" + row.get(4) + "',"
                            + "'" + row.get(5) + "',"
                            + "'" + row.get(6) + "'"
                            + ")";
            
            System.out.println(query);
            statement.executeUpdate(query);
            JOptionPane.showMessageDialog(null,"Member info Added Successfully");
            
        }catch(HeadlessException | SQLException e){
          JOptionPane.showMessageDialog(null,"Member ID not available"," Error !",JOptionPane . ERROR_MESSAGE); 
          System.out.println(e);
        }
    }
    
        public void InsertIntoUNMember(ArrayList row){
        try{
            
            String query = "insert into unmember(Name,ID,EmailAddress,CarID,CarName,CarModel,CarColor)values("
                            + "'" + row.get(0) + "'," 
                            + "'" + row.get(1) + "',"
                            + "'" + row.get(2) + "',"
                            + "'" + row.get(3) + "',"
                            + "'" + row.get(4) + "',"
                            + "'" + row.get(5) + "',"
                            + "'" + row.get(6) + "'"
                            + ")";
            
            System.out.println(query);
            statement.executeUpdate(query);
            JOptionPane.showMessageDialog(null,"Member info Added Successfully");
            
        }catch(HeadlessException | SQLException e){
          JOptionPane.showMessageDialog(null,"Member ID not available"," Error !",JOptionPane . ERROR_MESSAGE); 
          System.out.println(e);
        }
    }
   
    
        public void InsertIntoUser(ArrayList row){
        try{
            
            String query = "insert into user(UserID,UserName,UserEmailAddress,UserUsername,UserPassword,Gender,UserAddress)values("
                            + "'" + row.get(0) + "'," 
                            + "'" + row.get(1) + "',"
                            + "'" + row.get(2) + "',"
                            + "'" + row.get(3) + "',"
                            + "'" + row.get(4) + "',"
                            + "'" + row.get(5) + "',"
                            + "'" + row.get(6) + "'"
                            + ")";
            
            System.out.println(query);
            statement.executeUpdate(query);
            JOptionPane.showMessageDialog(null,"User info Added Successfully");
            
        }catch(HeadlessException | SQLException e){
          JOptionPane.showMessageDialog(null,"Username or ID not  available"," Error !",JOptionPane . ERROR_MESSAGE); 
          System.out.println(e);
        }
    }
    
        public void InsertIntoCarList(ArrayList row){
        try{
            
            String query = "insert into carlist(SlotNumber,Name,ID,CarID,CarName,CarModel,CarColor,SlotTime)values("
                            + "'" + row.get(0) + "'," 
                            + "'" + row.get(1) + "',"
                            + "'" + row.get(2) + "',"
                            + "'" + row.get(3) + "',"
                            + "'" + row.get(4) + "',"
                            + "'" + row.get(5) + "',"
                            + "'" + row.get(6) + "',"
                            + "'" + row.get(7) + "'"
                            + ")";
            
            System.out.println(query);
            statement.executeUpdate(query);
            JOptionPane.showMessageDialog(null,"Car info Added Successfully");
            
        }catch(HeadlessException | SQLException e){
          JOptionPane.showMessageDialog(null,"Slot not available"," Error !",JOptionPane . ERROR_MESSAGE); 
          System.out.println(e);
        }
    }
        
        public void InsertIntoCarHistory(ArrayList row){
        try{
            
            String query = "insert into carhistory(SlotNumber,Name,ID,EmailAddress,CarID,CarName,CarModel,CarColor,SlotTime)values("
                            + "'" + row.get(0) + "'," 
                            + "'" + row.get(1) + "',"
                            + "'" + row.get(2) + "',"
                            + "'" + row.get(3) + "',"
                            + "'" + row.get(4) + "',"
                            + "'" + row.get(5) + "',"
                            + "'" + row.get(6) + "',"
                            + "'" + row.get(7) + "',"
                            + "'" + row.get(8) + "'"
                            + ")";
            
            System.out.println(query);
            statement.executeUpdate(query);            
        }catch(SQLException e){
          JOptionPane.showMessageDialog(null,"can't add car in to history"," Error !",JOptionPane . ERROR_MESSAGE); 
          System.out.println(e);
          e.printStackTrace();
        }
    }

    public ResultSet execQuery(String query) {
	ResultSet result;
	try {
            statement = connection.createStatement();
            result =  statement.executeQuery(query);
	} catch (SQLException e) {
            System.out.println("Exception at exeQuery:dataHandler" + e.getLocalizedMessage());
            return null;
	}finally {
            
	}
	return result;	
    } 
    
    public PreparedStatement execUpdateOrDelete(String query){
        PreparedStatement prepared;
        try {
            Class.forName("com.mysql.jdbc.Driver");       
            connection = DriverManager.getConnection(database_url,"root","");
            prepared = connection.prepareStatement(query);
            prepared.executeUpdate();
        }catch (SQLException | ClassNotFoundException e) {
            System.out.println("Exception at exeQuery:dataHandler" + e.getLocalizedMessage());
            return null;
	}finally {
            
	}
	return prepared;        
    }
}