package com.company;

import java.io.Serializable;
import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vocabulary that = (Vocabulary) o;
        return Objects.equals(german, that.german) && Objects.equals(english, that.english);
    }

    @Override
    public int hashCode() {
        return Objects.hash(german, english);
    }
}
