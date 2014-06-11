package org.wso2.example.calculator.impl;

import org.wso2.example.calculator.Calculator;

public class CalculatorImpl implements Calculator {

	@Override
	public String getHelp() {
		// TODO Auto-generated method stub
		return null;
	}

	public void add(double a, double b) {
		// TODO Auto-generated method stub
		System.out.println(a + b);
	}

	@Override
	public void sub(double a, double b) {
		// TODO Auto-generated method stub
		System.out.println(a - b);
	}

	@Override
	public void mul(double a, double b) {
		// TODO Auto-generated method stub
		System.out.println(a * b);
	}

	@Override
	public void div(double a, double b) {
		// TODO Auto-generated method stub
		System.out.println(a / b);
	}

}