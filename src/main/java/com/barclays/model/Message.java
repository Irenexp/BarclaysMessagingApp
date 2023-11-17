package com.barclays.model;

import ch.qos.logback.core.util.FixedDelay;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.NoArgsConstructor;


@Entity
@NoArgsConstructor
public class Message {

    @Id
    @GeneratedValue
    private int id;
    private String content;

    public Message(Integer id, String content){
        this.id=id;
        this.content=content;
    }

    public Message(String content){
        this.content=content;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContent(){
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
