package model;

import java.util.List;

public class User {
    //Public User(); this is call constracter
    public int id;
    public String name;
    public String email;
    public User(int uid, String uName, String uEmail){
        id = uid;
        name = uName;
        email = uEmail;

    }

    @Override
    public String toString() {
        return "user{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }


}
