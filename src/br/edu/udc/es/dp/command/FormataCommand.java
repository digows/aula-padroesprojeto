package br.edu.udc.es.dp.command;
public class FormataCommand implements Command {
    @Override	
    public void execute() {
        System.out.println("Formantando ->");
    }

    @Override
    public void undo() {
        System.out.println("<- Tirando formatação");
    }
}