package io.ooc.project.shop.model;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
public class User {
    @Id
    @Column(name="userid")
    @GeneratedValue
    private Long userid;

    @Column(name="username")
    private String username;
    @Column(name="password")
    private String password;

    @Column(name="isAdmin")
    private boolean isAdmin;

    @Column(name="email")
    private String email;

    @Column
    private String address;

    public User() {
    }

    public Long getUserid() {
        return userid;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

//    public boolean isAdmin() {
//        return isAdmin;
//    }

    public String getEmail() {
        return email;
    }

    public void setUserid(Long iduser) {
        this.userid = iduser;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public void setAdmin(boolean admin) {
        isAdmin = admin;
    }
}
