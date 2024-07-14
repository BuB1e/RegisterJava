package services;

import models.User;


public class NameValidator implements Validator{
    public static boolean validated(User user) {
        if (user.getName() == null || user.getName().trim().equals("")) {
            throw new IllegalArgumentException("Name should not empty");
        } else if ( !user.getName().matches("[a-zA-Z]+")) {
            throw new IllegalArgumentException("Name is wrong format");
        } else {
            return true;
        }
    }
}
