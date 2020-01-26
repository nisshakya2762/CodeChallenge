package com.people10.codechallage.webservice.entities;


import javax.persistence.*;

@Entity
@Table (name="Customers")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column (name="email")
    private String email;
    @Column (name="first_Name")
    private String first_name;
    @Column (name="last_name")
    private String last_name;
    @Column (name="IP")
    private String ip;
    @Column (name="latitude")
    private String latitude;
    @Column (name="longitude")
    private String longitute;
    @Column (name="created_at")
    private String created_at;
    @Column (name="updated_at")
    private String updated_at;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitute() {
        return longitute;
    }

    public void setLongitute(String longitute) {
        this.longitute = longitute;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_by(String created_by) {
        this.created_at = created_by;
    }

    public String getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(String updated_at) {
        this.updated_at = updated_at;
    }




}
