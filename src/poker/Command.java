package poker;

import java.util.Stack;

public class Command {
	
	private String[] command = new String[] {};
	private Stack<String> commandBlocks = new Stack<String>();
	
	
	public Command(String cmd) {
		this.command = cmd.split(" ");
		this.commandBlocks = this.stackify();
	}
	
	private Stack<String> stackify() {
		Stack<String> commandStack = new Stack<String>();
		
		for(String block : this.command) {
			commandStack.push(block);
		}
		
		return commandStack;
	}
	
	public String toString() {
		String string = new String();
		
		for(int i = 0; i < command.length - 1; i++) {
			string += command[i] + " ";
		}
		
		string += command[command.length - 1];
		
		return string;
	}
	
	public static void interpret(Command command) {
		
	}
}
