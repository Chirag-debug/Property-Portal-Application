package com.propertywalo.model;

public class Listing {
    Property property;
    User user;
    public Listing(Property property, User user) {
        this.property = property;
        this.user = user;
    }

    public Property getProperty() {
        return property;
    }

    public void setProperty(Property property) {
        this.property = property;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        if(!user.isBuyer()) {
            this.user = user;
        }
    }
}

