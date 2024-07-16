package com.schoenl.demodockercommunication.user;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    public List<User> getAllUsers() {
        List<User> users = new ArrayList<User>();
        users.add(new User("Peter", "Gedöns"));
        users.add(new User("Erika", "Mustermann"));
        return users;
    }
}
