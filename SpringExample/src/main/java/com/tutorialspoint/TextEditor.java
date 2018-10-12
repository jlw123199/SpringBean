package com.tutorialspoint;

import org.springframework.beans.factory.annotation.Autowired;

public class TextEditor {

    @Autowired
    private SpellChecker spellChecker;

//    private String name;

//    @Autowired
//    public void setSpellChecker( SpellChecker spellChecker ){
//        this.spellChecker = spellChecker;
//    }

    public SpellChecker getSpellChecker() {
        return spellChecker;
    }
//    public void setName(String name) {
//        this.name = name;
//    }
//    public String getName() {
//        return name;
//    }
    public void spellCheck() {
        spellChecker.checkSpelling();
    }
}
