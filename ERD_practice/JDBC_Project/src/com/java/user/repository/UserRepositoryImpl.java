package com.java.user.repository;

import com.java.user.domain.Grade;
import com.java.user.domain.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserRepositoryImpl implements UserRepository {

    private static final Map<Integer, User> userDatabase = new HashMap<>();

    static {
        User test1 = new User("김철수", "010-1234-1234", Grade.BRONZE);
        User test2 = new User("박영희", "010-2345-2345", Grade.BRONZE);
        userDatabase.put(test1.getUserNumber(), test1);
        userDatabase.put(test2.getUserNumber(), test2);
    }

    @Override
    public void addUser(User user) {
        userDatabase.put(user.getUserNumber(), user);
    }

    @Override
    public List<User> findByUserName(String userName) {
        List<User> findUserList = new ArrayList<>();
        for (int key : userDatabase.keySet()) {
            User user = userDatabase.get(key);
            if (user.getUserName().equals(userName)) {
                findUserList.add(user);
            }
        }
        return findUserList;
    }

    @Override
    public User findByUserNumber(int userNumber) {
        return userDatabase.get(userNumber);
    }

    @Override
    public User deleteUser(int userNumber) {
        return userDatabase.remove(userNumber);
    }

}
