public class Authorization implements IAuthorization {

    public String authorization(String name) {
        return "Authorized:" + name;
    }
}
