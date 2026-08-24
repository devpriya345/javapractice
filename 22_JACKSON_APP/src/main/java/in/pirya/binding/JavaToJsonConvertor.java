package in.pirya.binding;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

public class JavaToJsonConvertor {
	public static void main(String[] args) throws Exception{
		
		Customer c = new Customer();
		c.setId(1);
		c.setName("Robert");
		c.setEmail("robert@123");
		c.setPhno (435678L);
		
		ObjectMapper mapper = new ObjectMapper();
		mapper.writeValue(new File("customer.json"),c);
		System.out.println("Json file created");
	}
}
