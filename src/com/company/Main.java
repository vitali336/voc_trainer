package com.company;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ArrayList<Vocabulary> vocabularies = new ArrayList<Vocabulary>();
        vocabularies.add(new Vocabulary("Tisch", "table"));
        vocabularies.add(new Vocabulary("Apfel", "apple"));
        vocabularies.add(new Vocabulary("Hund", "dog"));

        String filename = "vocabularies.ser";

        // save the object to file
        FileOutputStream fos = null;
        ObjectOutputStream out = null;
        try {
            fos = new FileOutputStream(filename);
            out = new ObjectOutputStream(fos);
            out.writeObject(vocabularies);

            out.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        // read the object from file
        // save the object to file
        FileInputStream fis = null;
        ObjectInputStream in = null;
        try {
            fis = new FileInputStream(filename);
            in = new ObjectInputStream(fis);
            vocabularies = (ArrayList<Vocabulary>) in.readObject();
            System.out.println(vocabularies);
            in.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
