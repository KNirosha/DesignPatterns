package org.kms.patterns.structural.proxy;

public class CommandExecutorServiceProxy implements CommandExecutorService {
	private CommandExecutorService executorService=null;
	public CommandExecutorServiceProxy(String username, String password) {
		if(username.equals("admin")&& password.equals("secret")){
			executorService= new CommandExecutorServiceImpl();
		}
	}
	public void executeCommand(String command) {
		//Complex logics and validations should be done here to protect the actual service through proxy.
		if(null!=executorService){
			// stopping the users to execute delete command.
			if(command.equals("delete")){
				System.out.println("NOT AUTHORISED TO RUN:"+command+"  COMMAND");

			}else{
				executorService.executeCommand(command);

			}
		}else{
			System.out.println("Authentication Failed :)");
		}
	}

}
