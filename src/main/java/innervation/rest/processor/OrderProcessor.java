package innervation.rest.processor;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.databind.ObjectMapper;

import innervation.rest.dto.Request;
import innervation.rest.service.OrderService;

@Component
public class OrderProcessor implements Processor {

	@Autowired
	private OrderService service;

	@Override
	public void process(Exchange exchange) throws Exception {
		String data = exchange.getIn().getBody(String.class);
		Request request = new ObjectMapper().readValue(data, Request.class);
		ObjectMapper mapper = new ObjectMapper();
		// Converting the Object to JSONString
		String jsonString = mapper.writeValueAsString(service.sendOrder(request));
		exchange.getOut().setBody(jsonString);

	}

}
