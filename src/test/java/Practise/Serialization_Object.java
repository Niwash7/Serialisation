package Practise;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import Pojo_Class.Emp_Details_Object;
import Pojo_Class.Spouse;

public class Serialization_Object {

	public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException {
		
		int[] arr = {1234,12345};
		Spouse spouse = new Spouse("Niwash", "TY", 805649165);
		
		Emp_Details_Object e3 = new Emp_Details_Object(3, "Asma", arr, spouse, "Niwashdeen07@gmail.com");
		
		ObjectMapper obj = new ObjectMapper();
		obj.writeValue(new File("./SampleObject.json"), e3);
	}
}
