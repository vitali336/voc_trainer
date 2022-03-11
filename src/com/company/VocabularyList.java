package com.company;

import java.io.Serializable;
import java.util.ArrayList;

public class VocabularyList implements Serializable {

    private ArrayList<Vocabulary> vocabularies = new ArrayList<Vocabulary>();

    public void addVocabulary(Vocabulary vocabulary){
        this.vocabularies.add(vocabulary);
    }
    public void removeVocabulary(Vocabulary vocabulary) {this.vocabularies.remove(vocabulary);}
    public boolean containsVocabulary(Vocabulary vocabulary) {return this.vocabularies.contains(vocabulary);}

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
