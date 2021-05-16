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
		rest().post("/sendOrder").consumes(MediaType.APPLICATION_JSON_VALUE).type(Request.class).outType(Response.class)
				.route().process(processor).endRest();

	}

}
