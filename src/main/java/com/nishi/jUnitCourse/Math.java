package com.nishi.jUnitCourse;

public class Math {

    Reader reader;

    public Math(Reader reader){
         this.reader = reader;
    }

    public int add(int number1, int number2) {
        return number1 + number2;
    }

    public boolean isUserSelectionEven() {
        int userSelection = reader.userSelection();
        return (userSelection % 2 == 0) ? true : false;
    }
}
