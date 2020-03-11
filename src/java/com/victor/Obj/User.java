/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.victor.Obj;

/**
 *
 * @author Lenovo
 */
public class User {
    private String Uname;
    private String Uid;

    public User(String Uname, String Uid) {
        this.Uname = Uname;
        this.Uid = Uid;
    }

    public String getUid() {
        return Uid;
    }

    public String getUname() {
        return Uname;
    }
}
