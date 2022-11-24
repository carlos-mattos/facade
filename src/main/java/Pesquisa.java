public class Pesquisa extends Historico{

    private static Pesquisa pesquisa = new Pesquisa();

    private Pesquisa() {};

    public static Pesquisa getInstancia() {
        return pesquisa;
    }

}
