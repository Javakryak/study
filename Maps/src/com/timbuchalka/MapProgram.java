package com.timbuchalka;

import java.util.HashMap;
import java.util.Map;

public class MapProgram {

    public static void main(String[] args) {
        Map<String, String> languages = new HashMap<>();
        languages.put("Java", "a compiled high level, object-oriented, platform independent language");
        languages.put("Python", "an interpreted, object-oriented, high level programing language with dynamic semantics");
        languages.put("Algol", "an algorithmic language");
        languages.put("BASIC", "Beginners all purpose Symbolic Instruction Code");
        languages.put("Lisp", "THerein lies madness");

        if(languages.containsKey("Java")){
            System.out.println("Java is already in the map");
        } else {
            languages.put("Java", "pa-pa-pa");
        }

        System.out.println("=================================================");

        languages.remove("Lisp");
        if(languages.remove("Algol", "a family of algorithmic languages")){
            System.out.println("Algol removed");
        } else {
            System.out.println("Algol not removed, key-value pair not found");
        }

        if(languages.replace("Lisp", "This will not work","a functional progg")) {
            System.out.println("Lisp replaced");
        } else {
            System.out.println("Lisp was not replaced");
        }

        for (String key : languages.keySet()){
            System.out.println(key + " : " + languages.get(key));
        }


    }
}
