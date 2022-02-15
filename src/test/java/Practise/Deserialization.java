package Practise;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import Pojo_Class.Emp_Details;

public class Deserialization {

	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
		
		ObjectMapper obj = new ObjectMapper();
		
		Emp_Details e1 = obj.readValue(new File("./Sample.json"), Emp_Details.class);
		
		System.out.println(e1.getName());
		System.out.println(e1.getEmail());
	}
}
