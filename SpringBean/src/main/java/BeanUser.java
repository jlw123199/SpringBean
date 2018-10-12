import org.springframework.beans.factory.annotation.Autowired;

public class BeanUser {

    @Autowired
    private IAuthorization auth;

//    @Autowired
//    private IAuthorization auth2;
//
//
//    @Autowired
//    private IAuthorization autha;


    public String AuthorToUser(String name){
        return  auth.authorization(name); // + "---" + auth2.authorization(name)  + "---" + autha.authorization(name);
    }

}
