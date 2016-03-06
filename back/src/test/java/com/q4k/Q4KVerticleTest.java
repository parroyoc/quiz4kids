package com.q4k;

import io.vertx.core.DeploymentOptions;
import io.vertx.core.Vertx;
import io.vertx.core.json.JsonObject;
import io.vertx.ext.unit.Async;
import io.vertx.ext.unit.TestContext;
import io.vertx.ext.unit.junit.VertxUnitRunner;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.io.IOException;
import java.net.ServerSocket;

@RunWith(VertxUnitRunner.class)
public class Q4KVerticleTest {

	private Vertx vertx;
	private Integer port;

	@Before
	public void setUp(TestContext context) throws IOException {
		vertx = Vertx.vertx();

		ServerSocket socket = new ServerSocket(0);
		port = socket.getLocalPort();
		socket.close();

		DeploymentOptions options = new DeploymentOptions().setConfig(new JsonObject().put("http.port", port));

		// We pass the options as the second parameter of the deployVerticle method.
		vertx.deployVerticle(Q4KVerticle.class.getName(), options, context.asyncAssertSuccess());
	}

	@After
	public void tearDown(TestContext context) {
		vertx.close(context.asyncAssertSuccess());
	}

	@Test
	public void testGenerateQuestion(TestContext context) {
		// This test is asynchronous, so get an async handler to inform the test
		// when we are done.
		final Async async = context.async();

		vertx.createHttpClient().getNow(port, "localhost", "/question/generateQuestion/1/arithmetic/3", response -> {
			response.handler(body -> {
				context.assertTrue(body.toString().contains("arithmetic"));
				async.complete();
			});
		});
	}
}