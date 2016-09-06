package br.edu.udc.es.dp.command;

import java.util.ArrayList;
import java.util.List;

public class CommandStack {

	private List<Command> commands = new ArrayList<>();
	private int currentIndex = 0;

	public void doCommand(Command command) {
		this.commands.add(command);
		command.execute();
		this.currentIndex++;
	}

	public boolean canUndo() {
		return this.currentIndex > 0;
	}

	public void undo() {
		if ( canUndo() ) {
			this.currentIndex--;
			this.commands.get(currentIndex).undo();
		} else {
			throw new IllegalStateException("Não pode desfazer");
		}
	}

	public boolean canRedo() {
		return this.currentIndex < commands.size();
	}

	public void redo() {
		if ( canRedo() ) {
			final Command commandToRedo = commands.get(currentIndex);
			this.currentIndex++;
			commandToRedo.execute();
		} else {
			throw new IllegalStateException("Não pode refazer");
		}
	}
}