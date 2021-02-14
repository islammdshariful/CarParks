package login;

import database.DatabaseManagement;


public class Main{
    public static void main(String[] args) {
        DatabaseManagement database = new DatabaseManagement();
        Login Mainv = new Login();
        Mainv.setVisible(true);
        
    }
    
}