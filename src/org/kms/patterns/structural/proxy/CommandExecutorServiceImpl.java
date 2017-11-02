package org.kms.patterns.structural.proxy;

public class CommandExecutorServiceImpl implements CommandExecutorService {

	public void executeCommand(String command) {
		//basic command validation
		if(null!=command && !command.isEmpty()){
			System.out.println(command+"  "+"COMMAND EXECUTED SUCCESSFULLY");
		}
		
	}

}
