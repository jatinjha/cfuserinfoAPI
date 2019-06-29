package com.gfg.consumeRest.fetchApi.user;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class User {



    String firstname;
    String lastname;
    int rating;
    int maxrating;

    public User(String firstname, String lastname, int rating, int maxrating) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.rating = rating;
        this.maxrating = maxrating;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public int getMaxrating() {
        return maxrating;
    }

    public void setMaxrating(int maxrating) {
        this.maxrating = maxrating;
    }

    @Override
    public String toString() {
        return "User{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", rating=" + rating +
                ", maxrating=" + maxrating +
                '}';
    }
}
