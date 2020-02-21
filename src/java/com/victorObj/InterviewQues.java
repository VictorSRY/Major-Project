/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.victorObj;

import java.util.ArrayList;

/**
 *
 * @author SRVictorY
 */
public class InterviewQues {
    String Question="";
    ArrayList<InterviewQuesAns> ansArray=new ArrayList<>();
    int helpfull=0;

    public InterviewQues(String Question) {
        setQuestion(Question);
    }

    public void setQuestion(String Question) {
        this.Question = Question;
    }

    public String getQuestion() {
        return Question;
    }

    public void setAnsArray(ArrayList<InterviewQuesAns> ansArray) {
        this.ansArray = ansArray;
    }

    public ArrayList<InterviewQuesAns> getAnsArray() {
        return ansArray;
    }

    public void setHelpfull() {
        this.helpfull++;
    }

    public int getHelpfull() {
        return helpfull;
    }
    
    public void addAns(String ans){
        this.ansArray.add(new InterviewQuesAns(ans));
    }
    
    public void incHelpfull(int helpfull) {
        this.helpfull++;
    }
    
}
