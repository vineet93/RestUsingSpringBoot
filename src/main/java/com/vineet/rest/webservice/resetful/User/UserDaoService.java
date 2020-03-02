package com.vineet.rest.webservice.resetful.User;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Component
public class UserDaoService {

    private static int userCount=3;

    private static List<User> users = new ArrayList<>();

    static{
        users.add(new User(1,"vineet", new Date()));
        users.add(new User(2,"Lucky", new Date()));
        users.add(new User(3,"Saurav", new Date()));

    }


    // Method will return all the users.
    public List<User> findAll(){
        return users;
    }

    //Add the User to the List.
    public  User save(User user){

        if(user.getId()==null){
            user.setId(++userCount);
        }
        users.add(user);
        return user;
    }

     // Find the user.

    public User findOne(int id){
        for(User user:users ){
            if(user.getId()==id){
                return user;
            }
        }
        return null;
    }

}
