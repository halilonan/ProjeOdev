import org.junit.After;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class UserTest {
    public static List<User> userList = new ArrayList<User>();

    @Test
    public void register() {


        User user1 = new User( "Halil onan", "zumzum" );
        User user2 = new User( "Erdem deniz", "zubi" );
        User user3 = new User( "Ömer oğuz kasap", "vecihi" );

        userList.add( user1 );
        userList.add( user2 );
        userList.add( user3 );


        for (User user : userList) {
            System.out.println( "User Name: "+user.UserName + "  Password: "+user.Password );
        }
    }
}

