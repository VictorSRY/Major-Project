/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.victor.Obj;

import java.util.ArrayList;

/**
 *
 * @author SRY
 */
public class InterviewQues {
    private int Qid;
    private String Question;
    private InterviewQuesAns[] ansArray;
    private int helpfull;
    private String topicTag;

    public InterviewQues(int Qid,String Question,int helpfull,InterviewQuesAns[] ansArry,String topicTag) {
        setQid(Qid);
        setQuestion(Question);
        setHelpfull(helpfull);
        setAnsArray(ansArry);
        setTopicTag(topicTag);
    }

    public void setQid(int Qid) {
        this.Qid = Qid;
    }

    public int getQid() {
        return Qid;
    }

    public void setQuestion(String Question) {
        this.Question = Question;
    }

    public String getQuestion() {
        return Question;
    }

    public void setAnsArray(InterviewQuesAns[] ansArry) {
        this.ansArray=ansArry;
    }

    public InterviewQuesAns[] getAnsArray() {
        return ansArray;
    }

    public void setHelpfull(int helpfull) {
        this.helpfull=helpfull;
    }

    public int getHelpfull() {
        return helpfull;
    }

    public String getTopicTag() {
        return topicTag;
    }
    
    /*
    public void addAns(String ans){
        this.ansArray.add(ans);
    }
    
    public void incHelpfull(int helpfull) {
        this.helpfull++;
    }
    */

    public void setTopicTag(String topicTag) {
        this.topicTag = topicTag;
    }
}
