package com.q4k;

import com.q4k.factories.QuestionFactory;

import io.vertx.core.json.Json;
import io.vertx.ext.web.RoutingContext;

public class QuestionService {
	QuestionFactory factory;
	
	public QuestionService() {
		factory = new QuestionFactory();
	}

	public void generateQuestion(RoutingContext routingContext) {
		final String sessionid = routingContext.request().getParam("sessionid");
		final String topic = routingContext.request().getParam("topic");
		final String level = routingContext.request().getParam("level");
		if (sessionid == null) {
			routingContext.response().setStatusCode(400).end();
		} else {
			Question question = factory.generateQuestion(topic, level);
			routingContext.response().end(Json.encodePrettily(question));
		}
	}
}
