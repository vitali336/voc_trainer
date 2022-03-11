package com.company;

import java.io.*;
import java.util.ArrayList;

public class Main {

    public static VocabularyList readList(String filename){
        FileInputStream fis = null;
        ObjectInputStream in = null;
        try {
            fis = new FileInputStream(filename);
            in = new ObjectInputStream(fis);
            VocabularyList vocabularyList = (VocabularyList) in.readObject();
            in.close();
            return vocabularyList;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }

    public static void writeList(String filename, VocabularyList vocabularyList){
        // save the object to file
        FileOutputStream fos = null;
        ObjectOutputStream out = null;
        try {
            fos = new FileOutputStream(filename);
            out = new ObjectOutputStream(fos);
            out.writeObject(vocabularyList);
            out.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) {

        VocabularyList vocabularyList;
        String filename = "vocabularies.ser";

        String input = "";
        String input_de = "";
        String input_en = "";

        java.io.BufferedReader in_ = new BufferedReader(new InputStreamReader(System.in));

        do {
            vocabularyList = readList(filename);

            System.out.print("Show Vocabulary-List (1) " + '\n'
                + "Add Vocabulary (2)" + '\n');
            try{
                input = in_.readLine();
            }catch (Exception e){
                e.printStackTrace();
            }

            if(input.equals("1"))
            {
                System.out.println(vocabularyList);

            }else if(input.equals("2")){
                try{
                    System.out.print("Deutsch: ");
                    input_de = in_.readLine();
                    System.out.print("Englisch: ");
                    input_en = in_.readLine();
                }catch (Exception e){
                    e.printStackTrace();
                }

                vocabularyList.addVocabulary(new Vocabulary(input_de, input_en));
                writeList(filename, vocabularyList);
            }

        }while (!input.equals("close"));
    }
}
