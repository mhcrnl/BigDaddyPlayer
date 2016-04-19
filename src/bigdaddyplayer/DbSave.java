/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bigdaddyplayer;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author root
 */
public class DbSave {
        //JDBC driver name and database URL
        static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
        static final String DB_URL = "jdbc:mysql://localhost/BigDaddy";
        //Database credentials
        static final String USER = "root";
        static final String PASS = "root";
        
    
    
     public void set_detail(String location,String name,String artist,String album,int rating,String genre,String comments){      
        Connection conn = null;
        Statement stmt = null;
        
        
        
            try{
            Class.forName("com.mysql.jdbc.Driver");
            //STEP 3: Open a connection
            System.out.println("Connecting to database...");
            conn = DriverManager.getConnection(DB_URL,USER,PASS);
            //STEP 4: Execute a query
            //System.out.println("Creating statement...");
            stmt = conn.createStatement();
            String sql;
            sql = "UPDATE OfDetail SET SName='"+name+"',Artist='"+artist+"',Rating="+rating+",Genre='"+genre+"',Comment='"+comments+"' WHERE location='"+location+"'";
            Boolean ret = stmt.execute(sql);
            System.out.println("Return value is : " + ret.toString() );
            /*
            sql = "SELECT id, first, last, age FROM Employees";
            ResultSet rs = stmt.executeQuery(sql);
            //STEP 5: Extract data from result set
            while(rs.next()){
                    //Retrieve by column name
                    int id
                     = rs.getInt("id");
                    int age = rs.getInt("age");
                    String first = rs.getString("first");
                    String last = rs.getString("last");
                    //Display values
                    System.out.print("ID: " + id);
                    System.out.print(", Age: " + age);
                    System.out.print(", First: " + first);
                    System.out.println(", Last: " + last);
            }*/
            //STEP 6: Clean-up environment
            //rs.close();
            stmt.close();
            conn.close();
            }
            catch(SQLException | ClassNotFoundException se)
            {
            }finally{
            //finally block used to close resources
            try{
            if(stmt!=null) {
                stmt.close();
            }
            }catch(SQLException se2){
            }// nothing we can do
            try{
                if(conn!=null) {
                    conn.close();
                }
            }catch(SQLException se){
            }//end finally try
            }//end try
                System.out.println("Goodbye!");
            }//end main
            //end FirstExample
    public void set_detail(String location){      
            Connection conn = null;
            Statement stmt = null;
        
        
        
            try{
            Class.forName("com.mysql.jdbc.Driver");
            //STEP 3: Open a connection
            System.out.println("Connecting to database...");
            conn = DriverManager.getConnection(DB_URL,USER,PASS);
            //STEP 4: Execute a query
            //System.out.println("Creating statement...");
            stmt = conn.createStatement();
            String sql;
            sql="Select SNo from OfDetail where location='"+location+"'";
            ResultSet ret1 = stmt.executeQuery(sql);
            
             if (!ret1.next() ) {
                 System.out.println("no data");
                // do { // Use 'do...while' to process the first row, while continuing to process remaining rows

                    // } while (resultSet.next());
                    
                    sql = "INSERT INTO OfDetail(location) Values('"+location+"')";
                    boolean ret = stmt.execute(sql);
                    System.out.println("Return value is : " + ret );
            
            stmt.close();
            conn.close();
                }
             else{
                 stmt.close();
                conn.close();
                return;
             }

            }
            catch(SQLException se)
            {
            }catch(ClassNotFoundException e){
            }finally{
            //finally block used to close resources
            try{
            if(stmt!=null) {
                stmt.close();
            }
            }catch(SQLException se2){
            }// nothing we can do
            try{
                if(conn!=null) {
                    conn.close();
                }
            }catch(SQLException se){
            }//end finally try
            }//end try
            
                System.out.println("Goodbye!");
            }//end main
            //end FirstExample
    
    
    public String set_Playlist(String loc,String pname){
        Connection conn = null;
        Statement stmt = null;
        String name = null;
        
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            //STEP 3: Open a connection
            System.out.println("Connecting to database...");
            conn = DriverManager.getConnection(DB_URL,USER,PASS);
            //STEP 4: Execute a query
            //System.out.println("Creating statement...");
            stmt = conn.createStatement();
            String sql;
            
            sql="Select SName from OfDetail where location='"+loc+"'";
            ResultSet ret1 = stmt.executeQuery(sql);
            
             /*if (!ret1.next() ) {
                 //System.out.println("no data");
                // do { // Use 'do...while' to process the first row, while continuing to process remaining rows

                    // } while (resultSet.next());
                    
                    sql = "INSERT INTO OfPlaylist(location) Values('"+location+"')";
                    boolean ret = stmt.execute(sql);
                    System.out.println("Return value is : " + ret );
            
            stmt.close();
            conn.close();
                }*/
             while(ret1.next()){
                    //Retrieve by column name
                    name = ret1.getString("SName");
                   
             }
             sql = "Insert into OfPlaylist(SName,location,PlName) Values('"+name+"','"+loc+"','"+pname+"')";
                    boolean ret = stmt.execute(sql);
                    System.out.println("Return value is : " + ret );
                
                 
            //stmt.close();
            //conn.close();
                
             

            }
            catch(SQLException | ClassNotFoundException se)
            {
            }finally{
            //finally block used to close resources
            try{
            if(stmt!=null) {
                stmt.close();
            }
            }catch(SQLException se2){
            }// nothing we can do
            try{
                if(conn!=null) {
                    conn.close();
                }
            }catch(SQLException se){
            }//end finally try
            }//end try
            
