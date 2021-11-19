package com.revature.controller;

import com.revature.service.ArithmeticService;

import io.javalin.Javalin;
import io.javalin.http.Handler;

public class ArithmeticController {

	private ArithmeticService arithmeticService;
	
	private Handler add = (ctx) -> {
		String num1 = ctx.formParam("number1");
		String num2 = ctx.formParam("number2");
		
		String sum = this.arithmeticService.add(num1, num2);
		
		ctx.result(sum);
	};
	
	// Constructor
	public ArithmeticController() {
		this.arithmeticService = new ArithmeticService();
	}
	
	public void mapEndpoints(Javalin app) {
		app.post("/add", add);
	}
	
}
