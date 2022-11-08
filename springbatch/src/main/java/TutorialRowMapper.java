import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class TutorialRowMapper implements RowMapper<Tutorial> {

	public Tutorial mapRow(ResultSet rs, int rowNum) throws SQLException {

	      Tutorial tutorial = new Tutorial();  
	  
	      tutorial.setTutorial_id(rs.getInt("t_id")); 
	      tutorial.setTutorial_title(rs.getString("t_title")); 
	      tutorial.setTutorial_author(rs.getString("t_auth")); 
	      tutorial.setSubmission_date(rs.getString("s_date"));  
	      return tutorial; 
	}  

   } 
