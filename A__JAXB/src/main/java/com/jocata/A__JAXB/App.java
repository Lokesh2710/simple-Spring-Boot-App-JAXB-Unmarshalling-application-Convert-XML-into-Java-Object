package com.jocata.A__JAXB;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

import com.jocata.A__JAXB.model.Student;

public class App 
{
    
	public static void main(String[] args) 
	{
		try 
		{
			File file = new File("C:\\lekha_data\\test.xml"); 
				
			JAXBContext jaxbContext = JAXBContext.newInstance(Student.class);
				
			Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
				
			Student student = (Student) unmarshaller.unmarshal(file);
				
			System.out.println(student.getFirstName());
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
}
