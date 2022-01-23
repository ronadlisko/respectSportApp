package cz.respect.respectsportapp.data.model;

import androidx.room.Entity;

@Entity
public class User {
    protected String userId;
    protected String displayName;
    protected String token;

    public User(){}

    public String getUserId() {
        return userId;
    }

    public String getDisplayName() {
        return displayName;
    }

    public String getToken() {
        return token;
    }
}
