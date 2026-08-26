package com.diegomartinez.system.utils;

public class Validations {

    public Validations() {

    }
    
    public Boolean validateTextEmpty(String text) {
        boolean isEmpty = false;
        if(text.isEmpty() == true || text.isBlank() == true) {
            isEmpty = true;
        }
        return isEmpty;
    }
    
    public Boolean validateTextLength(String text, int textMax) {
        return text.length()<=textMax;
    }
}
