package com.gejianfeng.tutorial.springdemo003.output;

public class OutputHelper {
	private IOutputGenerator handler = null;
	
	public void generatorOutput() {
		handler.generateOutput();
	}

	/**
	 * @param handler the handler to set
	 */
	public void setHandler(IOutputGenerator handler) {
		this.handler = handler;
	}
}
