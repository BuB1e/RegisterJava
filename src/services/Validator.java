package services;

import models.User;

public interface Validator {
    static boolean validated(User user) {
        return false;
    }
}
