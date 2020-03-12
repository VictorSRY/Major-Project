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
    private int Uid;
    private boolean editRight;
            
    public User(String fName,String mName,String lName, int Uid, boolean editRight) {
        if(mName!=null){
            mName+=" ";
        }
        else{
            mName="";
        }
        String Uname=fName+" "+mName+lName;
        this.Uname = Uname;
        this.Uid = Uid;
        this.editRight=editRight;
    }

    public boolean getEditRight(){
        return editRight;
    }
    
    public int getUid() {
        return Uid;
    }

    public String getUname() {
        return Uname;
    }
}
