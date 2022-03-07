package com.company;

import java.io.Serializable;

public class Vocabulary implements Serializable {

    private String german = "";
    private String english = "";

    public Vocabulary (String german, String english){
        this.german = german;
        this.english = english;
    }

    @Override
    public String toString() {
        return "Deutsch = '" + german + '\'' + " | " +
                "Englisch = '" + english + '\'' +
                '\n';
    }
}
