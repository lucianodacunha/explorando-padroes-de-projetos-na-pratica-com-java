package padroes.de.projeto.singleton;

public class Main {
    public static void main(String[] args) {

        SingletonLazy lazy1 = SingletonLazy.getInstance();
        SingletonLazy lazy2 = SingletonLazy.getInstance();

        System.out.printf("lazy1: %s, lazy2: %s\n", lazy1, lazy2);

    }
}
