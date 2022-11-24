public class Cookie extends Historico {

    private static Cookie cookie = new Cookie();

    private Cookie() {};

    public static Cookie getInstancia() {
        return cookie;
    }

}
