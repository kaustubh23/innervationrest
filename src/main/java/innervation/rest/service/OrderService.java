package innervation.rest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import innervation.rest.OrderBo;
import innervation.rest.dto.Orders;
import innervation.rest.dto.Request;
import innervation.rest.dto.Response;

@Service
public class OrderService {
	@Autowired
	OrderBo bo;

	public Response sendOrder(Request request) {
		Response response = new Response();
		response.setResponseCode("01");
		response.setResponseMessage("Success");
		Orders order = new Orders();
		order.setAmount(request.getAmount());
		order.setDescription(request.getDescription());
		order.setQty(request.getQty());
		
		order.setItemCode(request.getItemCode());
		// TODO Auto-generated method stub
		saveData(order);
		//pass this to a java bean method
		if("123".equalsIgnoreCase(request.getItemCode())) {
			response.setResponseCode("01");	
			response.setResponseMessage("Out of stock)");
			order.setResponseCode("01");
			saveData(order);
		}else {
			response.setResponseCode("00");	
			response.setResponseMessage("Success");
			order.setResponseCode("00");
			saveData(order);
		}
		
		
		
		return response;
	}
	
	
	public void saveData(Orders order) {
		if(bo!=null) {
			bo.save(order);	
		}else {
			//do nothing
		}
			
		
		
	}

}
