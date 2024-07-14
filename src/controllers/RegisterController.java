package controllers;

import models.Register;
import models.User;
import services.AgeValidator;
import services.EmailValidator;
import services.NameValidator;

public class RegisterController {
    public void register(Register register) {
        User user = register.getUser();
        register.setAvailableToRegister(NameValidator.validated(user) && EmailValidator.validated(user) && AgeValidator.validated(user) );
    }
}
