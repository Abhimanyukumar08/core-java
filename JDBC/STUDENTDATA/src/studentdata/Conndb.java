/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package studentdata;

import java.sql.*;
import java.util.*;
import java.util.logging.Logger;
import java.util.logging.Level;


public class Conndb {
    public static Connection conn()
    {
        Connection con = null;
        try{
            con = DriverManager.getConnection("jdbc:derby://localhost:1527/studentTable","root","root");
        }
        catch(SQLException ex){
            Logger.getLogger(Conndb.class.getName()).log(Level.SEVERE,null,ex);
            
        }
        return con;
    }
}
