public class Cache extends Historico{

    private static Cache cache = new Cache();

    private Cache() {};

    public static Cache getInstancia() {
        return cache;
    }

}
