package org.kms.patterns.structural.proxy;

public class ProxyDesignPatternTest {
	
	public static void main(String[] args) {
		//proxy with correct authentication
		CommandExecutorServiceProxy proxy= new CommandExecutorServiceProxy("admin", "secret");
		proxy.executeCommand("update");
		proxy.executeCommand("delete");
		//proxy with incorrect authentication
		CommandExecutorServiceProxy proxy2= new CommandExecutorServiceProxy("testadmin", "test");
		proxy2.executeCommand("update");
	}

}
