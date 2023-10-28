package padroes.de.projeto.facade;

public class SistemaFacade {

    public void carregarFacade(){
        new SistemaEletrico().carregarSistemaEletrico();
        new SistemaHidraulico().carregarSistemaHidraulico();
        new SistemaMecanico().carregarSistemaMecanico();
    }
}
