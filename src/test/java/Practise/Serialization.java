package Practise;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import Pojo_Class.Emp_Details;

public class Serialization {

	public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException {
		
		Emp_Details emp = new Emp_Details(1, "Niwash", 805649165, "Bangalore", "Niwashdeen07@gmail.com");
		ObjectMapper obj = new ObjectMapper();
		obj.writeValue(new File("./Sample.json"), emp);
	}
}
