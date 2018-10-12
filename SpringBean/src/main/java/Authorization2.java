public class Authorization2 implements IAuthorization {

    public String authorization(String name) {
        return "Authorized2:" + name;
    }
}
