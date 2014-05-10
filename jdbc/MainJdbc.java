public class MainJdbc {
    
    public static void main(String[] args) throws ClassNotFoundException, SQLException
    {
        //load the driver
        Class.forName("com.mysql.jdbc.Driver");
        
        //add the name of the database after the localhost/
        String url = "jdbc:mysql://localhost/";
        String user = "";
        String password = "";
        
        // Get the connection
        Connection connection = DriverManager.getConnection(url,user,password);
        
        
        
        /**************** HOW TO SELECT IN SQL *******************/
        Statement statement = connection.createStatement();
        ResultSet result = statement.executeQuery("Select * From Person");
        
        
        //Get the name of the column
        ResultSetMetaData meta = result.getMetaData();
        
        for(int i = 1; i<= meta.getColumnCount();i++){
            System.out.print(meta.getColumnName(i).toUpperCase()+"\t");
        }
        System.out.println();
        
        // print the result
        while(result.next())
        {
            for(int i = 1; i<= meta.getColumnCount();i++)
            {
                System.out.print(result.getObject(i)+"\t");
            }
            System.out.println();
        }
        
        /******************* HOW TO INSERT ******************/
        
        statement.executeUpdate("INSERT INTO Person(name) values('john')");
        
        /******************* HOW TO UPDATE *****************/
        
        statement.executeUpdate("UPDATE Person SET name='johny' WHERE id=3");
        
        /******************* HOW TO DELETE *****************/
        
        statement.executeUpdate("DELETE From Person WHERE id>2");
        
        /******************* HOW TO INSERT A VARIABLE **********/
        
        String name = "robert";
        // we insert name in Person. 
        statement.executeUpdate("INSERT INTO Person(name) values('"+name+"')");
        
        // we get the result
        result = statement.executeQuery("SELECT * FROM Person");
        // we print the result
        printResult(result);
        
        //we delete the previous insert
        
         statement.executeUpdate("DELETE From Person WHERE id>2");
         
         // and we close the statement and connection
         statement.close();
         connection.close();
    }
    
    //Simple function to print a result set
    public static void printResult(ResultSet result) throws SQLException
    {
        // get the column
        ResultSetMetaData meta = result.getMetaData();
        
        // print the column
        for(int i = 1; i<= meta.getColumnCount();i++){
            System.out.print(meta.getColumnName(i).toUpperCase()+"\t");
        }
        
        System.out.println();
        
        // print the result
        while(result.next())
        {
            for(int i = 1; i<= meta.getColumnCount();i++)
            {
                System.out.print(result.getObject(i)+"\t");
            }
            System.out.println();
        }
    }
}
