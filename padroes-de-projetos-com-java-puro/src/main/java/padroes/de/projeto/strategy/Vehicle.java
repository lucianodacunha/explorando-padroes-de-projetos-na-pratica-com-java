package padroes.de.projeto.strategy;

public class Vehicle {

    public Action action;

    public void setAction(Action action){
        this.action = action;
    }

    public void action(){
        action.execute();
    }
}
