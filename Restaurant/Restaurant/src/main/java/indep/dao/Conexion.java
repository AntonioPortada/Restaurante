package indep.dao;

import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.swing.JOptionPane;

/**
 *
 * @author Administrador
 */
public class Conexion {
    
    private Connection con;
    
    public Conexion(){
        loadConection();
    }
    
    private void loadConection(){
        try{
            //para trabajar con oracle
            //Class.forName("oracle.jdbc.driver.OracleDriver");
            //con = DriverManager.getConnection("jdbc:oracle:thin:@172.29.1.35:1521/produccion", "produccion", "produccion");
            
            //para trabajar con MySqls
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/produccion", "root", "");
        } 
        catch(ClassNotFoundException ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
            ex.printStackTrace();
        }
        catch (SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
            e.printStackTrace();
        }
    }
    
    public int getLevel(String user, String pass){
        String query = "select nivel from usuarios where user_name like '"+user+"' and pass like '"+pass+"'";
        int level = 0;
        
        try(Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query))
        {
            while(rs.next())
                level = rs.getInt(1);
            
            con.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            e.printStackTrace();
        }
        //System.out.println(level);
        return level;
    }
}
