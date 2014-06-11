package org.wso2.example.calculator;

import org.eclipse.osgi.framework.console.CommandProvider;

public interface Calculator extends CommandProvider {

	public void add(double a, double b);
	public void sub(double a, double b);
	public void mul(double a, double b);
	public void div(double a, double b);

}