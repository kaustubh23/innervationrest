package innervation.rest.source;

import org.apache.camel.BeanInject;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;

import innervation.rest.dto.Request;
import innervation.rest.dto.Response;
import innervation.rest.processor.OrderProcessor;

@Component
public class ApplicationResource extends RouteBuilder {


	@BeanInject
	private OrderProcessor processor;

	@Override
	public void configure() throws Exception {
	
	
		/*
		 * rest().post("/sendOrder").consumes(MediaType.APPLICATION_JSON_VALUE).type(
		 * Orders.class).outType(Response.class) .route().process(processor).endRest();
		 * 
		 * 
		 * rest().get("/getOrders").produces(MediaType.APPLICATION_JSON_VALUE).route().
		 * setBody(() -> service.getOrders()) .endRest();
		 */

rest().post("/sendOrder").consumes(MediaType.APPLICATION_JSON_VALUE).type(Request.class).outType(Request.class)
		.route().process(processor).endRest();

	}

}
