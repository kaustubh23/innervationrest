package innervation.rest;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import innervation.rest.dto.Request;
import innervation.rest.dto.Response;
import innervation.rest.service.OrderService;

public class OrderTest {

	
	@Test
	public void OrderTest() {
	   // Call the REST API
		
		OrderService service = new OrderService();
		Request request = new Request();
		
		request.setAmount("200");
		request.setDescription("test");
		request.setItemCode("232");
		request.setOrderNumber("1246");
		request.setQty("10");
		Response response=	service.sendOrder(request);
		assertTrue(response.getResponseCode().equals("00"));
		assertTrue(response.getResponseMessage().equals("Success"));
	}
}
