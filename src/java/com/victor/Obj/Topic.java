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
public class Topic {
    String name;
    int wait;

    public Topic(String name,int wait) {
        setName(name);
        setWait(wait);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setWait(int wait) {
        this.wait = wait;
    }

    public int getWait() {
        return wait;
    }
}
