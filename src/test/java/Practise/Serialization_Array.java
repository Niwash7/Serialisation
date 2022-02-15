package Practise;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import Pojo_Class.Emp_Details_Array;

public class Serialization_Array {

	public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException {
		int [] arr = {1234, 4321};
		Emp_Details_Array e2 = new Emp_Details_Array("Niwash", arr, "Niwashdeen07@gmail.com");
		ObjectMapper obj = new ObjectMapper();
		obj.writeValue(new File("./SampleArray.json"), e2);
	}
}
