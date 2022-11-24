import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DadoTest {

    @Test
    void deveSerPossivelExcluirCookie() {
        Dado dado = new Dado();
        Cookie.getInstancia().addDado(dado);

        assertEquals("Excluir Cookie disponivel", dado.limparHistorico());
    }

    @Test
    void deveSerPossivelExcluirCache() {
        Dado dado = new Dado();
        Cache.getInstancia().addDado(dado);

        assertEquals("Excluir Cache disponivel", dado.limparHistorico());
    }

    @Test
    void deveSerPossivelExcluirPesquisa() {
        Dado dado = new Dado();
        Pesquisa.getInstancia().addDado(dado);

        assertEquals("Excluir Pesquisa disponivel", dado.limparHistorico());
    }

    @Test
    void deveRetornarNadaParaExcluir() {
        Dado dado = new Dado();

        assertEquals("Nada para excluir", dado.limparHistorico());
    }

}