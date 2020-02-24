/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.victor.Obj;

/**
 *
 * @author SRVictorY
 */
public class InterviewQuesAns {
    String ans="";
    int helpfull;
    int notgood;
    public InterviewQuesAns(String ans) {
        setAns(ans);
        helpfull=0;
        notgood=0;
    }

    public void setAns(String ans) {
        this.ans = ans;
    }

    public String getAns() {
        return ans;
    }

    
    public void setHelpfull(int helpfull) {
        this.helpfull = helpfull;
    }

    public int getHelpfull() {
        return helpfull;
    }

    public void setNotgood(int notgood) {
        this.notgood = notgood;
    }

    public int getNotgood() {
        return notgood;
    }
    
    public void incNotgood(int notgood) {
        this.notgood++;
    }
    
    public void incHelpfull(int helpfull) {
        this.helpfull++;
    }
    
}