                System.out.println("Goodbye!");
                return name;
            }//end main
    
    public void plsave(String pname){
        
        
        Connection conn = null;
        Statement stmt = null;
        
        
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            //STEP 3: Open a connection
            System.out.println("Connecting to database...");
            conn = DriverManager.getConnection(DB_URL,USER,PASS);
            //STEP 4: Execute a query
            //System.out.println("Creating statement...");
            stmt = conn.createStatement();
            String sql;
            sql="Select SNo from PlName where Pname='"+pname+"'";
            ResultSet ret1 = stmt.executeQuery(sql);
            if (!ret1.next() ) {
                sql="INSERT Into PlName(Pname) Values('"+pname+"')";
                boolean ret2 = stmt.execute(sql);
            
            
            }
            else{
                System.out.println("Playlist already there");
            }
            
            
            
            
        }   catch (SQLException ex) {
                Logger.getLogger(DbSave.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(DbSave.class.getName()).log(Level.SEVERE, null, ex);
            }
    
    try{
            if(stmt!=null)
                stmt.close();
            }catch(SQLException se2){
            }// nothing we can do
            try{
                if(conn!=null)
                conn.close();
            }catch(SQLException se){
                se.printStackTrace();
            }//end finally try
            }//end try
            
    
    
    public String[] get_pname(){
        Connection conn = null;
        Statement stmt = null;
        String[] pln = new String[100];
        
        
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            //STEP 3: Open a connection
            System.out.println("Connecting to database...");
            conn = DriverManager.getConnection(DB_URL,USER,PASS);
            //STEP 4: Execute a query
            //System.out.println("Creating statement...");
            stmt = conn.createStatement();
            String sql;
            sql = "Select Pname from PlName";
            ResultSet rs = stmt.executeQuery(sql);
            int i = 0;
             while(rs.next()){
                    //Retrieve by column name
                    pln[i] = rs.getString("Pname");
                    i=i+1;
                    
            }
            pln[i] = "eof";
            rs.close();
            System.out.println(pln[0]);
        }   
            catch (SQLException ex) {
                Logger.getLogger(DbSave.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(DbSave.class.getName()).log(Level.SEVERE, null, ex);
            }
            try{
            if(stmt!=null) {
                stmt.close();
            }
            }catch(SQLException se2){
            }// nothing we can do
            try{
                if(conn!=null) {
                    conn.close();
                }
            }catch(SQLException se){
            }//end finally try
            
            return pln;
            
            }
            
            
    
    public String[] showDet(String location){
        Connection conn = null;
        Statement stmt = null;
        String[] data = new String[7];
        
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            //STEP 3: Open a connection
            System.out.println("Connecting to database...");
            conn = DriverManager.getConnection(DB_URL,USER,PASS);
            //STEP 4: Execute a query
            //System.out.println("Creating statement...");
            stmt = conn.createStatement();
            String sql;
            sql = "Select * from OfDetail where location='"+location+"'";
            ResultSet ret1 = stmt.executeQuery(sql);
            while(ret1.next()){
                    //Retrieve by column name
                    data[0] = ret1.getString("SNo");
                    data[1] = ret1.getString("SName");
                    data[2] = ret1.getString("Artist");
                    data[3] = ret1.getString("Album");
                    data[4] = ret1.getString("Rating");
                    data[5] = ret1.getString("Genre");
                    data[6] = ret1.getString("Comment");
            }
            
                    
                    
                    
                    
                    
         
        }   catch (ClassNotFoundException ex) {
                Logger.getLogger(DbSave.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(DbSave.class.getName()).log(Level.SEVERE, null, ex);
            }
        try{
            if(stmt!=null) {
                stmt.close();
            }
            }catch(SQLException se2){
            }// nothing we can do
            try{
                if(conn!=null) {
                    conn.close();
                }
            }catch(SQLException se){
            }//end finally try
            //end try
            
                
                return data;
        
    
    
    }
    
    public String[][] get_psong(String plname){
        Connection conn = null;
        Statement stmt = null;
        String[][] loc = new String[100][100];
        //String[] nm = new String[100];
        try{
            Class.forName("com.mysql.jdbc.Driver");
            //STEP 3: Open a connection
            System.out.println("Connecting to database...");
            conn = DriverManager.getConnection(DB_URL,USER,PASS);
            //STEP 4: Execute a query
            //System.out.println("Creating statement...");
            stmt = conn.createStatement();
            String sql;
            sql = "Select SName,location from OfPlaylist where PlName='"+plname+"'";
            ResultSet ret1 = stmt.executeQuery(sql);
            int i=0;
            while(ret1.next()){
                loc[i][0] = ret1.getString("location");
                loc[i][1] = ret1.getString("SName");
                i = i+1;
            }
            loc[i][0] = "eof";
            loc[i][1] = "eof";
            
            
        }   catch (SQLException ex) {
                Logger.getLogger(DbSave.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(DbSave.class.getName()).log(Level.SEVERE, null, ex);
            }
    
    try{
            if(stmt!=null) {
                stmt.close();
            }
            }catch(SQLException se2){
            }// nothing we can do
            try{
                if(conn!=null) {
                    conn.close();
                }
            }catch(SQLException se){
            }//end finally try
            //end try
            return loc;
    
    
    
    
    }
    
    
    public void recent_input(String filename) throws ClassNotFoundException{
        Connection conn = null;
        Statement stmt = null;
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            //STEP 3: Open a connection
            System.out.println("Connecting to database...");
            conn = DriverManager.getConnection(DB_URL,USER,PASS);
            //STEP 4: Execute a query
            //System.out.println("Creating statement...");
            stmt = conn.createStatement();
            String sql;
            sql = "Insert into RecentSong(location) Values('"+filename+"')";
            Boolean ret = stmt.execute(sql);
            System.out.println("Return value is : " + ret.toString() );
            stmt.close();
            conn.close();
            }
            catch(SQLException | ClassNotFoundException se)
            {
            }finally{
            //finally block used to close resources
            try{
            if(stmt!=null) {
                stmt.close();
            }
            }catch(SQLException se2){
            }// nothing we can do
            try{
                if(conn!=null) {
                    conn.close();
                }
            }catch(SQLException se){
            }//end finally try
            }//end try
    }
    
    public String PrePlay(String cursong){
        Connection conn = null;
        Statement stmt = null;
        int sno = 0;
        String newloc=null;
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            //STEP 3: Open a connection
            System.out.println("Connecting to database...");
            conn = DriverManager.getConnection(DB_URL,USER,PASS);
            //STEP 4: Execute a query
            //System.out.println("Creating statement...");
            stmt = conn.createStatement();
            String sql;
            sql = "Select SNo from RecentSong where location='"+cursong+"'";
            ResultSet ret = stmt.executeQuery(sql);
            while(ret.next()){
                sno = ret.getInt("SNo");
                
            }
            int sno1 = sno;
            if (sno1==1){
                sno1=sno1;
            }
            else{
            sno1=sno1-1;
            }
            sql ="Select location from RecentSong where SNo="+sno1+"";
            ResultSet ret1 = stmt.executeQuery(sql);
            while(ret1.next()){
                newloc = ret1.getString("location");
                
            }
            stmt.close();
            conn.close();
            }
            catch(SQLException | ClassNotFoundException se)
            {
            }finally{
            //finally block used to close resources
            try{
            if(stmt!=null) {
                stmt.close();
            }
            }catch(SQLException se2){
            }// nothing we can do
            try{
                if(conn!=null) {
                    conn.close();
                }
            }catch(SQLException se){
            }//end finally try
            }//end try
        return newloc;
    }
    public String NextPlay(String cursong){
        Connection conn = null;
        Statement stmt = null;
        int sno = 0;
        String newloc=null;
        int lasts = 0;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            //STEP 3: Open a connection
            System.out.println("Connecting to database...");
            conn = DriverManager.getConnection(DB_URL,USER,PASS);
            //STEP 4: Execute a query
            //System.out.println("Creating statement...");
            stmt = conn.createStatement();
            String sql;
            sql = "Select SNo from RecentSong where location='"+cursong+"'";
            ResultSet ret = stmt.executeQuery(sql);
            while(ret.next()){
                sno = ret.getInt("SNo");
                
            }
            System.out.println(sno);
            int sno1 = sno;
            
            sql = "Select count(SNo) as count from RecentSong";
            while(ret.next()){
                lasts = ret.getInt("count");
                
            }
            System.out.println(lasts);
            Integer lasts1 = lasts;
            if (lasts1 == sno1){
            sno1=1;
            }
            else{
                sno1 = sno1+1;
            }
            sql ="Select location from RecentSong where SNo="+sno1+"";
            ResultSet ret1 = stmt.executeQuery(sql);
            while(ret1.next()){
                newloc = ret1.getString("location");
                
            }
            stmt.close();
            conn.close();
            }
            catch(SQLException | ClassNotFoundException se)
            {
            }finally{
            //finally block used to close resources
            try{
            if(stmt!=null) {
                stmt.close();
            }
            }catch(SQLException se2){
            }// nothing we can do
            try{
                if(conn!=null) {
                    conn.close();
                }
            }catch(SQLException se){
            }//end finally try
            }//end try
        return newloc;
    }
    
    
    public String[][] search(String Data){
        Connection conn = null;
        Statement stmt = null;
        String[][] loc = new String[100][100];
        //String[] nm = new String[100];
        try{
            Class.forName("com.mysql.jdbc.Driver");
            //STEP 3: Open a connection
            System.out.println("Connecting to database...");
            conn = DriverManager.getConnection(DB_URL,USER,PASS);
            //STEP 4: Execute a query
            //System.out.println("Creating statement...");
            stmt = conn.createStatement();
            String sql;
            sql = "Select SName,location from OfDetail where SName like '%"+Data+"%'";
            ResultSet ret1 = stmt.executeQuery(sql);
            int i=0;
            while(ret1.next()){
                loc[i][0] = ret1.getString("location");
                loc[i][1] = ret1.getString("SName");
                i = i+1;
            }
            loc[i][0] = "eof";
            loc[i][1] = "eof";
            
            
        }   catch (SQLException ex) {
                Logger.getLogger(DbSave.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(DbSave.class.getName()).log(Level.SEVERE, null, ex);
            }
    
    try{
            if(stmt!=null) {
                stmt.close();
            }
            }catch(SQLException se2){
            }// nothing we can do
            try{
                if(conn!=null) {
                    conn.close();
                }
            }catch(SQLException se){
            }//end finally try
            //end try
            return loc;
    
        
        
    }
    
}