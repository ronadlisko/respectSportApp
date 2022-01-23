package cz.respect.respectsportapp.data.model;

/**
 * Data class that captures user information for logged in users retrieved from LoginRepository
 */
public class LoggedInUser extends User{

    public LoggedInUser(String userId, String displayName, String token) {
        this.userId = userId;
        this.displayName = displayName;
        this.token = token;
    }
}