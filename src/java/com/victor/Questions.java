package com.victor;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Victor
 */
public class Questions {
    int qid;
    String question="";
    String a="",b="",c="",d="",ans="";
    boolean rand=true;
    public Questions(int qid,String question,String a,String b,String c,String d,String ans,boolean rand){
        setQid(qid);
        setQuestion(question);
        setA(a);
        setB(b);
        setC(c);
        setD(d);
        setAns(ans);
        setRand(rand);
    }

    private void setQid(int qid) {
        this.qid=qid; //To change body of generated methods, choose Tools | Templates.
    }

    private void setQuestion(String question) {
        this.question=question; //To change body of generated methods, choose Tools | Templates.
    }

    private void setA(String a) {
        this.a=a; //To change body of generated methods, choose Tools | Templates.
    }

    private void setB(String b) {
        this.b=b;//To change body of generated methods, choose Tools | Templates.
    }
    
    private void setC(String c) {
        this.c=c; //To change body of generated methods, choose Tools | Templates.
    }

    private void setD(String d) {
        this.d=d; //To change body of generated methods, choose Tools | Templates.
    }

    private void setAns(String ans) {
        this.ans=ans; //To change body of generated methods, choose Tools | Templates.
    }

    private void setRand(boolean rand) {
        this.rand=rand;//To change body of generated methods, choose Tools | Templates.
    }

    public int getQid() {
        return qid;
    }

    public String getQuestion() {
        return question;
    }

    public String getA() {
        return a;
    }

    public String getB() {
        return b;
    }

    public String getC() {
        return c;
    }

    public String getD() {
        return d;
    }

    public String getAns() {
        return ans;
    }
    
    public boolean getRand(){
        return rand;
    }
    
}
