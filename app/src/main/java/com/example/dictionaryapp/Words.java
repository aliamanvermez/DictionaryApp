package com.example.dictionaryapp;

public class Words {

    private int word_id;
    private String turkish;
    private String english;

    public Words () {

    }

    public Words(int word_id, String turkish, String english) {
        this.word_id = word_id;
        this.turkish = turkish;
        this.english = english;
    }

    public int getWord_id() {
        return word_id;
    }

    public void setWord_id(int word_id) {
        this.word_id = word_id;
    }

    public String getTurkish() {
        return turkish;
    }

    public void setTurkish(String turkish) {
        this.turkish = turkish;
    }

    public String getEnglish() {
        return english;
    }

    public void setEnglish(String english) {
        this.english = english;
    }
}
