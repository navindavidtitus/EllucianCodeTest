package com.ellucian.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorSimple {

	public int add(int num1, int num2) {
		return num1 + num2;

	}

	public int sub(int num1, int num2) {
		return num2 - num1;
	}

}
