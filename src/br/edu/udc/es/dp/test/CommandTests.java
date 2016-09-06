package br.edu.udc.es.dp.test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import br.edu.udc.es.dp.command.CommandStack;
import br.edu.udc.es.dp.command.DigitaCommand;
import br.edu.udc.es.dp.command.FormataCommand;

public class CommandTests {
	
	@Test
	public void test() {
		final CommandStack stack = new CommandStack();
		assertFalse( stack.canUndo() );
		
		stack.doCommand( new DigitaCommand() );
		assertTrue( stack.canUndo() );
		
		stack.undo();
		
		stack.doCommand( new FormataCommand() );
		stack.doCommand( new DigitaCommand() );
		
		stack.undo();
		
	}
	
	@Test
	public void testCommand() {
		final CommandStack stack = new CommandStack();
		assertFalse( stack.canUndo() );
		assertFalse( stack.canRedo() );
		
		stack.doCommand( new DigitaCommand() );
		assertTrue( stack.canUndo() );
		
		stack.doCommand( new DigitaCommand() );
		stack.doCommand( new DigitaCommand() );
		stack.doCommand( new DigitaCommand() );
		stack.undo();
		stack.undo();
		stack.undo();
		stack.undo();
		
		assertFalse( stack.canUndo() );
	}
	
	@Test
	public void testRedo() {
		final CommandStack stack = new CommandStack();
		
		stack.doCommand( new FormataCommand() );
		stack.doCommand( new DigitaCommand() );
		stack.doCommand( new FormataCommand() );
		stack.doCommand( new DigitaCommand() );
		stack.doCommand( new FormataCommand() );
	
		stack.undo();
		stack.redo();
	}
	
}
