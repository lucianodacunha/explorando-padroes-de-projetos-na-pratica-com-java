package padroes.de.projeto.strategy;

public class Move implements Action{
    @Override
    public void execute() {
        System.out.println("...moving");
    }
}
