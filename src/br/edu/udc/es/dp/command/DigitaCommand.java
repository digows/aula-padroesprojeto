package br.edu.udc.es.dp.command;

public class DigitaCommand implements Command {
    @Override
    public void execute() {
        System.out.println("Digitando ->");
    }
    @Override
    public void undo() {
        System.out.println("<- Apagando");
    }
}