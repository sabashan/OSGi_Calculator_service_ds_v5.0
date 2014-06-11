package org.wso2.example.consumer;

import org.eclipse.osgi.framework.console.CommandInterpreter;
import org.eclipse.osgi.framework.console.CommandProvider;
import org.wso2.example.calculator.Calculator;

public class CalculatorConsumer implements CommandProvider {

	Calculator calcService;
	CommandInterpreter ci;

	public synchronized void onBind(Calculator calcService) {
		this.calcService = calcService;
		System.out.println("Service Registered");
	}

	public synchronized void onUnbind(Calculator calcService) {
		if (this.calcService == calcService) {
			this.calcService = null;
		}
	}

	public void _add(CommandInterpreter ci) {

		double a = Double.parseDouble(ci.nextArgument());
		double b = Double.parseDouble(ci.nextArgument());
		calcService.add(a, b);
	}

	public void _sub(CommandInterpreter ci) {

		double a = Double.parseDouble(ci.nextArgument());
		double b = Double.parseDouble(ci.nextArgument());
		calcService.sub(a, b);
	}

	public void _mul(CommandInterpreter ci) {

		double a = Double.parseDouble(ci.nextArgument());
		double b = Double.parseDouble(ci.nextArgument());
		calcService.mul(a, b);
	}

	public void _div(CommandInterpreter ci) {

		double a = Double.parseDouble(ci.nextArgument());
		double b = Double.parseDouble(ci.nextArgument());
		calcService.div(a, b);
	}

	@Override
	public String getHelp() {
		// TODO Auto-generated method stub
		return null;
	}

}
