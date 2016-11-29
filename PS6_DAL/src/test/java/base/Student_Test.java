package base;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import domain.PersonDomainModel;
import domain.StudentDomainModel;

public class Student_Test { 

	private static StudentDomainModel student1;
	private static UUID student1UUID = UUID.randomUUID();
	
	@BeforeClass
	public static void studentInstance() throws Exception {
		
		Date student1Birth = null;
				
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		
		student1 = new StudentDomainModel();
		
		try {
			student1Birth = dateFormat.parse("1994-11-27");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		student1.setStudentID(student1UUID);
		student1.setFirstName("Todd");
		student1.setMiddleName("A");
		student1.setLastName("Appleby");
		student1.setDOB(student1Birth);
		
				
	}

	
}
