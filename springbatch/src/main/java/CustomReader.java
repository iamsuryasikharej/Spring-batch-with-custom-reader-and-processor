import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.springframework.batch.core.configuration.xml.ExceptionElementParser;
import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.NonTransientResourceException;
import org.springframework.batch.item.ParseException;
import org.springframework.batch.item.UnexpectedInputException;

public class CustomReader implements ItemReader{
List finalList=new ArrayList();
int count;

public CustomReader()
{
	System.out.println(finalList);
	initialize();
	System.out.println(finalList);

}

public Object read() throws  Exception, UnexpectedInputException, ParseException, NonTransientResourceException {
		if(count<finalList.size())
		{
			return (Tutorial) finalList.get(count++);
		}
		else
		{
			return null;
		}
		
	}
	
	public void initialize() 
	{
		System.out.println("in");
		Connection con;
		try {
		Class.forName("com.mysql.jdbc.Driver");  
		con=DriverManager.getConnection(  
		"jdbc:mysql://localhost:3306/surya","root","durga");  
		//here sonoo is database name, root is username and password  
		Statement stmt=con.createStatement();  
		ResultSet rs=stmt.executeQuery("select * from tutorialsdata");  
		while(rs.next()) { 
		System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3)+rs.getInt(4));  
		Tutorial temp=new Tutorial();
		temp.setTutorial_id(rs.getInt(1));
		temp.setTutorial_title(rs.getString(2));
		temp.setTutorial_author(rs.getString(3));
		temp.setSubmission_date(String.valueOf(rs.getInt(4)));
		System.out.println("temp"+temp);
		finalList.add(temp);
		}
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
	
		
	}
	

}
