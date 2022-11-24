public class DadosFacade {

    public static String iniciarLimpeza(Dado dado){
        if (Cookie.getInstancia().verificar(dado)) {
            return "Excluir Cookie disponivel";
        }
        if (Cache.getInstancia().verificar(dado)) {
            return "Excluir Cache disponivel";
        }
        if (Pesquisa.getInstancia().verificar(dado)) {
            return "Excluir Pesquisa disponivel";
        }

        return "Nada para excluir";
    }

}
