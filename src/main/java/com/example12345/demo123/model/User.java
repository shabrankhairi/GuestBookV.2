package com.example12345.demo123.model;
import java.util.Date;
import javax.persistence.*;

@Entity
@Table(name="user")
public class User {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id_pass;
    private String username;
    private String password;
    @Version
    @Column(columnDefinition="") //integer DEFAULT 0
    private Integer version;

    public User() {}
    public User(Integer id_pass,String username, String password) {
        this.id_pass = id_pass;
        this.username = username;
        this.password = password;
    }
    public Integer getId_pass() {
        return id_pass;
    }
    public void setId(Integer id_pass) {

        this.id_pass = id_pass;
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
}
