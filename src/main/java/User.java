import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class User {

    public String UserName,Password;
    public List<PlayList> playLists = new ArrayList<PlayList>();

    public User( String userName,String password) {

        UserName = userName;
        this.Password = password;
    }

}
