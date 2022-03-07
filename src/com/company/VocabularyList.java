package com.company;

import java.io.Serializable;
import java.util.ArrayList;

public class VocabularyList implements Serializable {

    private ArrayList<Vocabulary> vocabularies = new ArrayList<Vocabulary>();

    public void addVocabulary(Vocabulary vocabulary){
        this.vocabularies.add(vocabulary);
    }

    @Override
    public String toString() {

        String result = "";
        for (Vocabulary vocabulary: vocabularies
             ) {
            result += vocabulary;
        }
        return result;
    }
}
