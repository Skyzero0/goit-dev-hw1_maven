package goit;

import com.google.gson.Gson;
import users.User;

public class App 
{
    public static void main( String[] args ) {
        User me = new User("Ivan","Karpenko");

        Gson gson = new Gson();
        String json = gson.toJson(me);
        System.out.println(json);
    }
}
