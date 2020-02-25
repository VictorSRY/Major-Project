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
    private int ansId;
    private String ans;
    private int helpfull;
    
    public InterviewQuesAns(int ansId, String ans,int helpfull) {
        setAnsId(ansId);
        setAns(ans);
        setHelpfull(helpfull);
    }

    public void setAnsId(int ansId) {
        this.ansId = ansId;
    }

    public int getAnsId() {
        return ansId;
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
    
    public void incHelpfull(int helpfull) {
        this.helpfull++;
    }
    
}
