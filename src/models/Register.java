package models;// 6510451018 Harit Sombatsiri
public class Register {
    private User user;
    private boolean availableToRegister;

    public Register(User user) {
        this.user = user;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public boolean isAvailableToRegister() {
        return availableToRegister;
    }

    public void setAvailableToRegister(boolean availableToRegister) {
        this.availableToRegister = availableToRegister;
    }

}
