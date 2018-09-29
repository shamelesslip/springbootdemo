package com.inspur.springbootdemo.domain;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="T_TEMPORARY_USER")
public class TemporaryUser implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String username;
    private String password;
    private String website;
    private String usedFLag;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getUsedFLag() {
        return usedFLag;
    }

    public void setUsedFLag(String usedFLag) {
        this.usedFLag = usedFLag;
    }
}
