package com.udactiy.jwnd.spring.chapter3.controller;

public class MessageForm {
    private String text;

    public String getText(){
        return text;
    }
    public void setText(String newText){
        this.text = newText;
    }
}
