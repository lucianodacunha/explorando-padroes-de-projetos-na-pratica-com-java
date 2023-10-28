package padroes.de.projeto.strategy;

public class Fly implements Action{
    @Override
    public void execute() {
        System.out.println("...flying");
    }
}
