/**
 * 
 */
package com.gs.smi;

import java.util.concurrent.Callable;

/**
 * @author govind
 *
 */
public class SMITask implements Callable<String>{
	private Command command;
	public SMITask(Command command) {
		this.command = command;
	}
	
	public String call() throws Exception {
		return command.execute();
	}
}
