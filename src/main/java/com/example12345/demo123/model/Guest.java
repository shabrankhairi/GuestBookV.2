package com.example12345.demo123.model;
import java.util.Date;
import javax.persistence.*;

@Entity
@Table(name="guest")
public class Guest {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;
    private String name;
    private String birthofdate;
    private String address;
    @Version
    @Column(columnDefinition="") //integer DEFAULT 0
    private Integer version;

    public Guest() {}
    public Guest(String name, String birthofdate, String address) {
        this.name = name;
        this.birthofdate = birthofdate;
        this.address = address;
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getBirthofdate() {
        return birthofdate;
    }
    public void setBirthofdate(String birthofdate) {
        this.birthofdate = birthofdate;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }
}
