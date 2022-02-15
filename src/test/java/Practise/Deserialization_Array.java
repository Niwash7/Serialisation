package Practise;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import Pojo_Class.Emp_Details_Array;

public class Deserialization_Array {

	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
		
		ObjectMapper obj = new ObjectMapper();
		
		Emp_Details_Array e2 = obj.readValue(new File("./SampleArray.json"), Emp_Details_Array.class);
		
		int [] i = e2.getPhno();
		
		System.out.println(i[1]);
		System.out.println(i[0]);
		
	}
}
