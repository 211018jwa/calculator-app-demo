package com.revature.controller;

import io.javalin.Javalin;
import io.javalin.http.Handler;

public class ArithmeticController {

	private Handler add = (ctx) -> {
		
	};
	
	// Constructor
	public ArithmeticController() {
	}
	
	public void mapEndpoints(Javalin app) {
		app.post("/add", add);
	}
	
}
