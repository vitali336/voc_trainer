package com.company;

import java.io.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here

        VocabularyList vocabularyList = new VocabularyList();

        //vocabularyList.addVocabulary(new Vocabulary("Tisch", "table"));
        //vocabularyList.addVocabulary(new Vocabulary("Apfel", "apple"));
        //vocabularyList.addVocabulary(new Vocabulary("Hund", "dog"));

        String filename = "vocabularies.ser";

        String input = "";

        String input_de = "";
        String input_en = "";

        java.io.BufferedReader in_ = new BufferedReader(new InputStreamReader(System.in));

        do {
            System.out.print("Show Vocabulary-List (1) " + '\n'
                + "Add Vocabulary (2)" + '\n');
            try{
                input = in_.readLine();
            }catch (Exception e){
                e.printStackTrace();
            }

            if(input.equals("1"))
            {

                FileInputStream fis = null;
                ObjectInputStream in = null;
                try {
                    fis = new FileInputStream(filename);
                    in = new ObjectInputStream(fis);
                    vocabularyList = (VocabularyList) in.readObject();
                    System.out.println(vocabularyList);
                    in.close();
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }else if(input.equals("2")){


                FileInputStream fis = null;
                ObjectInputStream in = null;
                try {
                    fis = new FileInputStream(filename);
                    in = new ObjectInputStream(fis);
                    vocabularyList = (VocabularyList) in.readObject();
                    in.close();
                } catch (Exception ex) {
                    ex.printStackTrace();
                }

                try{
                    System.out.print("Deutsch: ");
                    input_de = in_.readLine();
                    System.out.print("Englisch: ");
                    input_en = in_.readLine();

                }catch (Exception e){
                    e.printStackTrace();
                }

                vocabularyList.addVocabulary(new Vocabulary(input_de, input_en));

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
        }while (!input.equals("close"));





        // read the object from file
        // save the object to file

    }
}
