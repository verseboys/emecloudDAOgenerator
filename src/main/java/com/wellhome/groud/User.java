package com.wellhome.groud;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 
/**
 * Entity mapped to table "USER".
 */
public class User {

    private String userPhone;
    private String userPassword;
    private String userName;
    private Integer age;
    private java.util.Date userBirth;

    public User() {
    }

    public User(String userPhone, String userPassword, String userName, Integer age, java.util.Date userBirth) {
        this.userPhone = userPhone;
        this.userPassword = userPassword;
        this.userName = userName;
        this.age = age;
        this.userBirth = userBirth;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public java.util.Date getUserBirth() {
        return userBirth;
    }

    public void setUserBirth(java.util.Date userBirth) {
        this.userBirth = userBirth;
    }

}
