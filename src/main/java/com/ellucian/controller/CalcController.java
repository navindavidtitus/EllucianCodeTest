package com.ellucian.controller;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ellucian.service.CalculatorSimple;

@RestController
@RequestMapping(value = { "/calculator" })
public class CalcController {
	
	CalculatorSimple calc = new CalculatorSimple();

	@GetMapping("nc/add")
	public int addnc(@RequestParam(name = "num1") int num1, @RequestParam(name = "num2") int num2) {
		return calc.add(num1, num2);
	}

	@GetMapping("sc/add")
	public int addsc(@RequestParam(name = "num1") int num1, @RequestParam(name = "num2") int num2) {
		return calc.add(num1, num2);
	}

	@GetMapping("nc/sub")
	public int subnc(@RequestParam(name = "num1") int num1, @RequestParam(name = "num2") int num2) {
		return calc.sub(num1, num2);
	}

	@GetMapping("sc/sub")
	public int subsc(@RequestParam(name = "num1") int num1, @RequestParam(name = "num2") int num2) {
		return calc.sub(num1, num2);
	}
}

