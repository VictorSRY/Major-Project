/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.victorObj;

/**
 *
 * @author Victor
 */
public class Topic {
    String type;
    String[] topics;
    public Topic(String type,String[] topics){
        setType(type);
        setTopics(topics);
    }

    private void setType(String type) {
        this.type = type;
    }
    public String getType() {
        return type;
    }
    private void setTopics(String[] topics) {
        this.topics = topics;
    }

    public String[] getTopics() {
        return topics;
    }
}
