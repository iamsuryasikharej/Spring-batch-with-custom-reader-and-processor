import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersInvalidException;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.batch.core.repository.JobExecutionAlreadyRunningException;
import org.springframework.batch.core.repository.JobInstanceAlreadyCompleteException;
import org.springframework.batch.core.repository.JobRestartException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Runner {
	public static void main(String[] args) throws JobExecutionAlreadyRunningException, JobRestartException, JobInstanceAlreadyCompleteException, JobParametersInvalidException, ClassNotFoundException, SQLException {
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("./applicationContext.xml");
		JobLauncher jobLauncher=(JobLauncher)applicationContext.getBean("jobLauncher");
		Job job=(Job)applicationContext.getBean("helloWorldJob");
		JobExecution jobExecution=jobLauncher.run(job, new JobParameters());
		System.out.println(jobExecution.getStatus());
//		Class.forName("com.mysql.jdbc.Driver");  
//		Connection con=DriverManager.getConnection(  
//		"jdbc:mysql://localhost:3306/surya","root","durga");  
//		//here sonoo is database name, root is username and password  
//		Statement stmt=con.createStatement();  
//		ResultSet rs=stmt.executeQuery("select * from tutorialsdata");  
//		while(rs.next())  
//			System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3)+rs.getInt(4));  
//			con.close();  
		
	}
}
