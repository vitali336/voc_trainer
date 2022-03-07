package com.company;

import java.io.Serializable;

public class Vocabulary implements Serializable {

    String german = "";
    String english = "";

    public Vocabulary (String german, String english){
        this.german = german;
        this.english = english;
    }
}
