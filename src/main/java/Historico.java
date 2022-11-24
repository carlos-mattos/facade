import java.util.ArrayList;
import java.util.List;

public abstract class Historico {

    private List<Dado> dadosNoNavegador = new ArrayList<Dado>();

    public void addDado(Dado dado) {
        this.dadosNoNavegador.add(dado);
    }

    public boolean verificar(Dado dado) {
        return this.dadosNoNavegador.contains(dado);
    }

}
