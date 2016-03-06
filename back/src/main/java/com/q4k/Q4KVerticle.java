package com.q4k;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.Future;
import io.vertx.ext.web.Router;
import io.vertx.ext.web.handler.BodyHandler;

public class Q4KVerticle extends AbstractVerticle {

	@Override
	public void start(Future<Void> fut) {
		QuestionService questionService = new QuestionService();
		Router router = createRouter(questionService);
		createHttpServer(fut, router);
	}

	private Router createRouter(QuestionService questionService) {
		Router router = Router.router(vertx);
		router.route().handler(BodyHandler.create());
		router.route().handler(context -> {
			context.response().headers().add("Access-Control-Allow-Origin", "*");
		    context.response().headers().add("Access-Control-Allow-Methods", "GET, POST, OPTIONS");
		    context.response().headers().add("Access-Control-Allow-Headers", "Content-Type, Authorization, access-control-allow-origin");
			context.response().headers().add("content-type", "application/json; charset=utf-8");
			context.next();
		});
		router.get("/question/generateQuestion/:sessionid/:topic/:level").handler(questionService::generateQuestion);
		router.options("/question/generateQuestion/:sessionid/:topic/:level").handler(questionService::generateQuestion);
		return router;
	}

	private void createHttpServer(Future<Void> fut, Router router) {
		vertx.createHttpServer().requestHandler(router::accept).listen(config().getInteger("http.port", 8080), 
			result -> {
				if (result.succeeded()) {
					fut.complete();
				} else {
					fut.fail(result.cause());
				}
			});
	}
}
