package dev.carrascon.bresca;

import com.google.gson.annotations.SerializedName;

public class User {
    @SerializedName("id")
    private Long id;

    @SerializedName("googleId")
    private String googleId;

    @SerializedName("name")
    private String name;

    @SerializedName("email")
    private String email;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getGoogleId() {
        return googleId;
    }

    public void setGoogleId(String googleId) {
        this.googleId = googleId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
