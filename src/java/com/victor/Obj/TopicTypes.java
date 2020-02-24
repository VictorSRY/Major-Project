/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.victor.Obj;

/**
 *
 * @author Victor
 */
public class TopicTypes {
    String type;
    Topic[] topics;
    public TopicTypes(String type,Topic[] topics){
        setType(type);
        setTopics(topics);
    }

    private void setType(String type) {
        this.type = type;
    }
    public String getType() {
        return type;
    }
    private void setTopics(Topic[] topics) {
        this.topics = topics;
    }

    public Topic[] getTopics() {
        return topics;
    }
}
