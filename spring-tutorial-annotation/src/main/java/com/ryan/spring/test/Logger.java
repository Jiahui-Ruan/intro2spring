package com.ryan.spring.test;

import javax.annotation.Resource;

public class Logger {
	private ConsoleWriter consoleWriter;
	private LogWritter fileWriter;
	
	@Resource
	public void setConsoleWriter(ConsoleWriter consoleWriter) {
		this.consoleWriter = consoleWriter;
	}
	@Resource(name="fileWriter")
	public void setFileWriter(LogWritter fileWriter) {
		this.fileWriter = fileWriter;
	}
	
	public void writeConsole(String text) {
		consoleWriter.write(text);
	}
	public void writeFile(String text) {
		fileWriter.write(text);
	}
}
