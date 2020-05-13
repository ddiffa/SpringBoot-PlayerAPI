package com.hellodiffa.player.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.UUID;

@Entity
public class PlayerEntity {

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(
            name= "UUID",
            strategy = "org.hibernate.id.UUIDGenerator"
    )
    private UUID id;
    private String firstName;
    private String lastName;
    private int rank;
    private int age;
    private long points;
    private String gender;
    private String country;
    private String imageUrl;
    private String description;

    public PlayerEntity(String firstName, String lastName, int rank, int age, long points, String gender, String country, String imageUrl, String description) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.rank = rank;
        this.age = age;
        this.points = points;
        this.gender = gender;
        this.country = country;
        this.imageUrl = imageUrl;
        this.description = description;
    }

    public PlayerEntity() {
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getPoints() {
        return points;
    }

    public void setPoints(long points) {
        this.points = points;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
