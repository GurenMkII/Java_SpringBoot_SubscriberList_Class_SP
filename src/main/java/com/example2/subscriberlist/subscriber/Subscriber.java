package com.example2.subscriberlist.subscriber;

import java.util.Date;

public class Subscriber {

    private Long id;
    private String firstName, LastName, userName;
    private Date signedUp;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Date getSignedUp() {
        return signedUp;
    }

    public void setSignedUp(Date signedUp) {
        this.signedUp = signedUp;
    }

    @Override
    public String toString() {
        return "Subscriber [LastName=" + LastName + ", firstName=" + firstName + ", id=" + id + ", signedUp=" + signedUp
                + ", userName=" + userName + "]";
    }

    
    
}