package padroes.de.projeto.strategy;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();

        Action move = new Move();
        Action fly = new Fly();
        Action run = new Run();

        vehicle.setAction(move);
        vehicle.action();
        vehicle.setAction(fly);
        vehicle.action();
        vehicle.setAction(run);
        vehicle.action();

    }
}
